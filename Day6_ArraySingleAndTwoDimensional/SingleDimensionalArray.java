package Day6_ArraySingleAndTwoDimensional;

public class SingleDimensionalArray {

	/*
	 * 1) Declare an array
	 * 2) add values into array
	 * 3)find size of an array
	 * 4) read single value from an array
	 * 5) read multiple values form an array
	 */
	public static void main(String[] args) {
		// declaring array
		
		//Approach 1
		/*
		int a[]=new int[5];
		int []a=new int[5];
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;
		*/
		
		//Approach 2
		 
		int a[] = {100,200,300,400,500};
		
		//find length of array
	//	System.out.println("Length of array : "+a.length);
		
		//read single value from array
		//System.out.println(a[4]); //here 4 is index 
		
		
		//reading all the values form array
		
		//Normal for...loop
		for(int i=0;i<a.length;i++) //i<=4 	i<5 i<=a.lenth-1 i<a.length
		{
			System.out.println(a[i]); //100 200 300 400 500
		}
		
		//enhanced for... loop / for...each loop
		for(int x: a)
		{
			System.out.println(x);
		}
		
		
		
		
			
		
	}

}
