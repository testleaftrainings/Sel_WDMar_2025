package week2.day4;

public class SBI implements RBI {
	
	public void goldLoan() {
		System.out.println("Gold loan upto 2 Lakhs");

	}
	
    public void mandatoryKyc() {
		System.out.println("PAN is Mandatory");
	}

	public void depositAmount() {
	System.out.println("Upto 10 Lakhs");
		
	}
	
	public static void main(String[] args) {
		SBI sbiOptions=new SBI();
		sbiOptions.mandatoryKyc();
		sbiOptions.depositAmount();
		sbiOptions.goldLoan();
	}

}
