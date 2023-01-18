package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SearchPage;
import testBase.BaseClass;

public class TC_004_SearchProductTest extends BaseClass{
	
	@Test(groups= {"Sanity","Master"})
	public void test_pruductSearch() throws InterruptedException {
		logger.info(" Starting TC_004_SearchProductTest ");

		try {
			
			HomePage hp=new HomePage(driver);
			
			hp.enterSearchText("Nokia");
			
			hp.clickSearchButton();
			
			SearchPage sp=new SearchPage(driver);
			sp.isProductExist("Nokia");

			Assert.assertEquals(sp.isProductExist("Nokia"),true);

		} catch (Exception e) {
			Assert.fail();
		}

		logger.info(" Finished TC_004_SearchProductTest ");

	}

}
