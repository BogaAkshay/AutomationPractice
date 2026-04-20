package StringMethods;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		
		
		//String s="Welcome";
		//String s=new String("Welcome");
		//System.out.println(s);

		String s="Welcome";
		//int l=s.length();
		//System.out.println(s.length());
		System.out.println("Welcome".length());
		
		String s1="Java";
		String s2="Welcome to ";
		String s3=" Automation";
		System.out.println(s2+s1+s3);
		
		System.out.println(s2.concat(s1).concat(s3));
		
		System.out.println(s2.concat(s1+s3));
		
		System.out.println("Welcome"+" to Java");
		System.out.println("Welcome".concat(" To Java Automation"));
		
		//trim() - remove spaces right and left side
		s="   Welcome   ";
		System.out.println(s);//print along with spaces
		System.out.println("Before triming :"+s.length());
		
		System.out.println(s.trim());
		
		System.out.println("After triming : "+s.trim().length());
		
		//charAT()- return a character from a string based on index
		//index start from 0
		s="Welcome";
		System.out.println(s.charAt(3));
		
		//contains() return true or false
		
		System.out.println(s.contains("Wel"));//true
		System.out.println(s.contains("come"));//true
		System.out.println(s.contains("wel"));//false
		System.out.println(s.contains("COME"));//false
		System.out.println(s.contains("Welme"));//false
		
		//equal() , equalsIgnorCase() -- compare string
		s1="Welcome";
		s2="Welcome";
		System.out.println(s1==s2); //true
		System.out.println(s1.equals(s2)); //true
		
		System.out.println(s1.equals("welcome"));//false
		System.out.println(s1.equalsIgnoreCase("welcome"));//true
		
		//replace() - replace  single/multiple(sequence) of character in a string
		s="Welcome to selenium java selenium python selenium c#";
		System.out.println(s.replace('e', 'X'));//WXlcomX to sXlXnium java sXlXnium python sXlXnium c#
		
		System.out.println(s.replace("selenium","playwright"));//Welcome to playwright java playwright python playwright c#
		

		//substring() - it will extract substring from the main string
		//starting index - 0
		//ending index -1
		s="Selenium";
		System.out.println(s.substring(1, 5));//elen
		System.out.println(s.substring(0, 3));//Sel
		
		//toUpperCase() toLowerCase()
		s="Welcome";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		//split() -split the string into multiple parts based on delimeter.
		s="abc@gmail.com";
		
		String a[]=s.split("@");
		
		System.out.println(a[0]);//abc
		System.out.println(a[1]);//gmail.com
		System.out.println(Arrays.toString(a));
		
		//example1
		String amount="$12,20,55";
		
		System.out.println(amount.replace("$", ""));//12,20,55
		System.out.println(amount.replace("$", "").replace(",",""));//122055
		
		//example2
		s="abc,123@xyz";
		String arr1[]=s.split(",");
		System.out.println(Arrays.toString(arr1));//[abc, 123@xyz]
		
		String arr2[]=arr1[1].split("@");
		System.out.println(Arrays.toString(arr2));
		
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		
		
		//example3
		s="abc 123 xyz";
		String arr[] =s.split(" ");
		System.out.println(Arrays.toString(arr));
		
		//example 4
		String name ="John Kenedy";
		
		//System.out.println(name.contains("john"));
		System.out.println(name.replace('J', 'j').contains("john")); //true
		System.out.println(name.toLowerCase().contains("john"));//true

		
		
		
				
		
				
		
		
	}

}


