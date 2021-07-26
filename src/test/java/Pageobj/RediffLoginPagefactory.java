package Pageobj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPagefactory {

	WebDriver driver ;
	public RediffLoginPagefactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='login1']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement signin;
	
	@FindBy(xpath="//u[contains(text(),'Forgot Password?')]")
	WebElement forget;
	
	public WebElement Emailid()
	{
		return (username);
	}
	public WebElement Pass()
	{
		return (password);
	}
	public WebElement Submit()
	{
		return (signin);
	}
	public WebElement Word()
	{
		return (forget);
	}
	
}
