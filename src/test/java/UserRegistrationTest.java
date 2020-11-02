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
}
