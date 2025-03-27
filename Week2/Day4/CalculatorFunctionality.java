package week2.day4;

public class CalculatorFunctionality {

	public void addNumbers(int a, int b) {
       System.out.println(a+b);
    	}
	
	public void addNumbers(int a, int b,int c) {
	   System.out.println(a+b+c);
       }
	
	public void addNumbers(float a, float b) {
     		System.out.println(a+b);
       }
	
	public static void main(String[] args) {
		CalculatorFunctionality calc=new CalculatorFunctionality();
		calc.addNumbers(6, 3);
		calc.addNumbers(5, 2, 8);
		calc.addNumbers(5.2F, 7.4F);
	}

}
