package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RediffLoginpagePFactory {
	
	
	
	
	
	WebDriver driver;

	public RediffLoginpagePFactory(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	/*By username=By.xpath("//input[@name='login']");
	By password=By.xpath("//input[@name='passwd']");
	By singin=By.name("proceed");
	By Home=By.linkText("rediff.com");*/
	
	
	//How to write simply them?   Pace factory= @FindBy annotation
	
    @FindBy(xpath="//input[@name='login']")
    WebElement username;
    @FindBy(xpath="//input[@name='passwd']")
    WebElement password;
    @FindBy(name="proceed")
    WebElement singin;
    
    @FindBy(linkText="rediff.com")
    WebElement Home;
	
	public WebElement Emailid()
	{
	return username;	
	}
	
	public WebElement Password()
	{
		return password;
	}
	
	public WebElement Singin()
	{
		return singin;
	}
	
	public WebElement HomePage()
	{
		return Home;
	}
	

}
