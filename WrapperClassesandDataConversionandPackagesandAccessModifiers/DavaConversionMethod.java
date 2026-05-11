package WrapperClassesandDataConversionandPackagesandAccessModifiers;

import java.util.ArrayList;

public class DavaConversionMethod {

	
		
	public static void main(String[] args) {
		// String --> int
		
		//String s="Welcome"; // cannot convert to int
	/*	String s1="10";
		String s2="20";
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));*/
		
		//String --> Double
		/*
		String s1="10.5";
		String s2="20.0";
		
		System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));
		*/
		//String --> Boolean
	/*	
		String s="true"; //here accept only true and false //Other then true , if you pass any value that will return false.
		
		System.out.println(Boolean.parseBoolean(s));
		
		//String --- char // not possible 
		 */
		
		// int,double,boolen,char --> String
		
		int a=10;
		double d=10.5;
		boolean bool= true;
		char c='A';
		
		String s=String.valueOf(a);
		System.out.println(s);
		
		s=String.valueOf(d);
		System.out.println(s);
		
		s=String.valueOf(bool);
		System.out.println(s);
		
		s=String.valueOf(c);
		System.out.println(c);
		
		
		//ArrayList arr=new ArrayList();
		
		//ArrayList<Integer> arr=new ArrayList<Integer>(); //Valid
		
		//ArrayList<int> arr=new ArrayList<int>(); // Not Valid
		
	}

}
