package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebDriverMethods3 {

	public static void main(String[] args) {
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url  (.get)
		driver.get("https://leafground.com/input.xhtml");
		
		//To maximize the browser
		driver.manage().window().maximize();
		
		Dimension size = driver.findElement(By.xpath("//h5[text()='Type your name']")).getSize();
		
		System.out.println(size);
		
		// Background Colour
		String cssValue = driver.findElement(By.id("layout-config-button")).getCssValue("background-color");

	
	    System.out.println(cssValue);
	    
	    //isDisplayed
	    boolean displayed = driver.findElement(By.xpath("//h5[text()='Type your name']")).isDisplayed();
	    System.out.println(displayed);
	
	   //isEnabled
	   boolean enabled = driver.findElement(By.id("j_idt88:j_idt91")).isEnabled();
	   System.out.println(enabled);
	
	
	}

}
