package models;
import enums.*;

public class Atividade
{
	
	private int id;
	private int idEvento;
	private float precoAtividade;
	private String descricao;
	private int tipoAtividade;
	
	
	private TipoAtividade tipo;
	
	public Atividade(){
		
	}
	
	public Atividade(int idEvento,float precoAtividade,String descricao,int tipoAtividade){
		
		// TODO o id pode ter como prefixo os N primeiros caracteres do idEvento correspondente
		// para padronizar todas as atividades de um evento
		this.id = Hash.generateLongIntHash(10);
		
		this.idEvento = idEvento;
		this.precoAtividade = precoAtividade;
		this.descricao = descricao;
		this.tipoAtividade = tipoAtividade;
	}
	// getters 
	
	public int getId(){
		return this.id;
	}
	
	public int getIdEvento(){
		return this.idEvento;
	}
	
	public float getPrecoAtividade(){
		return this.precoAtividade;
	}
	
	public String getDescricao(){
		return this.descricao;
	}
	
	public int getTipoAtividade(){
		return this.tipoAtividade;
	}
	
	// setters
	
	public void setId(int id){
		this.id = id;
	}

	public void setIdEvento(int idEvento){
		this.idEvento = idEvento;
	}

	public void setPrecoAtividade(float valor){
		this.precoAtividade = valor;
	}

	public void setDescricao(String descricao){
		this.descricao = descricao;
	}

	public void setTipoAtividade(int tipo){
		this.tipoAtividade = tipo;
	}
	
}

