package Day5_LoopsAndJumpStatements;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// Exampl 1: print 1..........10 numbers
		/*
		int i =1;  //initilization
		while(i<=10) //condition 
		{
			System.out.println(i);
			i++; //inc/dic
		}
		*/
		
		//Exampl 2 : print Hello message 10
		/*
		int i=1;
		
		while(i<=10)
		{
			System.out.println("Hello");
			i++;
		}
	*/
		
		//Exampl 3 print even number between 1....10
		//Appraoch 1
		/*int i= 2;
		
		while(i<=10)
		{
			System.out.println(i);
			i+=2; //i=i+2
		}
		*/
		//Appraoch 2
		/*
		int i =1;
		while(i<=10)
		{
			if(i%2==0) 
			{
			System.out.println(i);
			}
			i++;
		}
		*/
		
		//Example 4 : 1.......10
		/*
		  1 odd
		  2 even
		  3 odd
		  4 even
		  5 odd
		  --
		  10
		  */
		
		/*int i =1;
		
	   while(i<=10)
	   {
		   if(i%2==0)
		   {
			   System.out.println(i+"Even");
		   }
		   else
		   {
			   System.out.println(i+"Odd");
		   }
		   i++;
	   }*/
		
		//Example 5: print 10.....1
		int i =10;
		
		while(i>0)
		{
			System.out.println(i);
			i--;
		}
	
	}

}
