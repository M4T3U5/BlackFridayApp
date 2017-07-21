package models;
import java.util.*;
import interfaces.*;

public class Inscricao implements Calculavel
{
	
	private String inscricaoId;
	private String userId;
	private Date dataInscricao;
	private float valorTotal;
	
	public Inscricao(String userId,Date dataInscricao){
			
		this.inscricaoId = Hash.generateStringHash(30);
		this.userId = userId;
		this.dataInscricao = dataInscricao;
		this.valorTotal = (0);
		
	}
	
	// getters
	
	public String getInscricaoId(){
		return this.inscricaoId;
	}
	public String getUserId(){
		return this.userId;
	}
	public Date getDataInscricao(){
		return this.dataInscricao;
	}
	public String getValorTotal(){
		return this.inscricaoId;
	}
	
	
	// setters
	
	public void setInscricaoId(String inscricaoId){
		this.inscricaoId = inscricaoId;
	}
	public void setUserId(String userId){
		this.userId = userId;
	}
	public void setDataInscricao(Date dataInscricao){
		this.dataInscricao = dataInscricao;
	}
	public String setValorTotal(Date dataInscricao){
		return this.inscricaoId;
	}

	public float calculaValorTotal()
	{
		// TODO: Implement this method
		return 0;
	}
	
}
