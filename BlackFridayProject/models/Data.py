from time import gmtime as sysdata
class Data:
	__dia = None
	__mes = None
	__ano = None
	
	__nomes_por_extenso = ["Janeiro","Fevereiro"\
	,"Marco","Abril","Maio","Junho","Julho","Agosto"\
	,"Setembro","Outubro","Novembro","Dezembro"]
	
	def __init__(self,dia=None,mes=None,ano=None):
		self.__dia = int(dia)
		self.__mes = int(mes)
		self.__ano = int(ano)
		self.isValid()
	
	def toExtenseString(self):
		return (str(self.__dia)+ " de "+self.__nomes_por_extenso[self.__mes-1] + " de "+str(self.__ano))
		
	def toString(self):
		return str(self.__dia)+"/"+str(self.__mes)+"/"+str(self.__ano)
		
	def parseFromString(string):
		valores = string.split("/")
		return Data(valores[0],valores[1],valores[2])
		
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
		
	def getSystemData():
		return Data(int(sysdata().tm_mday),int(sysdata().tm_mon),int(sysdata().tm_year))
		
	def getDia(self):
		return self.__dia
	def getMes(self):
		return self.__mes
	def getAno(self):
		return self.__ano
		
	def isValid(self):
		if self.__dia == None or self.__mes == None or self.__ano == None:
			return False
		if (self.__dia > 31 or self.__dia <= 0):
			return False
		if (self.__mes > 12 or self.__mes <= 0):
			return False
		if (self.__ano <= 0):
			return False
		return True
		