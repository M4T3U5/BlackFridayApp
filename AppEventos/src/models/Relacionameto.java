package models;
import enum.*;

public class Relacionameto
{
	
	private String id;
	private String descricao;
	private String codEvento;
	private String codInstituicao;
	private TipoRelacionamento tipoRelacionamento;
	
	public Relacionameto(String descricao, String codEvento,String codInstuicao, TipoRelacionamento tipo){
		
		this.id = Hash.generateStringHash(10);
		this.descricao = descricao;
		this.codEvento = codEvento;
		this.codInstituicao = codInstuicao;
		this.tipoRelacionamento = tipo;
	}
	
	public Relacionameto(String descricao, String codEvento,String codInstuicao, TipoRelacionamento tipo, String id){

		this.id = id;
		this.descricao = descricao;
		this.codEvento = codEvento;
		this.codInstituicao = codInstuicao;
		this.tipoRelacionamento = tipo;
	}
	
	// getters
	
	public String getId(){
		return this.id;
	}
	
	public String getDescricao(){
		return this.descricao;
	}
	
	public String getCodEvento(){
		return this.codEvento;
	}
	
	public String getCodigoInstituicao(){
		return this.codInstituicao;
	}
	
	public TipoRelacionamento getTipo(){
		return this.tipoRelacionamento;
	}	
}
