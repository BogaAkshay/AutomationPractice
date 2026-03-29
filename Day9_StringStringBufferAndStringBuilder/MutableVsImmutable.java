package Day9_StringStringBufferAndStringBuilder;


public class MutableVsImmutable {

	public static void main(String[] args) {
		// Mutable - can change
		/*
		int a[]= {20,10,40,50,30};
		
		System.out.println("Befor Srot Array :"+Arrays.toString(a));
		
		Arrays.sort(a);//Mutable
		
		System.out.println("After Srot Array :"+Arrays.toString(a));
		*/
		
		//Immutable
		
		//String class is immutable we cannot change the value of Original
		String s=new String("Welcome");
		
		System.out.println(s);//Welcome
		
		String concatString=s.concat(" To Java");
		
		System.out.println(s);//Welcome ---> Immutable - We cannot change
		System.out.println(concatString);
		
	}

}
