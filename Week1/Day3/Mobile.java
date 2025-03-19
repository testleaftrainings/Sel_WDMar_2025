package week1.day3;

public class Mobile {
	//Naming of methods - performing the task
	//call, message, photo, screenshot
	//makeCall, sendMessage, takePhoto, takeScreenshot
	//camelCase
	
	public void makeCall() {
		System.out.println("Make Call");
	}
	
	public void sendMessage() {
		System.out.println("Send Message");

	}

	public static void main(String[] args) {
		System.out.println("This is a main method");
		//ClassName objectName=new ClassName();
		   Mobile mobileOptions=new Mobile();
		   mobileOptions.makeCall();
		   mobileOptions.sendMessage();
	}
	

}
