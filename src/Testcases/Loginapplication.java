package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.RediffHomepage;
import objectrepository.RediffHomepagePaceFactory;
import objectrepository.RediffLoginpage;
import objectrepository.RediffLoginpagePFactory;







public class Loginapplication {
	//Login  page class implemented in normal page object model style
	//Home page class implemented in page factory method 
	
	@Test
	public void Login()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	RediffLoginpage rd=new RediffLoginpage(driver);
    rd.Emailid().sendKeys("hello");
    rd.Password().sendKeys("1234");
    rd.Singin().click();
    rd.HomePage().click();
    
    
    
    RediffHomepagePaceFactory hp=new RediffHomepagePaceFactory(driver);
    hp.shop().sendKeys("phone");
    hp.submit().click();
    hp.Home().click();
    hp.CreateAccount().click();
	}

}
