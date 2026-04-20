package CodingExamplesOnArrays;

import java.util.Arrays;

public class SortingString {

	public static void main(String[] args) {
		
		//char s[]= {'D','C','B','A'};
		
		String s[]= {"scott", "marry", "john", "David"};
		System.out.println("Befor Sorting...."+ Arrays.toString(s));
		
		Arrays.sort(s);
		
		System.out.println("After Sorting...."+ Arrays.toString(s));
			

	}

}
