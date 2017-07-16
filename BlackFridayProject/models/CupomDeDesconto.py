import models.Hash as Hash
class CupomDeDesconto:
	
	__codigo = None
	__percentual = None
	__data_validade = None
	__estado = None
	
	
	def __init__(self,perc,data,stat):
		self.__codigo = Hash.generateHash(15)
		self.__percentual = perc
		self.__data_validade = data
		self.__estado = stat
		
	def getCodigo(self):
		return self.codigo
		
	def getPercentual(self):
		return self.__percentual
		
	def getDataValidade(self):
		return self.data_validade
		
	def getEstado(self):
		return self.__estado
		
	def setHash(self,hash):
		self.__codigo = hash
		
	def parseFromString(string):
		v = string.split(",")
		c = CupomDeDesconto(v[0],v[1],v[2])
		c.setCodigo(v[3])
		return c
		
		
	def toCSVString(self):
		return str(self.__percentual)+","+self.__data_validade.toString()+","+self.__estado\
		+","+self.__codigo
		
	
		