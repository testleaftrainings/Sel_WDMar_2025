package week6.day2;

public class LearnException {

	public static void main(String[] args) {
		int number=7;
		  try {
			System.out.println(number/0);
		}
		catch(ArithmeticException exp) {
			System.out.println("The exception is: "+exp);
		}
		
		  
		 try {
			  int[] num=new int[-4];
			System.out.println(num[4]);
		} 
		  catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The Exception is: "+e);
		}
		  
		  catch(Exception e) {
			  
		  }
		  
		  System.out.println("Completed");

	}

}
