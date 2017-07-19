from models.Hash import Hash

class Atividade:
	## atributos
	__nome = None
	__descricao = None
	__preco = None
	__data = None
	__codigo = None
	
	## construtor default
	def __init__(self,nome,descricao,preco,data):
		self.__nome = nome
		self.__descricao = descricao
		self.__preco = preco
		self.__data = data
		self.__codigo = Hash.generateIntHash()

	## getters
	def getNome(self):
		return self.__nome
	def getDescricao(self):
		return self.__descricao
	def getPreco(self):
		return self.__preco
	def getData(self):
		return self.__data
	def getCodigo(self):
		return self.__codigo

	## setters

	def setCodigo(self,cod):
		self.__codigo = cod


	## metodo para gerar CSV do objeto em questao

	def toCSVString(self):  ## ordem: nome,descricao,preco,data,codigo

		return self.__nome +","+ self.__descricao +","+ str(self.__preco) +","+ self.__data.toString() +","+\
		self.__codigo

	## metodo para gerar objeto da CSV em questao

	def parseFromString(string):  ## ordem: nome,descricao,preco,data,codigo

		v = string.split(",")
		atividade = Atividade(v[0],v[1],v[2],v[3])
		atividade.setCodigo(v[4])

	


