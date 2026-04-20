package OperatorAndExpressions;

public class DecrementOperator {

	public static void main(String[] args) {
		//case1
		
		/*
		int a=10;
		a--;   //a=a-1;
		System.out.println(a);
		 */
	
		//case 1 - Post Decrement
		/*
		int a=10;
		int res=a--;
		System.out.println(res);
		System.out.println(a);
		*/
		
		//case 1 - Pre Decrement
		int a=10;
		int res=--a;
		System.out.println(res);
		System.out.println(a);

		
	}

}
