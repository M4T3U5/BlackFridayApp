from Models.Hash import Hash
class Instituicao:
	
	__nome = None
	__descricao = None
	__codigo_instituicao = None
	__website = None
	
	def __init__(self,nome,desc,website):
		__nome = nome
		__descricao = desc
		__website = website
		__codigo_instituicao = Hash.generateHash()
		
	def getNome(self):
		return self.__nome
	def getDescricao(self):
		return self.__descricao
	def getCodigoInstituicao(self):
		return self.__codigo_instituicao
	def getWebsite(self):
		return self.__website
		
	def parseFromString(string):
		val = string.split(",")
		i = Instituicao(val[0],val[1],val[2])
		i.__codigo_instituicao = val[3]
		return i
		
		