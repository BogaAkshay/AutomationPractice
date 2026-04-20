package LoopsAndJumpStatements;

public class ForLoopDemo {

	public static void main(String[] args) {
		//Example 1
		// Print 1 to 10 number using for..loop
	/*	
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
*/
		//Example 2
		//print 1 to 10 even number
		
		/*for(int i =2;i<=10;i+=2)
		{
			System.out.println(i);
		}*/
		
		//Example 3: 1.......10
		/*
		  1 odd
		  2 even
		  3 odd
		  4 even
		  5 odd
		  --
		  10
		  */
		/*
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+"Even");
			}
			else
			{
				System.out.println(i+"Odd");
			}
		}
		*/
		
		//Example 4 10 .....1 dec
		
		for(int i=10;i>0;i--)
		{
			System.out.println(i);
		}
	}

}
