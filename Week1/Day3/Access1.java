package week1.day3;

public class Access1 {
	
	//depositAmount
	public void depositAmount() {
		System.out.println("Deposit");
	}
	
	private void withDrawal() {
		System.out.println("Withdrawal");
	}

	public static void main(String[] args) {
		Access1 bankOptions=new Access1();
		bankOptions.depositAmount();
		bankOptions.withDrawal();

	}

}
