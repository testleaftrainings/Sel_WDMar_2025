package week3.day3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learnscreenshot {

	public static void main(String[] args) throws IOException {
		//Source - Webpage
		//Destination - Folder to store Screenshot
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//Take screenshot of particular element
		WebElement clickButton = driver.findElement(By.name("login"));
		
		
		//Step1: Take Screenshot from the source
		File source = clickButton.getScreenshotAs(OutputType.FILE);
		
		//Step2: Set up the destination Path
		File destination=new File("./Snaps/clickbutton.png");
		
		//Step3: Copy the screenshot from source to destination
		FileUtils.copyFile(source, destination);
		
		
		

	}

}
