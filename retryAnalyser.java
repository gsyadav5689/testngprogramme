import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retryAnalyser implements IRetryAnalyzer{

	@Override
	public boolean retry(ITestResult result) {
		int counter = 0;
		 int retryLimit =2;
		 if(counter < retryLimit)
		 {
		 counter++;
		 return true;
		 }
		 return false;
	
	}

}
