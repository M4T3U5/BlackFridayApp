package models;
import  enumeretions.*;

public class Relacionameto
{
	
	private int id;
	private String descricao;
	private int codEvento;
	private int codInstituicao;
	private int tipoRelacionamento;
	
	public Relacionameto(){
		
	}
	
	public Relacionameto(String descricao, int codEvento,int codInstuicao, int tipo){
		
		this.id = Hash.generateLongIntHash(10);
		this.descricao = descricao;
		this.codEvento = codEvento;
		this.codInstituicao = codInstuicao;
		this.tipoRelacionamento = tipo;
	}
	
	
	
	// getters
	
	public int getId(){
		return this.id;
	}
	
	public String getDescricao(){
		return this.descricao;
	}
	
	public int getCodEvento(){
		return this.codEvento;
	}
	
	public int getCodigoInstituicao(){
		return this.codInstituicao;
	}
	
	public int getTipo(){
		return this.tipoRelacionamento;
	}	
}
