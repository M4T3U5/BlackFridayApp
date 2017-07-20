from random import randint as rand

def generateHash(tamanho=10):
	gerado = ""
		
	for i in range(tamanho):
			
		gerado += chr(rand(65,90))
			
	return gerado

def generateIntHash(tamanho=10):
	gerado = ""
		
	for i in range(tamanho):
			
		gerado += str(rand(0,9))
			
	return int(gerado)
	