
public class UserRegistration {
	
	public static final String FIRST_NAME_PATTERN = "^[A-Z][a-z]{2,}$";
	
	public boolean checkFirstName(String fName) {
		return (fName.matches(FIRST_NAME_PATTERN));
	}
}
