package com.Listeners;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager {
	public static ExtentReports extent;

	public static ExtentReports getInstance() {

		if (extent == null) {
			extent = createInstance();
			return extent;
		} else {
			return extent;
		}

	}

	public static ExtentReports createInstance() {

		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(
		System.getProperty("user.dir") + "/Report/OHRMProjectReport.html");
		sparkReporter.config().setTheme(Theme.DARK);
		sparkReporter.config().setReportName("NewTEstReport");
		sparkReporter.config().setDocumentTitle("Sprint 1 Report");

		ExtentReports extent = new ExtentReports();
		extent.attachReporter(sparkReporter);

		extent.setSystemInfo("Machine name", "Dell");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester Name", "Sai Priya");
		extent.setSystemInfo("OS", "Windows 11");
		extent.setSystemInfo("Browser Name", "Chrome");

		return extent;
	}

}


