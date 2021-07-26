package Pageobj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHome {

	WebDriver driver ;
	public RediffHome(WebDriver driver)
	{
		this.driver=driver;
	}
	By search = By.xpath("//input[@id='srchword']");
	By click =By.xpath("//body[1]/div[3]/div[2]/div[1]/form[1]/input[1]");
	public WebElement Search()
	{
		return driver.findElement(search);
	}
	public WebElement Click()
	{
		return driver.findElement(click);
	}
	
}
