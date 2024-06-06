package homework_5_7th_2023;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Onurs_MyListeners   implements ITestListener
{
	public void onStart(ITestContext context) {
		System.out.println("test on start........");
	}
	 public void onTestStart(ITestResult result) {
	System.out.println("test started........");
}
   public void onTestSuccess(ITestResult result) {
    System.out.println("test successed........");
   }
   public void onTestFailure(ITestResult result) {
	    System.out.println("test failed........");
   }
   public void onTestSkipped(ITestResult result) {
	    System.out.println("test skipped........");
  }
   public void onFinish(ITestContext context) {
	    System.out.println("test finished........");
  }
   
	
  
   
}
