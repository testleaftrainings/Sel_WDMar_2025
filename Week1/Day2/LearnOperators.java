package week1.day2;

public class LearnOperators {
	
	//Java Operators
	//Assignment operator
	//Arithmetic operator
	//Comparison operator
	//Logical Operator
	//Increment and Decrement operator
	
	public static void main(String[] args) {
		//Assignment operator (=)
		int number=7;

		//Arithmetic operator (+,-,*,/,%)
		
		int a=9;
		int b=4;
		
		//add
		System.out.println(a+b);
		
		//sub
		System.out.println(a-b);
		
		//mul
		System.out.println(a*b);
		
		//Div(Quotient)
		System.out.println(a/b);
		
		//Div(Remainder)
		System.out.println(a%b);
		
		System.out.println("---------");
		
		//Comparison (Two Values) boolean-true or false
		// ==  -equal
		// <   -lessThan
		// >   -greaterThan
		// <=  -greterThanOrEqualTo
		// >=  smallerThanOrEqualTO
		int c=5;
		int d=6;
		
		//equalTo
		System.out.println(c==d);
		
		//lessThan    
		System.out.println(c<d);
		
		//greaterThan 
		System.out.println(c>d);
		
		//lessThanOrEqualTo         lessThan     EqualTo
		System.out.println(c<=d);   //c<d         c==d
		
		//greaterThanOrEqualTo
		System.out.println(c>=d);   //c>d         c==d
		
		System.out.println("-----------");
		
		int s=5;
		int v=7;
		//Logical Operator  2 conditions
		//And operator    Condition1   Condition2 -Both the conditions should satisfy
		//or Operator     Condition1   Condition2 -Either of the Conditions should satisfy
		
		//And (&&)
		System.out.println(s<v&&s==v);
		
		//Or   (||)
		System.out.println(s<v||s==v);
		
		System.out.println("------------");
		
		//Increment and Decrement operator
		//Increment - preIncrement and postIncrement
		//Decrement - preDecrement and postDecrement
		
		//Increment - postIncrement -Increase the value by 1 (p++)
		
		int p=7;
		System.out.println(p++); // 7
		System.out.println(p);   // 8
		
		//preIncrement -Increse the value by 1 (++p)
		System.out.println(++p);  //9
		
		//Decrement - postDecrement -Decrease the value by 1 (p--)
		System.out.println(p--);   //9
		System.out.println(p);     //8
		
		//preDecrement  (--P)
		System.out.println(--p);    //7
		
		
		int z=8;
		int add=(z++) + (++z) -(--z);
		//System.out.println(add);
		z++;  //8
		++z;  //10
		--z;  //9
		++z;  //10
		
	}

}