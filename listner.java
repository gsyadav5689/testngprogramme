import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listner implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		 System.out.println("New Test Started " +result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess Method " +result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure Method " +result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped Method " +result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage " +result.getName());
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestFailedWithTimeout "+result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onStart(context);
		 System.out.println("onStart method started");	
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish method started");
		
	}

}
