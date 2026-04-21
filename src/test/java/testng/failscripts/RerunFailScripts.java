package testng.failscripts;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RerunFailScripts implements IRetryAnalyzer {

    int start = 0;
    int end = 3;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (start < end){
            start++;

            return true;
        }
        return false;
    }
}
