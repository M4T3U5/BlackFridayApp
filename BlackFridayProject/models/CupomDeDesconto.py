import models.Hash as Hash
class CupomDeDesconto:
	
	__codigo_cupom = None
	__codigo_evento
	__percentual = None
	__data_validade = None
	__estado = None
	
	
	def __init__(self,codigo_evento,perc,data):
		self.__codigo_cupom = Hash.generateHash(15)
		self.__codigo_evento = codigo_evento()
		self.__percentual = perc
		self.__data_validade = data
		self.__estado = True
		
	def getCodigoCupom(self):
		return self.codigo_cupom
		
	def getCodigoEvento(self):
		return self.codigo_evento
		
	def getPercentual(self):
		return self.__percentual
		
	def getDataValidade(self):
		return self.data_validade
		
	def getEstado(self):
		return self.__estado
		
	def setCodigoCupom(self,cod):
		self.__codigo = cod
		
	def parseFromString(string):
		v = string.split(",")
		c = CupomDeDesconto(v[0],int(v[1]),v[2])
		c.setCodigo(v[3])
		return c
		
		
	def toCSVString(self):
		return str(self.__percentual)+","+self.__data_validade.toString()+","+self.__estado\
		+","+self.__codigo
		
	
		