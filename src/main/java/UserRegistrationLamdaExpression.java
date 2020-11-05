import java.util.Scanner;

@FunctionalInterface
interface ValidateInput {
	boolean checkPattern(String pattern, String userInput);
	static void printResult(String pattern, String userInput, ValidateInput obj) {
		if(obj.checkPattern(pattern, userInput)) {
			System.out.println("Result : Valid");
		}
		else {
			System.out.println("Result : Invalid");
		}
	}
}

public class UserRegistrationLamdaExpression {
	
	public static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
	public static final String EMAIL_PATTERN = "^[0-9a-zA-Z]+([._+-][0-9A-Za-z]+)*@[0-9A-Za-z]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
	public static final String MOBILE_PATTERN = "^[0-9]{1,2}[ ][0-9]{10}$";
	public static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[*.!@#$%^&(){}:'<>,.>/~`_+=|].).{8,}$";
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ValidateInput checkInput = (pattern, userInput ) -> userInput.matches(pattern);
		
		System.out.println("Enter First Name: ");
		String fName = scanner.nextLine();
		ValidateInput.printResult(NAME_PATTERN, fName, checkInput);
		
		System.out.println("Enter Last Name: ");
		String lName = scanner.nextLine();
		ValidateInput.printResult(NAME_PATTERN, lName, checkInput);
		
		System.out.println("Enter Email: ");
		String email = scanner.nextLine();
		ValidateInput.printResult(EMAIL_PATTERN, email, checkInput);
		
		System.out.println("Enter Mobile Number ");
		String mobile = scanner.nextLine();
		ValidateInput.printResult(MOBILE_PATTERN, mobile, checkInput);
		
		System.out.println("Enter Password: ");
		String password = scanner.nextLine();
		ValidateInput.printResult(PASSWORD_PATTERN, password, checkInput);
	}

}
