import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners(listner.class)
public class HardAssertDemo {
	WebDriver driver;
@Test
public void launchbrowser() {
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	  driver=new ChromeDriver();
	driver.get("https://kite.zerodha.com");
	String ExpectedTitle=driver.getTitle();
	String ActualTitle="Kite - Zerodha's fast and elegant flagship trading Platform";
	Assert.assertEquals(ActualTitle, ExpectedTitle);
	System.out.println("launchbrowser test pass");
	System.out.println(driver.getClass());
	//driver.close();
}
@Test
public void testclose() {
	driver.close();
	System.out.print("test close pass");
}
@Test
public void y1() {
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	  driver=new ChromeDriver();
	driver.get("https://kite.zerodha.com");
	String ExpectedTitle=driver.getTitle();
	String ActualTitle="Kite - Zerodha's fast and elegant flagship trading platform";
	SoftAssert sasert=new SoftAssert();
	sasert.assertEquals(ActualTitle, ExpectedTitle);
	
	System.out.println("y1 test pass ");
	System.out.println(driver.getClass());
	sasert.assertAll();
	driver.close();
}
}
