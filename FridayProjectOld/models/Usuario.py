import models.Hash as Hash

class Usuario():
	## atributos (inicializados com None)
	__nome = None
	__codigo_usuario = None
	__contato = None
	__data_nasc = None
	__interesses = [None]
	
	## construtor default
	def __init__(self,nome,contato,data_nasc):
		self.__nome = nome
		self.__contato = contato
		self.__data_nasc = data_nasc
		self.__codigo_usuario = Hash.generateHash()
		
	## getters
	def getNome(self):
		return self.__nome
		
	def getCodigo(self):
		return self.__codigo_usuario
		
	def getContato(self):
		return self.__contato
		
	def getData(self):
		return self.__data_nasc
		
	## setters
	
	def setHashCode(self,hash):
		self.__codigo_usuario = hash
		
	## retorna um Usuario de uma string
	def parseFromString(string):
		val = string.split(",")
		usuario = Usuario(val[0],val[1],Data.paseFromDateString(val[2]))
		usuario.setHashCode(val[3])
		return usuario
		
		
	## retorna string CSV do objeto em questao
	def toCSVString(self): 
		return self.__nome +","+ self.__contato +","+ self.__data_nasc.toString() +","+\
		self.__codigo_usuario
		
		
	## adiciona uma palavra-chave em interesses do usuario
	def addInteresse(self,string):
		self.__interesses.append(string)
		
	
		