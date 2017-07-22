package models;

public class ItemInscricao
{
	private String inscricaoId;
	private String atividadeId;
	private float precoItem;
	
	public ItemInscricao(String inscricaoId,String codAtividade,float preco){
		
		this.inscricaoId = inscricaoId;
		this.atividadeId = codAtividade;
		this.precoItem = preco;
		
	}
	
	// getters
	
	public String getCodigoInscricao(){
		return this.inscricaoId;
	}
	
	public String getCodigoAtividade(){
		return this.atividadeId;
	}
	
	public float getPrecoItem(){
		return this.precoItem;
	}
	
	
}
