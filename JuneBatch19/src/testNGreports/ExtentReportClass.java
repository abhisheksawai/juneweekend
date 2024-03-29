package testNGreports;

import java.io.File;

import org.junit.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportClass {
	
	ExtentReports extent;
	ExtentTest test;

	@BeforeTest
	
	public void startTest()
	{
		extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/MyExtentReport.html", true);
		extent.addSystemInfo("Hostname","Abhijeet")
		.addSystemInfo("Environment","QA")
		.addSystemInfo("username","abhi");
		
		extent.loadConfig(new File(System.getProperty("user.dir")+"/extent.config"));
		
	}
	
	@Test
	
	public void demoReportPass()
	{
		test = extent.startTest("demoReportPass");
		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Assert Pass as conditon is True");
	}

	@Test
	
	public void demoReportFail()
	{
		test = extent.startTest("demoReportFail");
		Assert.assertTrue(false);
		test.log(LogStatus.FAIL, "Assert Fail as conditon is False");
	}
	

	@AfterMethod

	public void getResult(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(LogStatus.FAIL, result.getThrowable());
			
		}
		
		extent.endTest(test);
	}
		
		@AfterTest
		public void endReport()
		{
			extent.flush();
			extent.close();
		}
	}


