package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountRegistrationPage extends BasePage{
	
	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	//Elements
	@FindBy(xpath="//input[@id='gender-male']")
	WebElement radiobtnMale;
	
	@FindBy(xpath="//input[@id='gender-female']")
	WebElement radiobtnFemale;
	
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement txtBoxFirstName;
	
	@FindBy(xpath="//input[@id='LastName']")
	WebElement txtBoxLastName;
	
	@FindBy(xpath="//select[@name='DateOfBirthDay']")
	WebElement drpBirthDate;
	
	@FindBy(xpath="//select[@name='DateOfBirthMonth']")
	WebElement drpBirthMonth;
	
	@FindBy(xpath="//select[@name='DateOfBirthYear']")
	WebElement drpBirthYear;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement txtBoxEmail;
	
	@FindBy(xpath="//input[@id='Company']")
	WebElement txtBoxCompany;

	@FindBy(xpath="//input[@id='Password']")
	WebElement txtBoxPassword;
	
	@FindBy(xpath="//input[@id='ConfirmPassword']")
	WebElement txtBoxCnfPassword;
	
	@FindBy(xpath="//button[@id='register-button']")
	WebElement btnRegister;
	
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]")
	WebElement cnfMsg;
	
	//Action Methods
	public void selectMaleDropDown() {
		radiobtnMale.click();
		}
	
	public void selectFemaleDropDown() {
		radiobtnFemale.click();
		}
	
	public void setFirstName(String fname) {
		txtBoxFirstName.sendKeys(fname);
	}
	
	public void setLasttName(String lname) {
		txtBoxLastName.sendKeys(lname);
	}
	
	public void setBirthDate(String bdate) {
		Select drpbdate=new Select(drpBirthDate);
		drpbdate.selectByVisibleText(bdate);
	}
	
	public void setBirthMonth(String bmonth) {
		Select drpbmonth=new Select(drpBirthMonth);
		drpbmonth.selectByVisibleText(bmonth);
	}
	
	public void setBirthYear(String byear) {
		Select drpbyear=new Select(drpBirthYear);
		drpbyear.selectByVisibleText(byear);
	}
	
	public void setEmail(String email) {
		txtBoxEmail.sendKeys(email);
	}
	
	public void setCompany(String company) {
		txtBoxCompany.sendKeys(company);
	}

	public void setPassword(String pwd) {
		txtBoxPassword.sendKeys(pwd);
	}
	
	public void setConfirmPassword(String cnfpwd) {
		txtBoxCnfPassword.sendKeys(cnfpwd);
	}
	
	public void clickRegisterBtn() {
		btnRegister.click();
	}
	
	public String getConfirmationMsg() {
		try {
			return (cnfMsg.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}
	}
}
