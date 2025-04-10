package week4.day4;

public class LearnStaticKeyword {
	
	static int number=7;
	
	int age=31;
	
	
	public void normalMethod() {
		System.out.println("This is a Normal method");
	}
	
	
	public static void method1() {
		System.out.println("This is a static method");
		//System.out.println(age);
	}
	
	{
		System.out.println("This is a normal block");
	}
	
	
	
	static {
		System.out.println("This is a static block");
	}
	
	
	
	
	
	public static void main(String[] args) {
		LearnStaticKeyword staticOptions=new LearnStaticKeyword();
		staticOptions.normalMethod();
		method1();

	}

}


//This is a static block
//This is a normal block
//This is a Normal method
//This is a static method



