package ecommerce.PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ecommerce.utility.ecommerceBase;

public class EcommerceProfilePageLocator extends ecommerceBase {
	public EcommerceProfilePageLocator () {
		PageFactory.initElements(driver,this );
	}

	@FindBy(id  =("nameofuser"))
	public WebElement MyProfile;
	
	
	

	}


