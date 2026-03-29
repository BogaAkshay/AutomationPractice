package Day9_StringStringBufferAndStringBuilder;

public class StringComparison {

	public static void main(String[] args) {
		
		//Case 1
		/*
		String s1= "Welcome";
		String s2= "Welcome";
		
		System.out.println(s1==s2); //true
		System.out.println(s1.equals(s2)); //true
		*/
		
		//Case 2
		/*
		String s1=new String("Welcome");
		String s2=new String("Welcome");
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1==s2); //false //to compare the object
		System.out.println(s1.equals(s2)); //true // to compare values of object
		*/
		//Case 3
		/*
		String s1="ABC";
		String s2=new String("ABC");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		*/
		
		//Case 4
		
		String s1="ABC";
		String s2=new String("ABC");
		String s3=s2;
		
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true
		
		System.out.println(s2==s3);//true , bcoz object are same/equal
		System.out.println(s2.equals(s3));//true
		
		System.out.println(s1==s3);//false
		System.out.println(s1.equals(s3));//true
		
	}

}
