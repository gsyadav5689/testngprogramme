import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowser {
public WebDriver driver;
@Parameters({"browser"})
@BeforeClass
void launchbrowser(String browser) {
	if(browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		driver=new FirefoxDriver();
	
	}else if (browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		 driver=new ChromeDriver();
		
	}
}
@Test
public void login() {
driver.get("https://kite.zerodha.com");

driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("TH4619");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("GS22@YADAV");
driver.findElement(By.xpath("//button[@type='submit']")).click();
String title=driver.getTitle();
System.out.println(title);
}
@AfterClass
	public void close() {
	String title1=driver.getTitle();
	System.out.println(title1);
		//driver.quit();
	}
}


