package week1.day3;

import java.util.Arrays;

public class LearnArrays {
   
	public static void main(String[] args) {
		
		//By Instantiation
		int[] scores=new int[5];
		scores[0]=56;
		scores[1]=100;
		scores[2]=99;
		scores[3]=50;
		scores[4]=76;
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
				
		//Marks of a student in five subjects
		//By Array Literal
		int[] marks= {87,92,84,78,100};
		
		//To get the length
	    int lengthOfArray = marks.length;
		System.out.println("Array Length is " +lengthOfArray);
		System.out.println(marks.length);
		
		
		//To retrieve a value
		System.out.println(marks[2]);
		
		//To retrieve the entire array
		//System.out.println(marks[0]);  //marks[0]  //87
		//System.out.println(marks[1]);  //marks[1]  //92 
		//System.out.println(marks[2]);  //marks[2]   //84
		//System.out.println(marks[3]);  //marks[3]   //78
		//System.out.println(marks[4]);  //marks[4]   //100
		                                 
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
		
		//To retrieve the lowest and highest
	    //Sort the array - In ascending order Lowest to highest
		
		Arrays.sort(marks);
		System.out.println(marks[0]);
		
		//To print the highest value - will be in the last index only
		  System.out.println(marks[lengthOfArray-1]);
		
		System.out.println("------------");
		
		//To print all the values after sorting
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
	}

}
