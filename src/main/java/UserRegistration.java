
public class UserRegistration {
	
	public static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
	public static final String EMAIL_PATTERN = "^[0-9a-zA-Z]+([._+-][0-9A-Za-z]+)*@[0-9A-Za-z]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
	
	public boolean checkName(String name) {
		return (name.matches(NAME_PATTERN));
	}
	
	public boolean checkEmail(String email) {
		return (email.matches(EMAIL_PATTERN));
	}
}
