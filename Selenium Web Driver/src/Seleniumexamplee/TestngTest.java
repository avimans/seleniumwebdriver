package Seleniumexamplee;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class TestngTest {
	//if thte web driver is defined in the class it is accesssible to all method
	//if we need to test a product again and agin ,we want to automation to run it science it will beocoe ted=ious and time consuming
	WebDriver driver;
 
   @BeforeTest
    public void beforeTest() 
   {
	   System.setProperty("webdriver.chrome.driver", "C://Users//admin//Desktop//New folder//selenium//chromedriver.exe");
	    driver = new ChromeDriver();
	   driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	                                                 //get title is ti get the title of the webpage ,and store it in a string variable callewd title
	   String Title=driver.getTitle();
	   String url=driver.getCurrentUrl();
	   System.out.println(Title+"  "+url);
	   Assert.assertEquals(Title,"OrangeHRM");
	   Assert.assertEquals(url,"https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	   
   }
  @Test
  public void f() throws InterruptedException
  {
	  driver.manage().window().maximize();      
	  //how to maaxami    //how to pass value of usernsme
  driver.findElement(By.name("txtUsername")).sendKeys("Admin");
   //if i want to fetch the data(what we stored) from the application ,,,,,value/name is an attribute and the value of a value is the userbname
  String username= driver.findElement(By.name("txtUsername")).getAttribute("value");     //<-------ASK
  System.out.println(username);
  Assert.assertEquals(username, "Admin");
  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
  String password= driver.findElement(By.id("txtPassword")).getAttribute("value");
  System.out.println(password);
  Assert.assertEquals(password, "admin123");
  driver.findElement(By.id("btnLogin")).click();
  String login= driver.findElement(By.id("btnLogin")).getAttribute("value");
  System.out.println(login);
  driver.findElement(By.id("welcome")).click();
  driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a"));
  Thread.sleep(3000);
  driver.close();                     
  /*if my chrome driver the browser is updated we canoot use this code so now we hav e to do what?
   * 
   */
  
  }

}
