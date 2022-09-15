package Seleniumexamplee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         System.setProperty("webdriver.chrome.driver", "C://Users//admin//Desktop//New folder//selenium//chromedriver.exe");
        // System.setProperty("webdriver.gecko.driver",null);
         WebDriver driver = new ChromeDriver();
         driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
         //these lines of codes are the interpreter(the above 3)
         driver.manage().window().maximize();    //how to maaxamize
         //how to pass value of usernsme
         driver.findElement(By.name("txtUsername")).sendKeys("Admin");
         driver.findElement(By.id("txtPassword")).sendKeys("admin123");
         driver.findElement(By.id("btnLogin")).click();
         driver.findElement(By.id("welcome")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();       
         Thread.sleep(3000);
         driver.close();
         
         
	}
	
}
