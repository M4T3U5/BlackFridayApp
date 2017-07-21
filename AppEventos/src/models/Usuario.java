package models;

public class Usuario
{
	private String username;
	private String password;
	
	public Usuario(String username, String password){
		this.username = username;
		this.password = password;
		
	}
	
	// getters 
	
	String getUserName(){
		return this.username;
	}
	
	String getUserPassword(){
		return this.password;
	}
	
	// setters
	
	void setUserName(String username){
		this.username = username;
	}
	void setUserPassword(String password){
		this.password = password;
	}
	
}
