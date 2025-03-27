package week2.day4;

public class AXISImplementation extends AXIS {

	public void mandatoryKyc() {
		System.out.println("DL");
	}
     public void depositAmount() {
		System.out.println("2 Lakhs");
	}
    @Override
	public void carLoan() {
		System.out.println("10 Lakhs");
	}
	
    public void houseLoan() {
		super.houseLoan();
		//System.out.println("1 Cr");
	}
	
    public static void main(String[] args) {
		AXISImplementation implement=new AXISImplementation();
		implement.mandatoryKyc();
		implement.depositAmount();
		implement.carLoan();
		implement.houseLoan();
	}
    }
