package week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnRightClick {

	public static void main(String[] args) {
		//Launch the browser
				ChromeDriver driver=new ChromeDriver();
				
				//Load the url  (.get)
				driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
				
				//To maximize the browser
				driver.manage().window().maximize();
				
				//Step1:
				Actions act=new Actions(driver);
				
				//Step2:
				WebElement rightClickElement = driver.findElement(By.xpath("//span[text()='right click me']"));

	            //Step3:
				act.contextClick(rightClickElement).perform();
	
	
	}
	
	

}
