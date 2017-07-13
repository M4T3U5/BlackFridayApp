from data import *

def main():
	
	d1 = Data(31,9,1998)
	d2 = Data(33,3,0)
	d2.parseFromString("09/09/1998")
	
	print(d1.toString())
	print(d2.toString())
	print(d1.compareTo(d2))
main()