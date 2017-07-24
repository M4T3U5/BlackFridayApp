package models;
import java.util.*;
import  enumeretions.*;

public class Evento
{
	
	private int id;
	private String nome;
	private int usuarioId;
	private int tagId;
	private StatusEvento statusEvento;
	private Date dataInicio;
	private Date dataFim;
	
	public Evento(){
		
	}
	
	public Evento(String nome,int usuarioId,Date dataInicio, Date dataFim){
		
		this.id = Hash.generateLongIntHash(10);
		this.nome = nome;
		this.usuarioId = usuarioId;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.statusEvento = StatusEvento.NOVO;
		
		// todo TAGID logic
		this.tagId = 0;
	}
	
	// getters
	
	public String getNome(){
		return this.nome;
	}
	
	public int getId(){
		return this.id;
	}
	
	public int getUsuarioId(){
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
	
	public int getTags(){
		return this.tagId;
	}
	
	public void addTags(){
		
		// TODO IMPLEMENTS
		
	}
	
	
}
