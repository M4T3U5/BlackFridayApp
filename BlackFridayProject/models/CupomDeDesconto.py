from models.Hash import Hash

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