package models;

public class Instituicao
{
	private String id;
	private String nome;
	private String urlLogo;
	
	public Instituicao(String nome,String logoUrl){
		
		this.id = Hash.generateStringHash(20);
		this.nome = nome;
		this.urlLogo = logoUrl;
	}
	
	// sobrrcarga de construtor para teste ORM
	
	public Instituicao(String nome,String logoUrl, String id){
		
		if (id.equals(null) || id.length() < 20) throw new IllegalArgumentException();
		
		this.id = id;
		this.nome = nome;
		this.urlLogo = logoUrl;
	}
	
	// getters 
	
	public String getId(){
		return this.id;
	}
	
	public String getNome(){
		return this.urlLogo;
	}
	
	public String getUrlLogo(){
		return this.urlLogo;
	}
}
