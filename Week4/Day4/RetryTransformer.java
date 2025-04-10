package week4.day4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;


public class RetryTransformer implements org.testng.IAnnotationTransformer{

	public void transform(
		      ITestAnnotation annotation,
		      Class testClass,
		      Constructor testConstructor,
		      Method testMethod
		      ) {
		annotation.setRetryAnalyzer(week4.day4.RetryAnalyser.class);
		  }
	
	
	
	
	
	
}
