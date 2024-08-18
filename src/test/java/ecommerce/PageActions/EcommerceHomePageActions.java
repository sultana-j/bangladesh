package ecommerce.PageActions;



import org.testng.Assert;

import ecommerce.PageLocators.EcommerceAccountPageLocator;
import ecommerce.PageLocators.EcommerceHomePageLocator;
import ecommerce.utility.ecommerceBase;

public class EcommerceHomePageActions extends ecommerceBase {
	EcommerceHomePageLocator ecommerceHomePageLocator = new EcommerceHomePageLocator();
	public void clickaccountlink () {
		ecommerceHomePageLocator.AccountLink.click();	
	}
	public void UserRegisterSuccessfully () {
		boolean verifySignUp = ecommerceHomePageLocator.VerifySignUp.isDisplayed();
		
	Assert.assertTrue(verifySignUp);
	}
	
public void SignUpLink()	{
	ecommerceHomePageLocator.SignupButton.click();
		
		
		
		
	}
   
}
