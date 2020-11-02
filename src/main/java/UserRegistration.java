
public class UserRegistration {
	
	public static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
	
	public boolean checkName(String name) {
		return (name.matches(NAME_PATTERN));
	}
}
