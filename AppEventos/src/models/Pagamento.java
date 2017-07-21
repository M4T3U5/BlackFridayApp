package models;
import java.util.*;

public class Pagamento
{
	
	private String id;
	private String inscricao;
	private Date dataPagamento;
	private String estadoAtual;
	private boolean hasPago;
	
	
	public Pagamento(String inscricao,Date dataPagamento,String estado){
		
		this.id = Hash.generateStringHash(20);
		this.inscricao = inscricao;
		this.dataPagamento = dataPagamento;
		this.estadoAtual = estado;
		this.hasPago = false;
		
	}
	
	public String getId(){
		return this.id;
	}
	public String getInscricao(){
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
