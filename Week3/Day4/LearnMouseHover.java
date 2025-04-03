package week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseHover {

	public static void main(String[] args) {
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url  (.get)
		driver.get("https://www.pvrcinemas.com/");
		
		//To maximize the browser
		driver.manage().window().maximize();
		
		
		//Step1: Create Object for Actions Class
		Actions act=new Actions(driver);
		
		//Step2: Finding the WebElement
		WebElement mouseHoverElement = driver.findElement(By.xpath("//span[text()='More']"));
		
		//Step3: Use the method - moveToElement(Actions Class)
		act.moveToElement(mouseHoverElement).perform();
	}

}
