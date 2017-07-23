package models;

public class Usuario
{
	private int id;
	private String username;
	private String password;
	
	public Usuario(){
		
	}
	
	public Usuario(String username, String password){
		this.username = username;
		this.password = password;
		this.id = Hash.generateLongIntHash(20);
		
	}
	
	// getters 
	
	public String getUserName(){
		return this.username;
	}
	
	public String getUserPassword(){
		return this.password;
	}
	
	public int getUserId(){
		return this.id;
	}
	
	// setters
	
	void setUserName(String username){
		this.username = username;
	}
	void setUserPassword(String password){
		this.password = password;
	}
	void setUserId(int id){
		this.id = id;
	}
	
}
