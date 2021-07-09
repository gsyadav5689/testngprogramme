import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class browserparameter {
public WebDriver driver;
@Test
@Parameters({"browser"})
public void browsertest(String browser) {
	if(browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		
	}else if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		
	}
	
}

}
