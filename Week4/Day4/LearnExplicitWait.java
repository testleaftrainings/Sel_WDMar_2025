package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		        //Launch the browser
				ChromeDriver driver=new ChromeDriver();
				
				//Load the url  (.get)
				driver.get("https://leafground.com/waits.xhtml");
				
				//To maximize the browser
				driver.manage().window().maximize();
				
				//Click the button
				driver.findElement(By.xpath("//span[text()='Click']")).click();
				
				//Check for element visibilty
				//Thread.sleep(10000);
				//boolean displayed = driver.findElement(By.xpath("//span[text()='I am here']")).isDisplayed();
                //System.out.println(displayed);
				
				//Create Object for WebDriver wait
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1));
				
				//Use the appropriate Condition
				WebElement iAmHereElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']")));
				
				boolean displayed = iAmHereElement.isDisplayed();
				
				System.out.println(displayed);
				
				//Clickability Condition
				WebElement until = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Click'])[2]")));
	            until.click();
	            
	            Boolean until2 = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='I am about to hide']")));
	            System.out.println(until2);
	}

}

//Polling time - 500 ms or 1/2 Second     - 20 Times    2 Seconds

//FluentWait - Customize the Polling time


