package models;
import java.util.*;

public class Cupom
{
	private long id;
	private String nome;
	private String codigoUrl;
	private int percentual;
	private Date dataVencimento;
	private boolean hasUsed;
	
	
	public Cupom(String nome, String codigoUrl,int percentual,Date data){
		
		this.nome = nome;
		this.codigoUrl = codigoUrl;
		this.percentual = percentual;
		this.dataVencimento = data;
		this.id = Hash.generateLongIntHash(20);
		this.hasUsed = false;
	}
	
	// getters
	
	public long getId(){
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
	public Date getData(){
		return this.dataVencimento;
	}
	public boolean hasUsed(){
		return this.hasUsed;
	}
	
	
}
