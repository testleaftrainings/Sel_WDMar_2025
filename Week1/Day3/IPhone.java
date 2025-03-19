package week1.day3;

public class IPhone {
	
	
	//Input can be passes as argument,parameter
	public void takePhoto(int number,String name) {
		
		           System.out.println((number+100)+" "+name);    

	}
	

	public static void main(String[] args) {
		IPhone phoneOptions=new IPhone();
		phoneOptions.takePhoto(10, "Vineeth");
		phoneOptions.takePhoto(7, "Bhuvanesh");
		

	}

}
