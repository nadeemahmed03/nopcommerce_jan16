package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass{
	
	@Test(groups= {"Regression","Master"})
	public void test_account_Registration() {
		
		logger.debug("Application logs...");
		logger.info("*** Starting TC_001_AccountRegistrationTest ***");
		try {
		HomePage hp=new HomePage(driver);
		hp.clickRegister();
		logger.info("Clicked on Register Link");
		
		AccountRegistrationPage arp=new AccountRegistrationPage(driver);
		logger.info("Providing Customer Data");
		arp.selectMaleDropDown();
		arp.setFirstName(randomString().toUpperCase());
		Thread.sleep(1000);
		arp.setLasttName(randomString().toUpperCase());
		Thread.sleep(1000);
		arp.setBirthDate("25");
		arp.setBirthMonth("July");
		arp.setBirthYear("1996");
		arp.setEmail(randomString()+"@gmail.com");
		Thread.sleep(1000);
		arp.setCompany(randomString()); 
		Thread.sleep(1000);
		String pass=randomAlphaNumberic();
		arp.setPassword(pass);
		arp.setConfirmPassword(pass);
		arp.clickRegisterBtn();
		logger.info("Clicked on Register Button");
		String regConf=arp.getConfirmationMsg();
		
		logger.info("Validating expected message");
		Assert.assertEquals(regConf, "Your registration completed");
		}
		
		catch(Exception e) {
			logger.error("Test Failed");
			Assert.fail();
		}
		logger.info("*** Finished TC_001_AccountRegistrationTest ***");
		
		
	}

}
