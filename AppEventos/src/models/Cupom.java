package models;
import java.util.*;

public class Cupom
{
	private int id;
	private String nome;
	private String codigoUrl ;
	private int percentual;
	private int codigoEvento;
	private Date dataVencimento;
	private boolean hasUsed;
	
	public Cupom(){
		
	}
	
	public Cupom(String nome, String codigoUrl,int percentual, int codigoEvento,Date data){
		
		this.nome = nome;
		this.codigoUrl = codigoUrl;
		this.percentual = percentual;
		this.dataVencimento = data;
		this.id = Hash.generateLongIntHash(20);
		this.codigoEvento = codigoEvento;
		this.hasUsed = false;
	}
	
	// getters
	
	public int getId(){
		return this.id;
	}
	public String getNome(){
		return this.nome;
	}
	public String getCodigoUrl(){
		return this.codigoUrl;
	}
	public int getPercentual(){
		return this.percentual;
	}
	public int getCodigoEvento(){
		return this.codigoEvento;
	}
	public Date getData(){
		return this.dataVencimento;
	}
	public boolean hasUsed(){
		return this.hasUsed;
	}
	
	
}
