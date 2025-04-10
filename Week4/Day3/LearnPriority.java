package week4.day3;

import org.testng.annotations.Test;

public class LearnPriority {
	
	//CreateLead, EditLead,  DeleteLead
	//To execute the testcase based on priority
	
	//Lead is created      1         //   -1   -2   -3
	//Lead is deleted      3
	//Lead is Edited       2
	
	//Lead is created
	//Lead is Edited
	//Lead is deleted
	
	
	//Lead is deleted
	//Lead is Edited
	//Lead is created
	
	@Test(priority=-2)
	public void editLead() {
		System.out.println("Lead is Edited");

	}
	@Test(priority=-1)
	public void createLead() {
		System.out.println("Lead is created");

	}
	@Test(priority=-3)
	public void deleteLead() {
		System.out.println("Lead is deleted");

	}

}
