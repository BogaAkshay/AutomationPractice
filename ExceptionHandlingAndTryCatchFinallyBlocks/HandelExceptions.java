package ExceptionHandlingAndTryCatchFinallyBlocks;

import java.util.Scanner;

public class HandelExceptions {

	public static void main(String[] args) {

		System.out.println("Program is Started...");
		
		Scanner sc=new Scanner(System.in);
		//Example 1
		
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		try {
		System.out.println(100/num); //ArithmeticException
		}
		catch(ArithmeticException e)
		{
			System.out.println("Invalid Data");
		}
		
		System.out.println("Program is completed");
		System.out.println("Program is exited..");

	}

}
