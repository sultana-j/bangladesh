package ecommerce.PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ecommerce.utility.ecommerceBase;

public class EcommerceAccountPageLocator extends ecommerceBase{


	public EcommerceAccountPageLocator () {
		
		PageFactory.initElements(driver,this );
	}

	@FindBy(id =  "loginusername")
	public WebElement UserID;
	
	@FindBy(id = "loginpassword")
	public WebElement UserPassword;
	
	@FindBy(xpath =   "//button[text()='Log in']")
	public WebElement LoginButton ;
	
	
	
	
}
