package models;
import java.util.*;
import interfaces.*;

public class Inscricao implements Calculavel
{
	
	private int inscricaoId;
	private int userId;
	private Date dataInscricao;
	private float valorTotal;
	
	public Inscricao(int userId,Date dataInscricao){
			
		this.inscricaoId = Hash.generateLongIntHash(10);
		this.userId = userId;
		this.dataInscricao = dataInscricao;
		this.valorTotal = (0);
		
	}
	
	// getters
	
	public int getInscricaoId(){
		return this.inscricaoId;
	}
	public int getUserId(){
		return this.userId;
	}
	public Date getDataInscricao(){
		return this.dataInscricao;
	}
	public float getValorTotal(){
		return this.inscricaoId;
	}
	
	
	// setters
	
	public void setInscricaoId(int inscricaoId){
		this.inscricaoId = inscricaoId;
	}
	public void setUserId(int userId){
		this.userId = userId;
	}
	public void setDataInscricao(Date dataInscricao){
		this.dataInscricao = dataInscricao;
	}
	public void setValorTotal(float total){
		this.valorTotal = total;
	}

	public float calculaValorTotal()
	{
		// TODO: Implement this method
		return 0;
	}
	
}
