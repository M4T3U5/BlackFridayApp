#coding:utf-8
from models.Usuario import *
from models.Data import *

def main():
	p1 = Usuario("matt","12345678","09/09/1998")
	p2 = Usuario.parseFromString("abc")
	d1 = Data.parseFromString("01/02/2003")
	print(p2.getNome())
	print(d1.toExtenseString())
	d2 = Data.getSystemData()
	print(d2.toExtenseString())
	
	print(p1.getCodigo())
	print(type(p1))
	print(dir(Data.getSystemData()))
	
main()