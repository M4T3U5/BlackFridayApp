import models.Hash as Hash
from models.Data import Data

class Inscricao:
	## atributos
	codigo_inscricao = None
	codigo_usuario = None
	valor_total = None
	estado_atual (paga ou nao) = None
	data_inscricao = None
	data_de_pagamento = None
	atividades_inscritas = [None]
	
	## construtor default
	def __init__(self,codigo_usuario):
		self.__codigo_inscricao = Hash.generateHash(15)
		self.__codigo_usuario = codigo_usuario
		self.__estado_atual = False
		self.__data_inscricao = Data.getSystemData()
		
		
	## getters
	
	def getCodigoInscricao(self):
		return self.__codigo_inscricao
	
	def getCodigoUsuario(self):
		return self.__codigo_usuario
		
	def getValorTotal(self):
		return self.__valor_total
		
	def getEstadoAtual(self):
		return self.__estado_atual
		
	def getDataInscricao(self):
		return self.__data_inscricao
		
	def getDataPagamento(self):
		return self.__data_de_pagamento
		
	def getAtividades(self):
		return self.__atividades_inscritas
		
	
	## setters
	
	def setCodigoInscricao(self,cod):
		self.__codigo_inscricao = cod
	
	def setCodigoUsuario(self,cod):
		self.__codigo_usuario = cod
		
	def setValorTotal(self,valor):
		self.__valor_total = double(valor)
		
	def setEstadoAtual(self,estado):
		self.__estado_atual = bool(estado)
		
	def setDataInscricao(self,data):
		self.__data_inscricao = Data.parseFromDateString(data)
		
	def setDataPagamento(self,data):
		self.__data_de_pagamento = Data.parseFromDateString(data)
	
	
	## metodo para gerar string CSV do objeto
	def toCSVString(self):
		return str(self.__codigo_usuario) +","+ str(self.__codigo_inscricao) +","+ str(self.__valor_total) +","+\
		self.__estado_atual +","+ self.__data_inscricao.toString +","+ self.__data_de_pagamento.toString()
		
	## metodo para gerar objeto da string CSV
	def parseFromString(string):
		v = string.split(",")
		
		i = Inscricao(v[0])
		i.setCodigoInscricao(v[1])
		i.setValorTotal(v[2])
		i.setEstadoAtual(v[3])
		i.setDataInscricao(v[4])
		i.setDataPagamento(v[5])
		
		return i
	## metodo para adicionar uma atividade a inscricao
	def adicionaAtividade(self,atividade):
		self.__atividades_inscritas.append(atividade)
		self.__valor_total = self.__calculaValorTotal()
		
	## metodo para calcular o valor total da inscricao
	def calculaValorTotal(self):
		valor_calculado = 0
		
		if (len(self.__atividades_inscritas) == 0):
			return valor_calculado
			
		else:
			for (atividade in self.__atividades_inscritas):
				
				valor_calculado += atividade.getPreco()
				
			return valor_calculado
		
	## metodo para confirmar o pagamento de uma inscricao
	def efetuaPagamentoInscricao(self):
		
		self.__data_de_pagamento = Data.getSystemData()
		self.__estadoAtual = True