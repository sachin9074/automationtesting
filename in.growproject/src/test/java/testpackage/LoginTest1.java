package testpackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobject.Homepage;

public class LoginTest1
{
	public WebDriver driver;
	@BeforeMethod
	public void launchbrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\testing data\\automation\\chromedrivernew\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://groww.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
	}
	@Test
	public void loginintoapp() 
	{
		Homepage homepageobject =new Homepage(driver);	
		homepageobject.loginbutt();
		homepageobject.emailid("sachinsinghtomar6@gmail.com");
		homepageobject.continbutton();
		homepageobject.enterpassword("Coco@1995");
		homepageobject.finalsumbit();
		
	}
	@AfterMethod
	public void quitbrowser() 
	{
		driver.quit();
	}
}
