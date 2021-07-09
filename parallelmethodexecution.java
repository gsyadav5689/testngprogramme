import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ireporter.class)
public class parallelmethodexecution {
public WebDriver driver;
@Test
public void launchfirefox() {
	System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("https://kite.zerodha.com");

	driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("TH4619");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("GS22@YADAV");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	String title=driver.getTitle();
	System.out.println(title);
}
@Test
public void launchchrome() {
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://kite.zerodha.com");

		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("TH4619");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("GS22@YADAV");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String title=driver.getTitle();
		System.out.println(title);
	
}
@Test
public void exception() {
	Assert.assertTrue(false);
}
}
