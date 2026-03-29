package Day9_StringStringBufferAndStringBuilder;

public class ReverseAString {

	public static void main(String[] args) {
		//Approach 1
		/*
		String s="Welcome";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse String is :"+ rev);
		
		*/
		
		//Approach 2 Without using string method
		//by converting string to charArray type
		
		/*
		String s="Welcome";
		String rev="";
		
		char a[]=s.toCharArray();
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println("Reverce String is : "+rev);
		*/
		
		//Approach 3 : Using StringBuffer class
		/*
		StringBuffer s=new StringBuffer("Welcome");
		System.out.println("Reverse String is:"+s.reverse());
		*/
		//Approach 4 : Using StringBuilder class
		
		StringBuilder s=new StringBuilder("Welcome");
		System.out.println("Reverse String is:"+s.reverse());
	
	}

}
