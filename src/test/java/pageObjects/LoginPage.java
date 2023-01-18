package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		}
	
	//elements
	@FindBy(xpath="//input[@id='Email']")
	WebElement txtboxEmail;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement txtboxPassword;
	
	@FindBy(xpath="//button[normalize-space()='Log in']")
	WebElement btnLogin;
	
	//action methods
	public void enterEmail(String email) {
		txtboxEmail.sendKeys(email);
	}
	
    public void enterPassword(String pwd) {
		txtboxPassword.sendKeys(pwd);
	}
    
    public void clickLoginBtn() {
    	btnLogin.click();
    }
	
    
	

}
