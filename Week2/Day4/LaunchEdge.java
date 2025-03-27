package week2.day4;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdge extends LaunchChrome {
	
	public void launchBrowser() {
		super.launchBrowser();
		EdgeDriver driver=new EdgeDriver();
		System.out.println("Edge is launched");
}
	
	public static void main(String[] args) {
		LaunchEdge browser=new LaunchEdge();
		browser.launchBrowser();
	}

}