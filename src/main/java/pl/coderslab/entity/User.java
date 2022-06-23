package pl.coderslab.entity;

public class User {
	
	private int id = 1;
	private String userName;
	private String email;
	private String password;
	
	public User ( String userName, String email, String password) {
		
	
		this.userName = userName;
		this.email = email;
		this.password = password;
	}
	
	public int getId () {
		
		return id;
	}
	
	public void setId(int newId){
	
	this.id = newId;
	}
	
	
	public String getUserName () {
		
		return userName;
	}
	
	public void setUserName (String userName) {
		
		this.userName = userName;
	}
	
	public String getEmail () {
		
		return email;
	}
	
	public void setEmail (String email) {
		
		this.email = email;
	}
	
	public String getPassword () {
		
		return password;
	}
	
	public void setPassword (String password) {
		
		this.password = password;
	}
}
