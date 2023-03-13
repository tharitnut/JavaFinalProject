import java.io.*;
import java.util.*;

public class Customer {
	private String user;
	private String pass;
	private boolean regis;
	
	public Customer() {
		user = "";
		pass = "";
		regis = false;
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
	
	public void setRegis(boolean regis) {
		this.regis=regis;
	}
	
	public boolean getRegis() {
		return regis;
	}
	
	public boolean isRegister() throws IOException {
		Scanner scan = new Scanner(new FileReader("CustomerDetail.txt"));
		boolean check = false;
		while (scan.hasNext()) {
			String user = scan.next();
			String pass = scan.next();
			if (user == getUser() && pass == getPass()) {
				check = true;
				break;
			}
		}
		scan.close();
		return check;
	}
	
	public void register() {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("CustomerDetail.txt", true));
			PrintWriter write = new PrintWriter(bw);
			write.println(getUser()+"\t"+getPass());
			bw.close();
		}
		catch (IOException e) {
			e.getMessage();
		}
	}

}
