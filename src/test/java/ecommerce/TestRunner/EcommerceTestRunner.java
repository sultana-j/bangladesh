package ecommerce.TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import ecommerce.utility.ecommerceBase;

@CucumberOptions(features = {"src/test/resourcess/ecommerceAllFeatures"},
plugin = {"json:target/cucumber.json"},
glue = "ecommerceStepdefinition " )//tags={""})


public class EcommerceTestRunner extends AbstractTestNGCucumberTests{
	
 @BeforeTest
 public void EcommerceStartURL() {
	 ecommerceBase Estart =new ecommerceBase ();
	 Estart.EcommerceBrowserSetup();
  }
	 
 @AfterTest
 public void EcommerceCloseBrowser() {
	 ecommerceBase Estart =new ecommerceBase ();
	 Estart.driver.quit();
	 
 }
}