import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

public class flipkartgroupdemo {
	public WebDriver driver;
	
  @Test//(priority=1,groups="f")
  public void f() {
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  WebElement search=driver.findElement(By.xpath("//input[@title='Search for products, brands and more' and @class='_3704LK' ]"));
		//actions.keyDown(search,Keys.SHIFT);
	  Actions actions= new Actions(driver);
	  actions.sendKeys(search,"hp laptops").perform();
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  System.out.println(driver.getTitle());
		
  }
 
  @Test//(priority=2,groups="m")
  public void m() {
	  WebElement search=driver.findElement(By.xpath("//input[@title='Search for products, brands and more' and @class='_3704LK' ]"));
		//actions.keyDown(search,Keys.SHIFT);
	  Actions actions= new Actions(driver);
	  actions.sendKeys(search,"dell laptops").perform();
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  System.out.println(driver.getTitle());
		
	  String g=driver.getTitle();
	  System.out.println(g);
  }
  @BeforeMethod //(groups={"f","m"})
  public void beforeTest() {
	    System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
  }

  @AfterMethod
  public void afterTest() {
	  	  driver.close();
  }

}
