package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebdriverMethods2 {

	public static void main(String[] args) {
		//Diff between gettext and getattribute
		//Launch the browser
				ChromeDriver driver=new ChromeDriver();
				
				//Load the url  (.get)
				driver.get("https://leafground.com/input.xhtml");
				
				//To maximize the browser
				driver.manage().window().maximize();
				
				WebElement typeNameElement = driver.findElement(By.xpath("//h5[text()='Type your name']"));

				String textOnTheElement = typeNameElement.getText();
				
				System.out.println(textOnTheElement);
				
				String attribute = driver.findElement(By.id("j_idt88:j_idt91")).getAttribute("value");
	           
				System.out.println(attribute);
	
	}

}

//    j_idt88:j_idt91


//    j_idt88:j_idt91
