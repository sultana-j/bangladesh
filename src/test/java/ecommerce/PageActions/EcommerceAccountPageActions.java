package ecommerce.PageActions;

import ecommerce.PageLocators.EcommerceAccountPageLocator;
import ecommerce.PageLocators.EcommerceHomePageLocator;
import ecommerce.utility.ecommerceBase;

public class EcommerceAccountPageActions extends ecommerceBase {
	
	
	  EcommerceAccountPageLocator  ecommerceAccountPageLocator = new  EcommerceAccountPageLocator ();
	  public void EcommerceCard (String U,String P) {
	  ecommerceAccountPageLocator.UserID.sendKeys(U);
	  ecommerceAccountPageLocator.UserPassword.sendKeys(P); 
	  ecommerceAccountPageLocator.LoginButton.click();

	  }

}

