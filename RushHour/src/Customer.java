import java.io.*;

public class Customer {
	private String user;
	private String pass;
	
	public Customer() {
		user = "";
		pass = "";
	}
	
	public void setUser(String user){
		this.user=user;
	}
	
	public String getUser() {
		return user;
	}
	
	public void setPass(String pass) {
		this.pass=pass;
	}
	
	public String getPass() {
		return pass;
	}
	
	public boolean isRegister() {
		return true;
	}

}
