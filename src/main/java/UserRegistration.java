
public class UserRegistration {
	
	public static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
	public static final String EMAIL_PATTERN = "^[0-9a-zA-Z]+([._+-][0-9A-Za-z]+)*@[0-9A-Za-z]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
	public static final String MOBILE_PATTERN = "^[0-9]{1,2}[ ][0-9]{10}$";
	public static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[a-z]).{8,}$";
	
	public boolean checkName(String name) {
		return (name.matches(NAME_PATTERN));
	}
	
	public boolean checkEmail(String email) {
		return (email.matches(EMAIL_PATTERN));
	}
	
	public boolean checkMobile(String mobile) {
		return (mobile.matches(MOBILE_PATTERN));
	}
	
	public boolean checkPassword(String password) {
		return (password.matches(PASSWORD_PATTERN));
	}
}
