
public class CheckPassword {
	private String pass;
	private int upperCount , lowerCount , numCount;
	
	public boolean chkPass(String pass) {
		this.pass = pass;
		upperCount = 0; lowerCount = 0; numCount = 0;
		for(int i = 0 ;i<pass.length();i++) {
			if (pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z') upperCount++;
			if (pass.charAt(i) >= 'a' && pass.charAt(i) <= 'z') lowerCount++;
			if (pass.charAt(i) >= '0' && pass.charAt(i) <= '9') numCount++;
		}
		if(upperCount<1||lowerCount<1||numCount<1) {
			return false;
		}
		return true;
	}
	
	public boolean chkCon(String passCon) {
		if(pass.equals(passCon)) return true;
		return false;
	}
	
	public String getInt() {
		return String.valueOf(upperCount)+String.valueOf(lowerCount)+String.valueOf(numCount);
	}

}
