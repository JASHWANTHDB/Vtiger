package genericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnayzerImplementation implements IRetryAnalyzer{

	
	int i = 0;
	int count = 3;
	@Override
	public boolean retry(ITestResult result) {
		
		while(i<count) {
			i++;
			return true;
		}
		return false;
	}

}
