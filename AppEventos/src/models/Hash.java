package models;
import java.util.*;
import java.util.concurrent.*;

public class Hash
{
	static String hash;
	
	public static String generateStringHash(int hashLenght){
		hash = "";
		for(int i = 0; i < hashLenght; i++){
			
			// esse metodo gera um inteiro no range especificado
			int indice = ThreadLocalRandom.current().nextInt(65,90);
			// 65 a 90, letras A - Z na tabela ASCII
			
			
			// adiciona a letra correspondente a string hash
			hash += (char)indice;
		}
		return hash;
	}
}
