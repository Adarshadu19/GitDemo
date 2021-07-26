package Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pageobj.RediffHome;
import Pageobj.RediffLogin;
import Pageobj.RediffLoginPagefactory;

public class Loginapp {

	@Test
	public void Login()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	RediffLoginPagefactory ra=new RediffLoginPagefactory(driver);
	//Page factory format
	ra.Emailid().sendKeys("ad");
	ra.Pass().sendKeys("123");
	ra.Submit().click();
	//Page object format
	/*RediffLogin rd=new RediffLogin(driver);
	rd.Emailid().sendKeys("adarsh");
	rd.Pass().sendKeys("ada");
	rd.Submit().click();
	rd.Word().click();
	RediffHome re=new RediffHome(driver);
	driver.get("https://www.rediff.com/");
	re.Search().sendKeys("adarsh");
	re.Click().click();*/
		
}
}