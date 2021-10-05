package com.wbl.extentreportlistener;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentReporterNG {
	 static ExtentReports extent;
	public static ExtentReports getReportObject() {
		
		String path=System.getProperty("user.dir")+"\\reports\\Extent.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("Web AUtomation resutls");;
		reporter.config().setDocumentTitle("Test Results");
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Bhavana");
		return extent;
	}
}
