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

	public void setUser(String user) {
		this.user = user;
	}

	public String getUser() {
		return user;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getPass() {
		return pass;
	}

	public void setRegis(boolean regis) {
		this.regis = regis;
	}

	public boolean getRegis() {
		return regis;
	}

	public boolean isRegister(String user, String pass) throws IOException {
		Scanner scan = new Scanner(new FileReader("CustomerDetail.txt"));
		while (scan.hasNext()) {
			setUser(scan.next());
			setPass(scan.next());
			if (user.equals(getUser()) && pass.equals(getPass())) {
				return true;
			}
		}
		scan.close();
		return false;
	}

	public Integer discount(String user, String pass) throws IOException {
		Scanner scan = new Scanner(new FileReader("CustomerDetail.txt"));
		while (scan.hasNext()) {
			setUser(scan.next());
			setPass(scan.next());
			if (user.equals(getUser()) && pass.equals(getPass())) {
				return 5;
			}
		}
		scan.close();
		return 0;
	}

	public void register() {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("CustomerDetail.txt", true));
			PrintWriter write = new PrintWriter(bw);
			write.println(getUser() + "\t" + getPass());
			bw.close();
		} catch (IOException e) {
			e.getMessage();
		}
	}

}
