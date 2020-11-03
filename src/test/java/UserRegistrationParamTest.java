
import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class UserRegistrationParamTest {
	private String emails;
	private String expectedResult;
	
	public UserRegistrationParamTest(String emails, String expectedResult) {
		this.emails = emails;
		this.expectedResult = expectedResult;
	}
		
	@Parameterized.Parameters
	public static Collection input(){
		return Arrays.asList(new Object[][]{
				{"abc@yahoo.com", "Valid"},
				{"abc-100@yahoo.com", "Valid"},
				{"abc.100@yahoo.com", "Valid"},
				{"abc111@abc.com", "Valid"},
				{"abc-100@abc.net", "Valid"},
				{"abc.100@abc.com.au", "Valid"},
				{"abc@1.com", "Valid"},
				{"abc@gmail.com.com", "Valid"},
				{"abc+100@gmail.com", "Valid"},
				{"abc" , "ENTERED_INVALID"},
				{"abc@.com.my", "ENTERED_INVALID"},
				{"abc123@gmail.a", "ENTERED_INVALID"},
				{"abc123@.com", "ENTERED_INVALID"},
				{"abc123@.com.com", "ENTERED_INVALID"},
				{".abc@abc.com", "ENTERED_INVALID"},
				{"abc()*@gmail.com", "ENTERED_INVALID"},
				{"abc@%*.com", "ENTERED_INVALID"},
				{"abc..2002@gmail.com", "ENTERED_INVALID"},
				{"abc.@gmail.com", "ENTERED_INVALID"},
				{"abc@abc@gmail.com", "ENTERED_INVALID"},
				{"abc@gmail.com.1a", "ENTERED_INVALID"},
				{"abc@gmail.com.aa.au", "ENTERED_INVALID"}
		});
	}
	
	@Test
	public void testEmails() {
		UserRegistration userRegistration = new UserRegistration();
		String email = null;
		try {
			email = userRegistration.checkEmail(emails);
			Assert.assertEquals(expectedResult,email);
		} catch (UserRegistrationInvalidException e) {
			Assert.assertEquals(expectedResult,String.valueOf(e.type));
		}
	}
}

