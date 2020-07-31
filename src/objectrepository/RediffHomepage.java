package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomepage {
	
	
	
	WebDriver driver;
	
	public RediffHomepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	By shopping=By.id("srchword");
	By submit=By.xpath("//input[@class='newsrchbtn']");
	
	public WebElement shop()
	{
		return driver.findElement(shopping);
	}
	
	public WebElement submit()
	{
		return driver.findElement(submit);
	}

}
