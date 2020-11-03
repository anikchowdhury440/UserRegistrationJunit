
public class UserRegistrationInvalidException extends Exception {
	
	enum ExceptionType{
		ENTERED_INVALID, ENTERED_NULL
    }

	ExceptionType type;
	
	public UserRegistrationInvalidException (ExceptionType type, String message) {
		super(message);
		this.type = type;
	}

}
