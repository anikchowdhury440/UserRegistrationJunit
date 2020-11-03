import org.junit.Test;
import org.junit.Assert;

public class UserRegistrationTest {

	@Test
	public void testUserFirstName_WhenValid_ShouldReturnValid() {
		UserRegistration userRegistration = new UserRegistration();
		String isFNameValid = null;
		try {
			isFNameValid = userRegistration.checkName("Anik");
			Assert.assertEquals("Valid",isFNameValid);
		} 
		catch (UserRegistrationInvalidException e) {
			Assert.assertEquals("Valid",isFNameValid);
		}
	}
	
	@Test
	public void testUserFirstName_WhenInvalid_ShouldReturnException() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.checkName("anik");
		} 
		catch (UserRegistrationInvalidException e) {
			Assert.assertEquals(UserRegistrationInvalidException.ExceptionType.ENTERED_INVALID, e.type);
		}
	}
	
	@Test
	public void testUserFirstName_WhenNull_ShouldReturnException() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.checkName(null);
		} 
		catch (UserRegistrationInvalidException e) {
			Assert.assertEquals(UserRegistrationInvalidException.ExceptionType.ENTERED_NULL, e.type);
		}
	}
	
	@Test
	public void testUserLastName_WhenValid_ShouldReturnValid() {
		UserRegistration userRegistration = new UserRegistration();
		String isLNameValid = null;
		try {
			isLNameValid = userRegistration.checkName("Chowdhury");
			Assert.assertEquals("Valid",isLNameValid);
		} 
		catch (UserRegistrationInvalidException e) {
			Assert.assertEquals("Valid",isLNameValid);
		}
	}
	
	@Test
	public void testUserLastName_WhenInvalid_ShouldReturnException() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.checkName("chowdhury");
		} 
		catch (UserRegistrationInvalidException e) {
			Assert.assertEquals(UserRegistrationInvalidException.ExceptionType.ENTERED_INVALID, e.type);
		}
	}
	
	@Test
	public void testUserLastName_WhenNull_ShouldReturnException() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.checkName(null);
		} 
		catch (UserRegistrationInvalidException e) {
			Assert.assertEquals(UserRegistrationInvalidException.ExceptionType.ENTERED_NULL, e.type);
		}
	}
	
	@Test
	public void testUserEmail_WhenValid_ShouldReturnValid() {
		UserRegistration userRegistration = new UserRegistration();
		String isEmailValid = null;
		try {
			isEmailValid = userRegistration.checkEmail("anik@gmail.com");
			Assert.assertEquals("Valid",isEmailValid);
		} 
		catch (UserRegistrationInvalidException e) {
			Assert.assertEquals("Valid",isEmailValid);
		}
	}
	
	@Test
	public void testUserEmail_WhenInvalid_ShouldReturnException() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.checkEmail("anik@.com");
		} 
		catch (UserRegistrationInvalidException e) {
			Assert.assertEquals(UserRegistrationInvalidException.ExceptionType.ENTERED_INVALID, e.type);
		}
	}
	
	@Test
	public void testUserEmail_WhenNull_ShouldReturnException() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.checkEmail(null);
		} 
		catch (UserRegistrationInvalidException e) {
			Assert.assertEquals(UserRegistrationInvalidException.ExceptionType.ENTERED_NULL, e.type);
		}
	}
	
	@Test
	public void testUserMobile_WhenValid_ShouldReturnValid() {
		UserRegistration userRegistration = new UserRegistration();
		String isMobileValid = null;
		try {
			isMobileValid = userRegistration.checkMobile("91 9999999999");
			Assert.assertEquals("Valid",isMobileValid);
		} 
		catch (UserRegistrationInvalidException e) {
			Assert.assertEquals("Valid",isMobileValid);
		}
	}
	
	@Test
	public void testUserMobile_WhenInvalid_ShouldReturnException() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.checkMobile("9977665544");
		} 
		catch (UserRegistrationInvalidException e) {
			Assert.assertEquals(UserRegistrationInvalidException.ExceptionType.ENTERED_INVALID, e.type);
		}
	}
	
	@Test
	public void testUserMobile_WhenNull_ShouldReturnException() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.checkMobile(null);
		} 
		catch (UserRegistrationInvalidException e) {
			Assert.assertEquals(UserRegistrationInvalidException.ExceptionType.ENTERED_NULL, e.type);
		}
	}
	
	@Test
	public void testUserPassword_WhenValid_ShouldReturnValid() {
		UserRegistration userRegistration = new UserRegistration();
		String isPasswordValid = null;
		try {
			isPasswordValid = userRegistration.checkPassword("anikCh#14");
			Assert.assertEquals("Valid",isPasswordValid);
		} 
		catch (UserRegistrationInvalidException e) {
			Assert.assertEquals("Valid",isPasswordValid);
		}
	}
	
	@Test
	public void testUserPassword_WhenInvalid_ShouldReturnException() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.checkPassword("anikChowdhury123");
		} 
		catch (UserRegistrationInvalidException e) {
			Assert.assertEquals(UserRegistrationInvalidException.ExceptionType.ENTERED_INVALID, e.type);
		}
	}
	
	@Test
	public void testUserPassword_WhenNull_ShouldReturnException() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.checkPassword(null);
		} 
		catch (UserRegistrationInvalidException e) {
			Assert.assertEquals(UserRegistrationInvalidException.ExceptionType.ENTERED_NULL, e.type);
		}
	}

	@Test
	public void testSampleEmail_WhenValid_ShouldReturnValid() {
		UserRegistration userRegistration = new UserRegistration();
		String isEmailValid = null;
		try {
			isEmailValid = userRegistration.checkEmail("abc-100@abc.net");
		} 
		catch (UserRegistrationInvalidException e) {
			Assert.assertEquals("Valid",isEmailValid);
		}
	}
	
	@Test
	public void testSampleEmail_WhenInvalid_ShouldReturnException() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.checkEmail("abc@gmail.com.1a");
		} 
		catch (UserRegistrationInvalidException e) {
			Assert.assertEquals(UserRegistrationInvalidException.ExceptionType.ENTERED_INVALID, e.type);
		}
	}
	
	@Test
	public void mood_Analyser_Test_Happy() {
		UserRegistration userRegistration = new UserRegistration();
		String isMoodHappy = null;
		try {
			isMoodHappy = userRegistration.moodAnalyse("Anik", "Chowdhury", "anik@gmail.com", "91 9999999999", "Anik@1234");
			Assert.assertEquals("HAPPY", isMoodHappy);
		} 
		catch (UserRegistrationInvalidException e) {
			Assert.assertEquals("HAPPY", isMoodHappy);
		}
    }

    @Test
    public void mood_Analyser_Test_Sad() {
        UserRegistration userRegistration = new UserRegistration();
        String isMoodSad = null;
		try {
			isMoodSad = userRegistration.moodAnalyse("Anik", "Chowdhury", "anik@gmail.com", "9999999999", "Anik1234");
		} 
		catch (UserRegistrationInvalidException e) {
			Assert.assertEquals(UserRegistrationInvalidException.ExceptionType.ENTERED_INVALID, e.type);
		}
    }
}
