import models.Hash as Hash

class Usuario():
	__nome = None
	__codigo_usuario = None
	__contato = None
	__data_nasc = None
	__interesses = [None]
	
	def __init__(self,nome,contato,data_nasc):
		self.__nome = nome
		self.__data_nasc = data_nasc
		self.__codigo_usuario = Hash.generateHash()
		
	def getNome(self):
		return self.__nome
		
	def getCodigo(self):
		return self.__codigo_usuario
		
	def getContato(self):
		return self.__contato
		
	def getData(self):
		return self.__data_nasc
		
	def parseFromString(string):
		return Usuario(string,string,string)
		