
package preparation;import org.testng.annotations.Test;

public class TestngTest {

	
	@Test(dataProvider = "LoginData",dataProviderClass = TestDataProvider.class)
	public void loginWithMultiple(String username , String Password) {
		
		System.out.println("userId is :"+username +" "+"password is :" +Password);
	}
	
	@Test(dataProvider = "userName",dataProviderClass = TestDataProvider.class)
	public void printUName(String u) {
		
		System.out.println(u);
	}
}