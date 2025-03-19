package week1.day3;

public class LearnReturntypes {
	
	public String add() {
		
		
		return "Vineeth";

	}
	
	public void calculator() {
		String add = add();
		System.out.println(add);

	}
	

	public static void main(String[] args) {
		LearnReturntypes calc=new LearnReturntypes();
		String add = calc.add();
		calc.calculator();
		

	}

}
