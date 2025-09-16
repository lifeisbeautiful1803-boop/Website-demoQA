package MyPackage;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
	
	  public void onTestSuccess(ITestResult result)
	  {
		    System.out.println("I sucsess");
		  }
	  public void onTestFailure(ITestResult result) 
	  	{
		    System.out.println("I fail" +result.getName());
		  }

}
