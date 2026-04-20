package CodingExamplesOnArrays;

import java.util.Arrays;

public class SortingElementsInArray {

	public static void main(String[] args) {
		

		int a[]= {100,600,200,400,500};

		System.out.println("Befor sorting array");

		System.out.println(Arrays.toString(a));//[100, 600, 200, 400, 500]

		Arrays.sort(a); //sort element in arary


		System.out.println("After sorting array");

		System.out.println(Arrays.toString(a)); //[100, 200, 400, 500, 600]
	}

}
