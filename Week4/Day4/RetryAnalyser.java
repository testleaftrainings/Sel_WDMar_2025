package week4.day4;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer {
	
	//true-It will retry
	//false-It will not retry
	int count=0;

	public boolean retry(ITestResult result) {
		//count<2     0<2
		//count<2     1<2
		//count<2      2<2
		if(count<2) {
			count++;    //count=2     retry=2
			return true;
		}
		return false;
	}

}
