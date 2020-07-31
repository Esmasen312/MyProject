package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginpage {
	
	
	
	WebDriver driver;
	
	public RediffLoginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	By username=By.xpath("//input[@name='login']");
	By password=By.xpath("//input[@name='passwd']");
	By singin=By.name("proceed");
	By Home=By.xpath("//div[@class='cell logo']//a");
	
	public WebElement Emailid()
	{
	return driver.findElement(username);	
	}
	
	public WebElement Password()
	{
		return driver.findElement(password);
	}
	
	public WebElement Singin()
	{
		return driver.findElement(singin);
	}
	
	public WebElement HomePage()
	{
		return driver.findElement(Home);
	}
	

}
