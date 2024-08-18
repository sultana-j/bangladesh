package ecommerce.PageActions;

import ecommerce.PageLocators.EcommerceSignupPageLocator;
import ecommerce.utility.ecommerceBase;

public class EcommerceSignupPageActions extends ecommerceBase {
	 
	EcommerceSignupPageLocator ecommerceSignupPageLocator =new EcommerceSignupPageLocator ();
	  public void EcommerceSignUpCard (String U,String P) throws InterruptedException {
		  Thread.sleep(6000);
		  ecommerceSignupPageLocator.SignUpUserName.sendKeys(U);
		  ecommerceSignupPageLocator.SignUpPassword.sendKeys(P);
		  ecommerceSignupPageLocator.SignUpButton.click();
		  
		  Thread.sleep(6000);	
}
public void Allert	()  {
	driver.switchTo().alert().accept();
}

	  }	  