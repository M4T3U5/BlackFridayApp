from models.Hash import Hash

class Atividade:
	__nome = None
	__descricao = None
	__preco = None
	__data = None
	__codigo = None
	
	def __init__(self,nome,descricao,preco,data):
		self.__nome = nome
		self.__descricao = descricao
		self.__preco = preco
		self.__data = data
		self.__codigo = Hash.generateIntHash()
	def getNome(self):
		return self.__nome
	def getDescricao(self):
		return self.__descricao
	def getPreco(self):
		return self.__preco
	def getData(self):
		return self.__data
	