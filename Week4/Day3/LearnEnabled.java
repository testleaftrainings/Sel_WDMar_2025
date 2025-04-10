package week4.day3;

import org.testng.annotations.Test;

public class LearnEnabled {
	
	@Test(priority=1)
	public void createLead() {
		System.out.println("Lead is created");
	}
	
	@Test(priority=2,enabled=false)
	public void editLead() {
		System.out.println("Lead is Edited");
	}
	
	@Test(priority=3)
	public void deleteLead() {
		System.out.println("Lead is deleted");
	}

}
