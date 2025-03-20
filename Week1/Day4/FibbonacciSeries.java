package week1.day4;

public class FibbonacciSeries {
	
	//What is FibbonacciSeries and what is the range
	// 0   1   1   2    3    5
	// 0   1   1
	//Input - 2 Numbers
	//Output-series
	
	//Requirements
	//2 Variables for input
	//1 variable for output
	
	//firstNumber=0
	//secondNumber=1
	//thirdNumber=firstNumber+secondNumber
	
	public static void main(String[] args) {
		int firstNumber=0;
		int secondNumber=1;
		int thirdNumber;
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		//print the series for 8 Numbers
		for (int i = 1; i <= 6; i++) {
			thirdNumber=firstNumber+secondNumber;  
			firstNumber=secondNumber;             
			secondNumber=thirdNumber;        
			System.out.println(thirdNumber);
			
		}

	}

}
