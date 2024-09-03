package extentreports1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentTestNGITestListener implements ITestListener
{
	 private static ExtentReports extentReports;

	    private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();

	    @Override
	    public void onStart(ITestContext context) {
	    
	  
	          
	          
	        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/reports/myreport.html");
	        extentReports = new ExtentReports();
	       extentReports.attachReporter(sparkReporter);
	       
	       sparkReporter.config().setDocumentTitle("Automation Report"); // Title of Report
	        sparkReporter.config().setReportName("Functional Testing");   // Name of Report
	        sparkReporter.config().setTheme(Theme.DARK);
	        
	        extentReports.setSystemInfo("Computer Name", "localhost");
	        extentReports.setSystemInfo("Environment", "QA");
	        extentReports.setSystemInfo("Tester Name", "Gayathri");
	        extentReports.setSystemInfo("OS", "Windows 10");
	        extentReports.setSystemInfo("Browser", "Chrome");
	    }

	    @Override
	    public void onTestStart(ITestResult result) {
	        ExtentTest test = extentReports.createTest(result.getMethod().getMethodName());
	        extentTest.set(test);
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        extentTest.get().pass("Test passed");
	    }

	    @Override
	    public void onTestFailure(ITestResult result1) {
	        extentTest.get().fail(result1.getThrowable());
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	        extentTest.get().skip("Test skipped");
	    }

	    @Override
	    public void onFinish(ITestContext context) {
	        extentReports.flush();
	    }
}
