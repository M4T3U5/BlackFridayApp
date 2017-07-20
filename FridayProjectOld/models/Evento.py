import models.Hash as Hash
from models.Data import Data
from models.Tipo_Atividade import TipoAtividade
class Evento:
	
	__nome = None
	__descricao = None
	__usuario = None
	__codigo = None
	__data_criacao = Data()
	__data_inicio = Data()
	__data_fim = Data()
	__interesses = [None]
	__estado_atual = None
	
	estados = {1:"novo",2:"inscricoes abertas",3:"em andamento",4:"finalizado"}
	
	def __init__(self,nome,descricao,usuario,data_inicio,data_fim):
		self.__nome = nome
		self.__descricao = descricao
		self.__usuario = usuario
		self.__codigo = Hash.generateHash()
		self.__data_inicio = data_inicio
		self.__data_fim = data_fim
		self.__data_criacao = Data.getSystemData()
		self.__estado_atual = 1
		self.__interesses ["None"]
		
	def getNome():
		return self.__nome
	def getDescricao():
		return self.__descricao
	def getUsuario():
		return self.__usuario
	def getCodigo():
		return self.__codigo
	def getDataInicio():
		return self.__data_inicio
	def getDataCriacao():
		return self.__data_criacao
	def getDataFim():
		return self.__data_fim
	def getEstado():
		return self.__atual
	def getInteresses():
		return self.__interesses
	
	def __setDataCriacao(self,data):
		self.__dataCriacao = data
	def __setEstado(self,estado):
		self.__estado = estado
	def setInteresses(self,interesses):
		self.__interesses = interesses
	
	def toCSVString(self):
		return (self.__nome + "," + self.__descricao + "," + self.__usuario +","+ self.__codigo + ","\
		self.__data_inicio.toString() + "," + self.__data_fim.toString() + ","\
		self.__data_criacao.toString() + "," +self.__estado +"," + self.__interesses)
		
	def parseFromStrig(string):
		v = string.split(",")
		evento = Evento(v[0],v[1],v[2],Data.parseFromString(v[3]),Data.parseFromString(v[4]))
		evento.setDataCriacao(v[5])
		evento.setEstado(v[6])
		evento.setInteresses(v[7])
		return evento
	
		
		
		