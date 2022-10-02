package testpackage;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageobject.Explorepage;
import pageobject.Homepage;

public class Logintest
{
public WebDriver driver;
public Homepage homepageobject ;
public Explorepage Explorepageobject ;

@Parameters("browser")
@BeforeSuite
public void launchbrowser(String browser) 
{
if(browser.equalsIgnoreCase("chrome"))
{
System.setProperty("webdriver.chrome.driver","D:\\testing data\\automation\\chromedrivernew\\chromedriver.exe");
driver=new ChromeDriver();
}
else if (browser.equalsIgnoreCase("edge"))
{
System.setProperty("webdriver.edge.driver","D:\\testing data\\automation\\edgrivernew\\msedgedriver.exe");
driver=new EdgeDriver();	
}
else if (browser.equalsIgnoreCase("firefox"))
{
System.setProperty("webdriver.geecko.driver","D:\\testing data\\automation\\chromedrivernew\\chromedriver.exe");
driver=new ChromeDriver();
}	
}

@BeforeTest
public void creatreobjects()
{
homepageobject =new Homepage(driver);
Explorepageobject  =new Explorepage(driver);
}

@Parameters("myurl")
@BeforeMethod
 void launchbroser(String myurl)
{
driver.get(myurl);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));	
}

@Test(priority=1)
public void  loginintoapp() 
{
homepageobject.loginbutt();
homepageobject.emailid("sachinsinghtomar6@gmail.com");
homepageobject.continbutton();
homepageobject.enterpassword("Coco@1995");
homepageobject.finalsumbit();
homepageobject.enterpin();

}

@Test(priority=2,dependsOnMethods= {"loginintoapp"})
public void exploretheapp() throws InterruptedException 
{
Thread.sleep(2000);
Explorepageobject.searchthestock("Tcs");

}

@AfterMethod
public void quitbrowser() throws InterruptedException 
{
Thread.sleep(20000);
//driver.quit();
}
}
