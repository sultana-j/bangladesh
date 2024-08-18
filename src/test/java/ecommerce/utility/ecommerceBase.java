package ecommerce.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ecommerceBase {
	
	public static WebDriver driver;
	public static Properties EcommerceProp;
	//constructor
	public ecommerceBase() {
		try {
			FileInputStream EcommerceFile =new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\ecommerce\\config\\EcommerceConfiguration.properties");
			 EcommerceProp =new Properties();
			 EcommerceProp.load(EcommerceFile);
		} catch (FileNotFoundException e) {
			System.out.println("please fix your constructor");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	//browser setup
	
	public void EcommerceBrowserSetup () {
	String EcommerceAllBrowser =	EcommerceProp.getProperty("EcommerceBrowser1");
	if(EcommerceAllBrowser.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ecommerceDriver\\chromedriver.exe");
		ChromeOptions tom = new ChromeOptions();
		tom.addArguments("--remote-allow-origins-*");
		 driver =new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(EcommerceUtility.implicitlyWait));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(EcommerceUtility.pageLoadTimeout));
        driver.manage().deleteAllCookies();
}	
	

	
	else if(EcommerceAllBrowser.equals("IE")) 
	{
	
	}

	}
	
//URL set up
	public static void EcommerceURLSetup(String URL) {
		driver.get(EcommerceProp.getProperty("EcommerceURL"));
	}
	
	
	
}