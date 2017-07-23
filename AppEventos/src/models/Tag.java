package models;

public class Tag
{
	private int id;
	private String descricao;
	private int qtdEventos;
	
	public Tag(String descricao,int qtdEventos){
		
		this.id = Hash.generateLongIntHash(30);
		this.descricao = descricao;
		this.qtdEventos = qtdEventos;
	}
	
	// getters
	
	public int getId(){
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

	void setId(int id){
		this.id = id;
	}

	void setDescricao(String descricao){
		this.descricao = descricao;
	}

	void setQuantidadeEventos(int qtd){
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
