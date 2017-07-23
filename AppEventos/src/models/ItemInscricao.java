package models;

public class ItemInscricao
{
	private int inscricaoId;
	private int atividadeId;
	private float precoItem;
	
	public ItemInscricao(){
		
	}
	
	public ItemInscricao(int inscricaoId,int codAtividade,float preco){
		
		this.inscricaoId = inscricaoId;
		this.atividadeId = codAtividade;
		this.precoItem = preco;
		
	}
	
	// getters
	
	public int getCodigoInscricao(){
		return this.inscricaoId;
	}
	
	public int getCodigoAtividade(){
		return this.atividadeId;
	}
	
	public float getPrecoItem(){
		return this.precoItem;
	}
	
	
}
