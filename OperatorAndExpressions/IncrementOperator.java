package OperatorAndExpressions;

public class IncrementOperator {

	public static void main(String[] args) {
		
		//++ Increment Operator
		//Case 1
		/*
		 * int a=10; System.out.println(a);
		 * 
		 * a++; //a=a+1; System.out.println(a);
		 */

		//case2
		//Post increment
		/*
		int a=10;
		int res=a++;
		System.out.println(res);//10
		System.out.println(a);
		*/
		
		//case3
		//Pre increment
		int a=10;
		int res=++a;
		System.out.println(res);
		System.out.println(a);
	}

}
