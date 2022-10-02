package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
WebDriver driver;


	
@FindBy(xpath="//img[@src='//assets-netstorage.groww.in/web-assets/billion_groww_desktop/prod/build/client/images/logo-dark-groww.83f43714.svg']")
 private WebElement  logo;


@FindBy(xpath="//span[text()='Login/Register']")
private WebElement login_button;


@FindBy(xpath="//input[@id='login_email1']")
private WebElement login_email;


@FindBy(xpath="//span[text()='Continue']")
private WebElement continue_butoon;


@FindBy(xpath="//input[@id='login_password1']")
private WebElement password_section;


@FindBy(xpath="//span[text()='Submit']")
private WebElement sumbit_butoon;

@FindBy(xpath="(//input[@type='number'])[1]")
private WebElement mpin1;


@FindBy(xpath="(//input[@type='number'])[2]")
private WebElement mpin2;


@FindBy(xpath="(//input[@type='number'])[3]")
private WebElement mpin3;

@FindBy(xpath="(//input[@type='number'])[4]")
private WebElement mpin4;


public Homepage(WebDriver driver)
{
this.driver=driver;
PageFactory.initElements(driver, this);
}


public  boolean logopresent() 
{
boolean flaglogo=logo.isDisplayed()	;
return  flaglogo;
}
public void loginbutt()
{
login_button.click();
}

public void emailid(String email)
{
login_email.sendKeys(email);
}

public void continbutton() 
{
	continue_butoon.click();	
}

public void enterpassword(String pass1)
{
	password_section.sendKeys(pass1);	
}

public void finalsumbit() 
{
sumbit_butoon.click();	
}

public void enterpin()
{
	mpin1.sendKeys("9");
	mpin2.sendKeys("0");
	mpin3.sendKeys("7");
	mpin4.sendKeys("4");
	
}



}
