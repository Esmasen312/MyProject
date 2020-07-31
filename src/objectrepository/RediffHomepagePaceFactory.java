package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomepagePaceFactory {
	
	
	
	WebDriver driver;
	
	public RediffHomepagePaceFactory(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	/*By shopping=By.id("srchword");
	By submit=By.xpath("//input[@class='newsrchbtn']");
	By Home=By.linkText("rediff.com");*/
	
	@FindBy(id="srchword")
	WebElement shopping;
	
	@FindBy(xpath="//input[@class='newsrchbtn']")
	WebElement submit;
	
	@FindBy(linkText="rediff.com")
	WebElement Home;
	
	@FindBy(linkText="Create Account")
	WebElement CreateAccount;
	
	public WebElement shop()
	{
		return shopping;
	}
	
	public WebElement submit()
	{
		return submit;
	}
	public WebElement Home()
	{
		return Home;
	}

	public WebElement CreateAccount()
	{
		return CreateAccount;
	}
}
