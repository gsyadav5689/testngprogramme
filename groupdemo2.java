import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class groupdemo2 {
	public WebDriver driver;
	//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	//WebDriver driver=new ChromeDriver();
	
	@BeforeTest(groups= {"m1","m2"})
	public void aliceblueLaunch() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://ant.aliceblueonline.com/");
		driver.manage().window().maximize();
				
	}
@Test(priority=1,groups="m1")
public void m1() {
	
	WebElement username=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div[1]/form/div[1]/div/input"));
	WebElement password=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div[1]/form/div[2]/div/input"));
	WebElement loginbtn=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div[1]/form/button/span[1]"));
	
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	username.sendKeys("AB142445");
	password.sendKeys("GS44@YADAV");
	loginbtn.click();
}
@Test(priority=2,groups="m2")
	public void m2() {
	
    String title=driver.getTitle();
    String title2="Ant Web";
    Assert.assertEquals(title, title2);
    System.out.println("test m2 pass");
    //Assert.assertEquals(title, title);
	//System.out.println(title);
	
}
@AfterTest
public void close() {
	//driver.close();
}
}
