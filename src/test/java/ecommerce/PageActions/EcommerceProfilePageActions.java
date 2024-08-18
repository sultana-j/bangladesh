package ecommerce.PageActions;


import org.testng.Assert;

import ecommerce.PageLocators.EcommerceProfilePageLocator;
import ecommerce.utility.ecommerceBase;

public class EcommerceProfilePageActions extends ecommerceBase {
	EcommerceProfilePageLocator ecommerceProfilePageLocator = new EcommerceProfilePageLocator();
			
	public void Verifyuserloginsuccessfully () {
		boolean Profileverification =ecommerceProfilePageLocator.MyProfile.isDisplayed();
		Assert.assertTrue(Profileverification);
		
		
		
		
	}

}
