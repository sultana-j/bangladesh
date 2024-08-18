package ecommerceStepdefinition;

import cucumber.api.java.en.Then;
import ecommerce.PageActions.EcommerceHomePageActions;
import ecommerce.PageActions.EcommerceSignupPageActions;
import ecommerce.PageLocators.EcommerceSignupPageLocator;
import ecommerce.utility.EcommerceTestData;
import ecommerce.utility.ecommerceBase;

public class UserRegistration extends ecommerceBase{
	
	EcommerceSignupPageActions 	ecommerceSignupPageActions =new EcommerceSignupPageActions();
	EcommerceHomePageActions ecommerceHomePageActions =new EcommerceHomePageActions();
	
	@Then("^click Signup link$")
	public void click_Signup_link() throws Throwable {
	    
	    
	}


	
	@Then("^Enter user name and email and password and click sign up$")
	public void enter_user_name_and_email_and_password() throws Throwable {
		ecommerceSignupPageActions.EcommerceSignUpCard(EcommerceTestData.SignupUserName1,EcommerceTestData.SignupPassword1); 
		ecommerceSignupPageActions.Allert();
	}

	    

	

	@Then("^verify user register successfully$")
	public void verify_user_register_successfully() throws Throwable {
		ecommerceHomePageActions.UserRegisterSuccessfully(); 
	}

	

}
