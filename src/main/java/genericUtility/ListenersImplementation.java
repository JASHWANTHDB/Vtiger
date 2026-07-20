package genericUtility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersImplementation implements ITestListener {
	
	ExtentReports reports;
//	ExtentTest test;
	JavaUtility jutil = new JavaUtility();
	SeleniumUtility sutil = new SeleniumUtility();
	String p =  jutil.getCalanderDetails("dd-MM-YY hh-mm-ss");
	@Override
	public void onTestStart(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		System.out.println(methodname+"-- On test start executed");
		
		//test = reports.createTest(methodname);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		System.out.println(methodname+"-- On test Success executed");
		
		//test.log(Status.PASS, methodname+" -success");
	}
	
	public void onTestFailure(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		
//		test.log(Status.FAIL, methodname+" -failed");
//		test.log(Status.INFO, result.getThrowable());
		
		
		String screenshotName = methodname + "-" +p;
		try {
			//String path = 
					sutil.takeWebpageScreenshot(BaseClass.sdriver, screenshotName);
		//	test.addScreenCaptureFromPath(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(methodname+"-- On test failure executed");
		
		
		
		
	}
	
	public void onTestSkipped(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		System.out.println(methodname+"-- On test Skipped executed");
		
		//test.log(Status.SKIP, methodname+" - skipped");
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}
	
	 public void onTestFailedWithTimeout(ITestResult result) {
		  
	 }
	 
	 public void onStart(ITestResult result) {
		 String methodname = result.getMethod().getMethodName();
		 System.out.println(methodname+"-- On start executed");
		 
		 //configuration omf extent report
		 ExtentSparkReporter reporter = new ExtentSparkReporter("F:\\selenium\\VTiger\\Extent Report\\report"+p+".html");
		 reporter.config().setDocumentTitle("Extent Report");
		 reporter.config().setReportName("VTiger Report");
		 reporter.config().setTheme(Theme.DARK);
		 
		 //Generation of empty report
		 reports = new ExtentReports();
		 reports.attachReporter(reporter);
		 reports.setSystemInfo("Base OS", "Windows");
		 reports.setSystemInfo("BaseURL", "https://localhost:8888");
		 reports.setSystemInfo("Base Browsers", "Chrome");
	 }
	 
	 public void onfinish(ITestResult result) {
		 String methodname = result.getMethod().getMethodName();
		 System.out.println(methodname+"-- On finish executed");
		 
		 reports.flush();
	 }

}
