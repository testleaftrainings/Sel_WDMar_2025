package week3.day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebtable {

	public static void main(String[] args) {
		         //Launch the browser
				ChromeDriver driver=new ChromeDriver();
				
				//Load the url  (.get)
				driver.get("https://www.leafground.com/table.xhtml");
				
				//To maximize the browser
				driver.manage().window().maximize();
				
				WebElement table = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody"));

				//To count the number of rows
				List<WebElement> row = table.findElements(By.tagName("tr"));
				//[row1, row2,,,,,,,,,,,,,,row10]
				
				int noOfRows = row.size();
				System.out.println("Number of rows is: "+noOfRows);
				
				List<WebElement> column = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[1]/td"));
				
	           int noOfColumns = column.size();
	           System.out.println("Number of columns is: "+noOfColumns);
	           
	           //To retrieve a single value
	           WebElement row2Column1 = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[2]/td[1]"));
	
	           String row2Col1Element = row2Column1.getText();
	           
	           System.out.println(row2Col1Element);
	           
	           //To Retrieve a entire row data
	           List<WebElement> row2Data = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[2]/td"));
	           //    0       1       234         5
	           //[WebEle1, WebEle2 ,,,,,,     WebEle6]
	           for (int i = 0; i < row2Data.size(); i++) {
	        	   String text = row2Data.get(i).getText();
	        	   System.out.println(text);
	        	   
	        	 }
	           
	           
	         //To retrieve the entire data
        	   List<WebElement> allData = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr/td"));
			
		       int allElementsCount = allData.size();
		       
		       System.out.println(allElementsCount);
		       
		       System.out.println("-----------------");
		       
		       for (int i = 0; i < allData.size(); i++) {
		    	   String text = allData.get(i).getText();
		    	   System.out.print(text);
			}
		       
	}

}
