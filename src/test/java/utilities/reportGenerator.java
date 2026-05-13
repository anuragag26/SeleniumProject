package utilities;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class reportGenerator {

    public static ExtentReports extent;
    public static ExtentTest test;

    @BeforeSuite
    public void startReport() {

        extent = new ExtentReports(
                System.getProperty("user.dir")
                + "\\TestResults\\testresults.html",
                true);
    }

    @AfterMethod
    public void getResult(ITestResult result) {

        if (result.getStatus() == ITestResult.FAILURE) {

            test.log(LogStatus.FAIL, "Test Failed");
        }

        else if (result.getStatus() == ITestResult.SUCCESS) {

            test.log(LogStatus.PASS, "Test Passed");
        }
    }

    @AfterSuite
    public void tearDown() {

        extent.flush();
    }
}