package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{

	public SearchPage(WebDriver driver) {
		super(driver);
		}
	
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div")
	List<WebElement> searchProducts;
			
	@FindBy(xpath="//input[@id='product_enteredQuantity_33']")
	WebElement txtquantity;
	
	@FindBy(xpath="//button[@id='add-to-cart-button-33']")
	WebElement btnaddToCart;
	
	@FindBy(xpath="//p[@class='content']")
	WebElement cnfMsg;
	
	public boolean isProductExist(String productName)
	{
		boolean flag=false;
		for(WebElement product:searchProducts)
		{				
			if(product.getAttribute("title").equals(productName))
			{
			flag=true;
			break;
			}
		}
		
		return flag;
	
	}
	
	public void selectProduct(String productName)
	{
		for(WebElement product:searchProducts)
		{				
			if(product.getAttribute("title").equals(productName))
			{
				product.click();
			}
		}
	
	}
	
	public void setQuantity(String qty)
	{
		txtquantity.clear();
		txtquantity.sendKeys(qty);
	}
	
	public void addToCart()
	{
		btnaddToCart.click();
	}
	
	public boolean checkConfMsg()
	{
		try
		{
		return cnfMsg.isDisplayed();
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
	
	
	
}
