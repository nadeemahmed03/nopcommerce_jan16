package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass{
	
	@Test(groups= {"Sanity","Master"})
	public void test_Login() {
		try {
		logger.info("*** Starting TC_002_LoginTest ***");
		
		HomePage hp=new HomePage(driver);
		hp.clickLogin();
		logger.info("Clicked on Login Link");
		LoginPage lp=new LoginPage(driver);
		lp.enterEmail(rb.getString("email"));
		logger.info("Entered email");
		lp.enterPassword(rb.getString("password"));
		logger.info("Entered Password");
		lp.clickLoginBtn();
		logger.info("Clicked Login Button");
		
		MyAccountPage macc=new MyAccountPage(driver);
		boolean targetpage=macc.isMyAccountlinkDisplayed();
		Assert.assertEquals(targetpage, true, "Invalid Login Data");
		}
		
		catch(Exception e) {
			Assert.fail();
		}
		logger.info("*** Finished TC_002_LoginTest ***");
		
		
	}

}
