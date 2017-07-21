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
	
	public static long generateLongIntHash(int hashLenght){
		hash = "";
		for(int i = 0; i < hashLenght; i++){
			// esse metodo gera um inteiro no range especificado
			int numero = ThreadLocalRandom.current().nextInt(0,9);

			// adiciona a string do numero na string hash
			hash += (String.valueOf(numero));
		}
		return Long.parseLong(hash);
	}
	
	
}
