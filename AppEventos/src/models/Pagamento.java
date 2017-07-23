package models;
import java.util.*;
import interfaces.*;

public class Pagamento
{
	
	private int id;
	private int inscricao;
	private Date dataPagamento;
	private String estadoAtual;
	private boolean hasPago;
	
	public Pagamento(){
		
	}
	
	public Pagamento(int inscricao,Date dataPagamento,String estado){
		
		this.id = Hash.generateLongIntHash(20);
		this.inscricao = inscricao;
		this.dataPagamento = dataPagamento;
		this.estadoAtual = estado;
		this.hasPago = false;
		
	}
	
	public int getId(){
		return this.id;
	}
	public int getInscricao(){
		return this.inscricao;
	}
	public Date getDataPagamento(){
		return this.dataPagamento;
	}
	public String getEstadoAtual(){
		return this.estadoAtual;
	}
	public boolean hasPago(){
		return this.hasPago;
	}
	
}
