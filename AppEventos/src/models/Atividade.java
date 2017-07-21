package models;

public class Atividade
{
	
	private String id;
	private String idEvento;
	private float precoAtividade;
	private String descricao;
	private int tipoAtividade;
	
	
	public Atividade(String idEvento,float precoAtividade,String descricao,int tipoAtividade){
		
		// TODO o id pode ter como prefixo os N primeiros caracteres do idEvento correspondente
		// para padronizar todas as atividades de um evento
		this.id = Hash.generateStringHash(10);
		
		this.idEvento = idEvento;
		this.precoAtividade = precoAtividade;
		this.descricao = descricao;
		this.tipoAtividade = tipoAtividade;
		
	}
	
	
	// getters 
	
	public String getId(){
		return this.id;
	}
	
	public String getIdEvento(){
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
	
	public void setId(String id){
		this.id = id;
	}

	public void setIdEvento(String idEvento){
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

