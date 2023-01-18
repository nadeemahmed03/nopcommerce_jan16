package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

 public HomePage(WebDriver driver) {
	 super(driver);
	 
 }
    //Elements
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement lnkRegister;
	
	@FindBy(xpath="//a[normalize-space()='Log in']")
	WebElement lnkLogin;
	
	@FindBy(xpath="//input[@id='small-searchterms']")
	WebElement txtboxSearch;
	
	@FindBy(xpath="//button[normalize-space()='Search']")
	WebElement btnSearch;
	
	//Action Methods
	public void clickRegister() {
		lnkRegister.click();
	}
	
	public void clickLogin() {
		lnkLogin.click();
	}
	
	public void enterSearchText(String searchText) {
		txtboxSearch.sendKeys(searchText);	
	}
	
	public void clickSearchButton() {
		btnSearch.click();
	}
	

}
