package ecommerce.PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ecommerce.utility.ecommerceBase;

public class EcommerceSignupPageLocator extends ecommerceBase {
	public EcommerceSignupPageLocator () {
		PageFactory.initElements(driver,this );
	}

	@FindBy(id  =("sign-username"))
	public WebElement SignUpUserName;
	
	@FindBy(id = ("sign-password"))
	public WebElement SignUpPassword;
	
	@FindBy(xpath =  ("//button[text()='Sign up' ]"))
	public WebElement SignUpButton;
	

}
