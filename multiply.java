import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class multiply {
	@Test
	@Parameters({"val1","val2"})
	public void product(int v1,int v2) {
		int result=v1*v2;
		System.out.println("product v1 & v2= "+result);
	}
}
