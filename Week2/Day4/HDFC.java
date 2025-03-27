package week2.day4;

public class HDFC implements RBI {

	public void mandatoryKyc() {
		   System.out.println("Aadhar Card");
				}

	public void depositAmount() {
		System.out.println("5 Lakhs");
		}
	
	public static void main(String[] args) {
		HDFC hdfcOptions=new HDFC();	
		hdfcOptions.mandatoryKyc();
		hdfcOptions.depositAmount();
	}
	
}
