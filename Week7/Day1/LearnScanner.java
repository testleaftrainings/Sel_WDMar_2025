package week7.day1;

import java.util.Scanner;

public class LearnScanner {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		//Enter the age - nextInt
		System.out.println("Enter the age: ");
		int age = scan.nextInt();
		System.out.println("Age is: "+age);
		
		//Enter the name - nextLine
		System.out.println("Enter the name");
		String name = scan.nextLine();
	}

}
