class Data:
	__dia = None
	__mes = None
	__ano = None
	
	def __init__(self,dia=None,mes=None,ano=None):
		try:
			self.__dia = int(dia)
			self.__mes = int(mes)
			self.__ano = int(ano)
			self.isValid()
		except:
			raise("except")
		
	def toString(self):
		return str(self.__dia)+"/"+str(self.__mes)+"/"+str(self.__ano)
		
	def parseFromString(self,string):
		valores = string.split("/")
		self.__dia = int(valores[0])
		self.__mes = int(valores[1])
		self.__ano = int(valores[2])
		self.isValid()
		
	def compareTo(self,data2):
		if self.__ano > data2.__ano:
			return 1
		if self.__ano < data2.__ano:
			return -1
		if self.__ano == data2.__ano and self.__mes > data2.__mes:
			return 1
		if self.__ano == data2.__ano and self.__mes < data2.__mes:
			return -1
		if self.__ano == data2.__ano and self.__mes == data2.__mes and self.__dia > data2.__dia:
			return 1
		if self.__ano == data2.__ano and self.__mes == data2.__mes and self.__dia < data2.__dia:
			return -1
		
		return 0
		
	def getDia(self):
		return self.__dia
	def getMes(self):
		return self.__mes
	def getAno(self):
		return self.__ano
		
	def isValid(self):
		if (self.__dia > 31 or self.__dia <= 0):
			print("dia invalido")
		if (self.__mes > 12 or self.__mes <= 0):
			print("mes invalido")
		if (self.__ano <= 0):
			print("ano invalido")
		