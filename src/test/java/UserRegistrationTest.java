import org.junit.Test;
import org.junit.Assert;

public class UserRegistrationTest {

	@Test
	public void testUserFirstName_WhenValid_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isFNameValid = userRegistration.checkFirstName("Anik");
		Assert.assertTrue(isFNameValid);
	}
	
	@Test
	public void testUserFirstName_WhenInvalid_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isFNameValid = userRegistration.checkFirstName("anik");
		Assert.assertFalse(isFNameValid);
	}
	
}
