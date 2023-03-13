
public class CheckUser {
	private String user;

	public boolean chkUser(String user) {
		for (int i = 0; i < user.length(); i++) {
			if (!Character.isLetterOrDigit(user.charAt(i))) {
				return false;
			}
		}
		if(user.length()>=6&&user.length()<=12) {
			return true;
		}
		return false;
	}
}
