package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDragAndDrop {

	public static void main(String[] args) {
		//Launch the browser
				ChromeDriver driver=new ChromeDriver();
				
				//Load the url  (.get)
				driver.get("https://jqueryui.com/droppable/");
				
				//To maximize the browser
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				Actions act=new Actions(driver);
				
				driver.switchTo().frame(0);
				
				WebElement source = driver.findElement(By.id("draggable"));
				
				WebElement target = driver.findElement(By.id("droppable"));
				
				act.dragAndDrop(source, target).perform();


	}

}
