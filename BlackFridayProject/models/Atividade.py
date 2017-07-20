import models.Hash as Hash
from models.Tipo_Atividade import TipoAtividade
from models.Data import Data

class Atividade:
	## atributos
	
	__codigo_atividade = None
	__codigo_evento = None
	__nome = None
	__descricao = None
	__tipo = None
	__preco = None
	__data = None
	
	## construtor default
	def __init__(self,nome,descricao,preco,codigo_evento):
		self.__nome = nome
		self.__descricao = descricao
		self.__preco = preco
		self.__data = Data.getSystemData()
		self.__codigo_evento = codigo_evento
		self.__codigo_atividade = Hash.generateHash()

	## getters
	def getNome(self):
		return self.__nome
	def getDescricao(self):
		return self.__descricao
	def getTipo(self):
		return self.__tipo
	def getPreco(self):
		return self.__preco
	def getData(self):
		return self.__data
	def getCodigoEvento(self):
		return self.__codigo_evento
	def getCodigoAtividade(self):
		return self.__codigo_atividade

	## setters

	def setCodigoAtividade(self,cod):
		self.__codigo_atividade = cod
	def setCodigoEvento(self,cod):
		self.__codigo_evento = cod


	## metodo para gerar CSV do objeto em questao

	def toCSVString(self):  ## ordem: nome,descricao,preco,data,codigo

		return self.__nome +","+ self.__descricao +","+ str(self.__preco) +","+ self.__data.toString() +","+\
		self.__codigo_atividade +","+ self.__codigo_evento

	## metodo para gerar objeto da CSV em questao

	def parseFromString(string):  ## ordem: nome,descricao,preco,data,codigo

		v = string.split(",")
		atividade = Atividade(v[0],v[1],v[2],Data.parseFromDateString(v[3]))
		atividade.setCodigoAtividade(v[4])
		atividade.setCodigoEvento(v[5])
		return atividade
		

	


