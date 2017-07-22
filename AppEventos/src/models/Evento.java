package models;
import java.util.*;
import enum.*;

public class Evento
{
	
	private String id;
	private String nome;
	private String usuarioId;
	private String tagId;
	private StatusEvento statusEvento;
	private Date dataInicio;
	private Date dataFim;
	
	
	public Evento(String nome,String usuarioId,Date dataInicio, Date dataFim){
		
		this.id = Hash.generateStringHash(10);
		this.nome = nome;
		this.usuarioId = usuarioId;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.statusEvento = StatusEvento.NOVO;
		
		// todo TAGID logic
		this.tagId = "0";
	}
	
	// getters
	
	public String getNome(){
		return this.nome;
	}
	
	public String getId(){
		return this.id;
	}
	
	public String getUsuarioId(){
		return this.usuarioId;
	}
	
	public Date getDataInicio(){
		return this.dataInicio;
	}
	
	public Date getDataFim(){
		return this.dataFim;
	}
	
	public StatusEvento getStatusEvento(){
		return this.statusEvento;
	}
	
	public String getTags(){
		return this.tagId;
	}
	
	public void addTags(){
		
		// TODO IMPLEMENTS
		
	}
	
	
}
