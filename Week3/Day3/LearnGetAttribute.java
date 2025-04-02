package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnGetAttribute {

	public static void main(String[] args) {
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url  (.get)
		driver.get("https://leafground.com/link.xhtml");
		
		//To maximize the browser
		driver.manage().window().maximize();
		
		String requiredUrl = driver.findElement(By.linkText("Find the URL without clicking me.")).getAttribute("href");
        System.out.println(requiredUrl);
	}

}
