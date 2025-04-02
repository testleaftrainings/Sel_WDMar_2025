package week3.day3;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebdriverMethods1 {

	public static void main(String[] args) {
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url  (.get)
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//To maximize the browser
		driver.manage().window().maximize();
		
		//To get the title
		String titleOfPage = driver.getTitle();
		System.out.println("Title of page is: "+titleOfPage);
		
		//To get the url of the webpage
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current url is: "+currentUrl);
		
		//To get the html page source
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		
		//To close the browser
		driver.close();
		

	}

}
