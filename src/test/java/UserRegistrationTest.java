import org.junit.Test;
import org.junit.Assert;

public class UserRegistrationTest {

	@Test
	public void testUserFirstName_WhenValid_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isFNameValid = userRegistration.checkName("Anik");
		Assert.assertTrue(isFNameValid);
	}
	
	@Test
	public void testUserFirstName_WhenInvalid_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isFNameValid = userRegistration.checkName("anik");
		Assert.assertFalse(isFNameValid);
	}
	
	@Test
	public void testUserLastName_WhenValid_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isLNameValid = userRegistration.checkName("Chowdhury");
		Assert.assertTrue(isLNameValid);
	}
	
	@Test
	public void testUserLastName_WhenInvalid_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isLNameValid = userRegistration.checkName("anik");
		Assert.assertFalse(isLNameValid);
	}
	
	@Test
	public void testUserEmail_WhenValid_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isEmailValid = userRegistration.checkEmail("anik@gmail.com");
		Assert.assertTrue(isEmailValid);
	}
	
	@Test
	public void testUserEmail_WhenInvalid_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isEmailValid = userRegistration.checkEmail("anik@.com");
		Assert.assertFalse(isEmailValid);
	}
	
	@Test
	public void testUserMobile_WhenValid_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isMobileValid = userRegistration.checkMobile("91 9999999999");
		Assert.assertTrue(isMobileValid);
	}
	
	@Test
	public void testUserMobile_WhenInvalid_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isMobileValid = userRegistration.checkMobile("998877665544");
		Assert.assertFalse(isMobileValid);
	}
	
	@Test
	public void testUserPassword_WhenValid_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isPasswordValid = userRegistration.checkPassword("anikCh#14");
		Assert.assertTrue(isPasswordValid);
	}
	
	@Test
	public void testUserPassword_WhenInvalid_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isPasswordValid = userRegistration.checkPassword("anikChowdhury123");
		Assert.assertFalse(isPasswordValid);
	}

	@Test
	public void testSampleEmail_WhenValid_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isEmailValid = userRegistration.checkEmail("abc-100@abc.net");
		Assert.assertTrue(isEmailValid);
	}
	
	@Test
	public void testSampleEmail_WhenInvalid_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isEmailValid = userRegistration.checkEmail("abc@gmail.com.1a");
		Assert.assertFalse(isEmailValid);
	}
}
