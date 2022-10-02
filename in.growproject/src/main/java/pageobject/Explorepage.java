package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Explorepage
{
WebDriver driver;

@FindBy(xpath="//input[@id='globalSearch23']")
private WebElement serachbox;


@FindBy(xpath="//span[text()='Stocks']")
private WebElement stockoptionunderserchbox;

@FindBy(xpath="//span[text()='Tata Consultancy Services Ltd.']")
private WebElement stocksearchsesult;

public Explorepage(WebDriver driver)
{
this.driver=driver;
PageFactory.initElements(driver, this);
}

public void searchthestock(String stockname) 
{
	
	 serachbox.sendKeys(stockname);
	 stockoptionunderserchbox.click();
		stocksearchsesult.click();
}



}
