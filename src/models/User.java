package models;

public class User {

	//Données
	private String username ;
	private String password;
	private String role;
	
	//Constructeur
	public User(String username , String password , String role) {
		this.username = username ;
		this.password = password ;
		this.role = role ;
	}
	
	
	public User(String username , String password ) {
		this.username = username ;
		this.password = password ;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public String getRole() {
		return this.role;
	}
}
