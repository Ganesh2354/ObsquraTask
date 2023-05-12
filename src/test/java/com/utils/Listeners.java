package com.utils;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	
	ExtentTest test;
	ExtentReports extent=ExtentReportGenerator.generateReport();
	
	ThreadLocal<ExtentTest> extenttest=new ThreadLocal<ExtentTest>();
	
	public void onTestStart(ITestResult result) {
		test=extent.createTest(result.getTestClass().getName()+"***"+result.getMethod().getMethodName());
		extenttest.set(test);
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "test case passed");
	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "test case failed");
	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "test case skipped");
	}

	public void onFinish(ITestContext context) {
		extent.flush();
	}
	
}