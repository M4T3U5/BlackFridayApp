package models;

public class Tag
{
	private String id;
	private String descricao;
	private int qtdEventos;
	
	public Tag(String descricao,int qtdEventos){
		
		this.id = Hash.generateStringHash(30);
		this.descricao = descricao;
		this.qtdEventos = qtdEventos;
	}
	
	public Tag(String descricao,int qtdEventos, String hash) throws IllegalArgumentException{
		
		if (hash.equals(null) || hash.length() < 30) throw new IllegalArgumentException();
		
		this.id = hash;
		this.descricao = descricao;
		this.qtdEventos = qtdEventos;
	}
	
	// getters
	
	public String getId(){
		return this.id;
	}
	
	public String getDescricao(){
		return this.descricao;
	}
	
	public int getQuantidadeEventos(){
		return this.qtdEventos;
	}
	
	// setters
	
	// getters

	public void setId(String id){
		this.id = id;
	}

	public void setDescricao(String descricao){
		this.descricao = descricao;
	}

	public void setQuantidadeEventos(int qtd){
		this.qtdEventos = qtd;
	}
	
	// incrementar e decrementar qtdEventos em 1 unidade
	
	public void qtdEventosIncrease(){
		this.qtdEventos += 1;
	}
	public void qtdEventosDerease() throws IllegalArgumentException{
		if (this.qtdEventos == 0) throw new IllegalArgumentException();
		this.qtdEventos -= 1;
	}
}
