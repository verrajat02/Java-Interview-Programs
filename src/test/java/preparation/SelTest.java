package preparation;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//@Listeners(MyListernrs.class)
public class SelTest {
	File filepath;
	FileInputStream fis;
	Properties prop;
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		
		filepath = new File(System.getProperty("user.dir")+"\\src\\test\\java\\prep\\qa\\prop\\conf.properties");
		try {
	    fis = new FileInputStream(filepath);
		prop = new Properties();
		prop.load(fis);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("url"));
		}
		}
	
	@Test
	public void getTitle() {
		System.out.println("Title of the WebPage"+driver.getTitle());
	}
	
	@Test
	public void verifyTitle() {
		String actualTitle= driver.getTitle();
		Assert.assertEquals(actualTitle, "Hello");
	}
	
	@Test
	public void tearDown() {
		driver.close();
	}
	
	
}
