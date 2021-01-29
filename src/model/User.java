package model;

public class User {

	private String name ; 
	private String email ; 
	private String datebirthday;
	
	
	public User() {};
	
	public User(String name, String email, String datebirthday) {
		this.name = name;
		this.email = email;
		this.datebirthday = datebirthday;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDatebirthday() {
		return datebirthday;
	}
	public void setDatebirthday(String datebirthday) {
		this.datebirthday = datebirthday;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", datebirthday=" + datebirthday + "]";
	}
	
	
	
	
}
