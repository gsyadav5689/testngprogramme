import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class priority2 {
	  @Test
	  public void a() {
	  System.out.println("first");
	  }
	  @Test(priority=1)
	  public void b() {
		  System.out.println("second");
	  }
	  @Test
	  public void c() {
		  System.out.println("third");
		  }
	  @Test(priority=-1)
	  public void d() {
		  System.out.println("fourth");
		  }
	  @Test
	  public void e() {
		  System.out.println("fifth");
		  }
	  @Test
	  public void f() {
		  System.out.println("sixth");
		  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("beforemethod");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("aftermethod");
	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("beforeclass");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("afterclass");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("beforetest");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("aftertest");
	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("beforeSuit");
	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("afterSuit");
	  }
}
