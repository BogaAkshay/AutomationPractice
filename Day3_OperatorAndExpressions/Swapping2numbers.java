package Day3_OperatorAndExpressions;

public class Swapping2numbers {

	public static void main(String [] args) {
	//without using third variable 
		int a=10, b=20;
		
		System.out.println("Befor Swapping 2 numbers:"+"a = "+a +" "+"b = "+b);
		
		a = a + b; //10 + 20 = 30
		b = a - b; //30 - 10 = 20
		a = a - b; //30 - 20 = 10
		
		System.out.println("After Swapping 2 numbers:"+"a = "+a+" "+"b = "+b);
		
	//with using third variable;
		System.out.println("Befor Swapping 2 numbers:"+"a = "+a +" "+"b = "+b);
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println("Befor Swapping 2 numbers:"+"a = "+a +" "+"b = "+b);
		
		
	}
	
}
