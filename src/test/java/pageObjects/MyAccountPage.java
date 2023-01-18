package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
		@FindBy(xpath="//a[@class='ico-account']")
		WebElement lnkMyAccount;
		
		@FindBy(xpath="//a[normalize-space()='Log out']")
		WebElement lnkLogout;
		
		public boolean isMyAccountlinkDisplayed() {
			try {
			return (lnkMyAccount.isDisplayed());
			}
			catch(Exception e) {
				return (false);
			}
		}
		
		public void clickLogout() {
			lnkLogout.click();
		}
		
	

}
