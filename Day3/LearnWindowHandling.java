package week3.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling {

	public static void main(String[] args) {
		      
		//Launch the browser
				ChromeDriver driver=new ChromeDriver();
				
				//Load the url  (.get)
				driver.get("https://leafground.com/window.xhtml");
				
				//To maximize the browser
				driver.manage().window().maximize();
				
				//To click the open button
				driver.findElement(By.xpath("//span[text()='Open']")).click();
				
				
				String windowHandle = driver.getWindowHandle();
				System.out.println("Address of parent: "+windowHandle);
				
				
				//Step1: Use getWindowHandles to get all the address
				//getWindowHandles
				Set<String> windowHandles = driver.getWindowHandles();
				System.out.println("Address of all the opened windows: "+windowHandles);
				//             0                              1
				//[05B0F780248A4900212E093CD821EE9F, 1FEBAEBF87772760EC9AEFCB6D7A944C]
				
				
				//Convert the Set into list
				List<String> allWindows=new ArrayList<String>(windowHandles);
				System.out.println("The current list is: "+allWindows);
				
				//getTitle
				String titleOfParent = driver.getTitle();
				System.out.println("Before Switching: "+titleOfParent);
				
				
				//Step3: Transfer the driver focus to Child Window
				driver.switchTo().window(allWindows.get(1));
				
				//getTitle
				String titleOfChild = driver.getTitle();
				System.out.println("After Switching: "+titleOfChild);
				
				driver.close();
		       //driver.quit();
				
				driver.switchTo().window(allWindows.get(0));
				
				String title = driver.getTitle();
				System.out.println(title);
				
	}

}
