package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnScrollTo {

	public static void main(String[] args) {
		//Launch the browser
				ChromeDriver driver=new ChromeDriver();
				
				//Load the url  (.get)
				driver.get("https://www.amazon.in/");
				
				//To maximize the browser
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				
				Actions act=new Actions(driver);
				
				WebElement scrollElement = driver.findElement(By.linkText("Conditions of Use & Sale"));

	            act.scrollToElement(scrollElement).perform();
	}

}
