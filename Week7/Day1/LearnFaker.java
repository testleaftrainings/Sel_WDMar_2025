package week7.day1;

import com.github.javafaker.Faker;
import com.github.javafaker.PhoneNumber;

public class LearnFaker {

	public static void main(String[] args) {
		
		Faker fake=new Faker();
		//To generate email
		String emailAddress = fake.internet().emailAddress();
		System.out.println(emailAddress);
		
		//To generate firstname
		String firstName = fake.name().firstName();
		System.out.println(firstName);

		
		String cellPhone = fake.phoneNumber().cellPhone();
		System.out.println(cellPhone);
		
		//to generate it for company name
		String name = fake.company().name();
		System.out.println(name);
		
		
	}

}
