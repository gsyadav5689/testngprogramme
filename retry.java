import org.testng.Assert;
import org.testng.annotations.Test;

public class retry {
	@Test(retryAnalyzer = retryAnalyser.class)
	 public void Test1()
	 {
	 Assert.assertEquals(true, true);
	 }
	 
	 @Test
	 public void Test2()
	 {
	 Assert.assertEquals(false, true);
	 }

}
