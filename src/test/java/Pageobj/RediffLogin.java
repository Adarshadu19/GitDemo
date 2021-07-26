package Pageobj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLogin {

	WebDriver driver ;
	public RediffLogin(WebDriver driver)
	{
		this.driver=driver;
	}
	By username= By.xpath("//input[@id='login1']");
	By password= By.xpath("//input[@id='password']");
	By signin = By.xpath("//input[@type='submit']");
	By forget = By.xpath("//u[contains(text(),'Forgot Password?')]");
	
	public WebElement Emailid()
	{
		return driver.findElement(username);
	}
	public WebElement Pass()
	{
		return driver.findElement(password);
	}
	public WebElement Submit()
	{
		return driver.findElement(signin);
	}
	public WebElement Word()
	{
		return driver.findElement(forget);
	}
	
}
