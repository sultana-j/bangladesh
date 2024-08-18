package ecommerceStepdefinition;






import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import ecommerce.PageActions.EcommerceAccountPageActions;
import ecommerce.PageActions.EcommerceHomePageActions;
import ecommerce.PageActions.EcommerceProfilePageActions;
import ecommerce.utility.ecommerceBase;
public class UserLogin  extends ecommerceBase {
	EcommerceAccountPageActions ecommerceAccountPageActions = new EcommerceAccountPageActions ();
	EcommerceHomePageActions ecommerceHomePageActions = new EcommerceHomePageActions ();
	EcommerceProfilePageActions ecommerceProfilePageActions = new EcommerceProfilePageActions ();
	

	@Given("^open ecommerce \"([^\"]*)\" application$")
	public void open_ecommerce_application(String URL) throws Throwable {
		EcommerceURLSetup(URL);
	    
	}
		    
		    
		


		@Then("^click account link$")
		public void click_account_link() throws Throwable {
		    
			ecommerceHomePageActions.clickaccountlink();   
		}
		@Then("^Enter user name and password and click login$")
		public void enter_user_name_and_password_and_click_login() throws Throwable {
			ecommerceAccountPageActions.EcommerceCard(EcommerceProp.getProperty("EcommerceUserName1"),EcommerceProp.getProperty ("EcommercePassword1"));	
			
		}
	
		@Then("^verify user login successfully$")
		public void verify_user_login_successfully() throws Throwable {
		    
			ecommerceProfilePageActions.Verifyuserloginsuccessfully();  
		}


}
