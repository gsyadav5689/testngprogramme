import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class groupsdemo {
	@Test(groups= {"Hero motors"})
	  public void splender() {
	  System.out.println("splender");
	  }
	  @Test(groups= {"Bajaj motors"})
	  public void pulsar() {
		  System.out.println("pulsar");
	  }
	  @Test(groups= {"Bajaj motors"})
	  public void ct100() {
		  System.out.println("ct100");
		  }
	  @Test(groups= {"Hero motors"})
	  public void passion() {
		  System.out.println("passion");
		  }
	  @Test(groups= {"Bajaj motors"})
	  public void avenger() {
		  System.out.println("avenger");
		  }
	  @BeforeTest(groups={"Bajaj motors","Hero motors"})
	  public void start() {
		  System.out.println("start the programme");
	  }
	  @AfterTest(groups={"Bajaj motors","Hero motors"})
	  public void end() {
		  System.out.println("end of the programme");
	  }
	  
}
