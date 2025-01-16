package preparation;

import org.testng.annotations.DataProvider;

public class TestDataProvider {

	
	@DataProvider(name = "userName")
	
	public Object[] userdata() {
		
		Object [] userName = new String[3];
		userName[0]="Love";
		userName[1]="My";
		userName[2]="India";
		return userName;
	}
	
@DataProvider(name ="LoginData")
	
	public Object[][] testData() {
		
		Object[][] data = new Object[3][2];
		data[0][0]="Rajat";
		data[0][1]="Verma";
		data[1][0]="Amit";
		data[1][1]="kumar";
		data[2][0]="Rohan";
		data[2][1]="srivastva";
		return data;
	}
    
}
