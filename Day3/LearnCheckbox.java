package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnCheckbox {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://leafground.com/checkbox.xhtml");
	       //To maximize the browser
			driver.manage().window().maximize();
			
			boolean selected = driver.findElement(By.xpath("//span[text()='Basic']")).isSelected();

           System.out.println(selected);
	}

}
