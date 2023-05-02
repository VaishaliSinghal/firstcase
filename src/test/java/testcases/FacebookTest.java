package testcases;

import org.testng.annotations.Test;

import core.Page;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;

public class FacebookTest extends Page
{
	     
  @Test(dataProvider = "loginData")
  public void test(String id, String pwd) 
  {
	  // reading xpath from properties
	 String uid =  p.getProperty("userid");
	 String pw =  p.getProperty("password");
	 String sub = p.getProperty("submit");
	
	 
	 System.out.println("facebook test called" +uid);
	 driver.findElement(By.xpath(uid)).sendKeys(id);
	 driver.findElement(By.xpath(pw)).sendKeys(pwd);
	 driver.findElement(By.xpath(sub)).click();
	 
	// uid.sendKeys(userid);
	// pwd.sendKeys(password);
	// btn.click();
  }

  @DataProvider
  public Object[][] loginData() throws Exception 
  {
    return utility.POIConfig.getData("C:\\Users\\gamma\\Desktop\\Testingcourse\\Book3.xls", "Sheet1");
  }
}
