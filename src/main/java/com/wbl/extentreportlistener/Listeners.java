                                                                                                                                                                         package com.wbl.extentreportlistener;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.wbl.base.TestBase;
import com.wbl.util.TestUtil;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Listeners extends TestBase implements ITestListener{

	public Listeners() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	ExtentReports extent= ExtentReporterNG.getReportObject();
	ExtentTest test;
	public static Logger log=LogManager.getLogger(Listeners.class);
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test=extent.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		test.generateLog(Status.PASS, "Test Passed");
		log.info("suceffuly passed testcase: "+result.getMethod().getMethodName()+"in method: " +result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("failed the execution");
		System.out.println("test case failed at :"+result.getName());
		test.fail(result.getThrowable());
		try {
			test.fail("failed screenshot",MediaEntityBuilder.createScreenCaptureFromPath(TestUtil.takeScreenshotAtEndofTest()).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.error(" failed testcase: "+result.getMethod().getMethodName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
	}

}
