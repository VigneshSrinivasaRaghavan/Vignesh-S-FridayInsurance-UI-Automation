package listeners;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import reports.ExtentLogger;
import reports.ExtentReport;

import java.util.Arrays;

public class Listener implements ITestListener, ISuiteListener {

    @Override
    public void onStart(ISuite suite) {
        ExtentReport.initReports();
    }

    @Override
    public void onFinish(ISuite suite) {
        ExtentReport.flushReports();
    }

    @Override
    public void onTestStart(ITestResult result) {
        ExtentReport.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentLogger.pass(result.getMethod().getMethodName() + " is passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ExtentLogger.fail(result.getMethod().getMethodName() + " is failed");
        ExtentLogger.fail(result.getThrowable().toString());

        String exceptionMessage = Arrays.toString(result.getThrowable().getStackTrace());
        String message = "<details><summary><b><font color=red> Exception occurred, click to see details: "
                + " </font></b>" + "</summary>" + exceptionMessage.replaceAll(",", "<br>")
                + "</details> \n";

        ExtentLogger.fail(message);

        String logText = "<b>" + result.getMethod().getMethodName() + " is failed.</b>";
        Markup markup_message = MarkupHelper.createLabel(logText, ExtentColor.RED);
        ExtentLogger.fail(markup_message);
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ExtentLogger.skip(result.getMethod().getMethodName() + " is skipped");
    }
}
