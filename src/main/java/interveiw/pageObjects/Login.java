package interveiw.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Login {

	WebDriver driver;
	
	public Login(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);

		
		
	}
	
@FindBy(xpath = "//input[@id 'email']")
private WebElement EmailTxbox;

@FindBy(xpath = "//input[@id 'pass']")
private WebElement passwordbox;

@FindBy(xpath ="//button[@name= 'login']")
private WebElement loginButton;

@Test
public void Login() {
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	EmailTxbox.sendKeys("tes@dmail.com");
	passwordbox.sendKeys("1234");
	loginButton.click();
}
}
