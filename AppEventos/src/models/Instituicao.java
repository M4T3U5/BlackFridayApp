package models;

public class Instituicao
{
	private int id;
	private String nome;
	private String urlLogo;
	
	public Instituicao(){
		
	}
	
	public Instituicao(String nome,String logoUrl){
		
		this.id = Hash.generateLongIntHash(20);
		this.nome = nome;
		this.urlLogo = logoUrl;
	}
	
	
	// getters 
	
	public int getId(){
		return this.id;
	}
	
	public String getNome(){
		return this.urlLogo;
	}
	
	public String getUrlLogo(){
		return this.urlLogo;
	}
}
