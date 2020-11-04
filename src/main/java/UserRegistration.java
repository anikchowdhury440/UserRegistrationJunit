
public class UserRegistration {
	
	public static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
	public static final String EMAIL_PATTERN = "^[0-9a-zA-Z]+([._+-][0-9A-Za-z]+)*@[0-9A-Za-z]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
	public static final String MOBILE_PATTERN = "^[0-9]{1,2}[ ][0-9]{10}$";
	public static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[*.!@#$%^&(){}:'<>,.>/~`_+=|].).{8,}$";
	
	public String checkName(String name) throws UserRegistrationInvalidException {
		try {
			if(name.matches(NAME_PATTERN)) {
				return "Valid";
			}
			else {
				throw new UserRegistrationInvalidException(UserRegistrationInvalidException.ExceptionType.ENTERED_INVALID, "Please Enter Valid Name");
			}
		}
		catch (NullPointerException e) {
			throw new UserRegistrationInvalidException(UserRegistrationInvalidException.ExceptionType.ENTERED_NULL, "Please Don't Enter Null Value");
		}
	}
	
	public String checkEmail(String email) throws UserRegistrationInvalidException {
		try {
			if(email.matches(EMAIL_PATTERN)) {
				return "Valid";
			}
			else {
				throw new UserRegistrationInvalidException(UserRegistrationInvalidException.ExceptionType.ENTERED_INVALID, "Please Enter Valid Email");
			}
		}
		catch (NullPointerException e) {
			throw new UserRegistrationInvalidException(UserRegistrationInvalidException.ExceptionType.ENTERED_NULL, "Please Don't Enter Null Value");
		}
	}
	
	public String checkMobile(String mobile) throws UserRegistrationInvalidException {
		try {
			if(mobile.matches(MOBILE_PATTERN)) {
				return "Valid";
			}
			else {
				throw new UserRegistrationInvalidException(UserRegistrationInvalidException.ExceptionType.ENTERED_INVALID, "Please Enter Valid Mobile");
			}
		}
		catch (NullPointerException e) {
			throw new UserRegistrationInvalidException(UserRegistrationInvalidException.ExceptionType.ENTERED_NULL, "Please Don't Enter Null Value");
		}
	}
	
	public String checkPassword(String password) throws UserRegistrationInvalidException {
		try {
			if(password.matches(PASSWORD_PATTERN)) {
				return "Valid";
			}
			else {
				throw new UserRegistrationInvalidException(UserRegistrationInvalidException.ExceptionType.ENTERED_INVALID, "Please Enter Valid Password");
			}
		}
		catch (NullPointerException e) {
			throw new UserRegistrationInvalidException(UserRegistrationInvalidException.ExceptionType.ENTERED_NULL, "Please Don't Enter Null Value");
		}
	}
	
	public String moodAnalyse(String fName, String lName, String email, String mobile, String password ) throws UserRegistrationInvalidException {
		try {
			if(checkName(fName) == "Valid" && checkName(lName) == "Valid" && checkEmail(email) == "Valid" && checkMobile(mobile) == "Valid" && checkPassword(password) == "Valid") {
				return "HAPPY";
			}
			else {
				throw new UserRegistrationInvalidException(UserRegistrationInvalidException.ExceptionType.ENTERED_INVALID, "Please Enter Valid Password");
			}
		}
		catch (NullPointerException e) {
			throw new UserRegistrationInvalidException(UserRegistrationInvalidException.ExceptionType.ENTERED_NULL, "Please Don't Enter Null Value");
		}
	}
	
}
