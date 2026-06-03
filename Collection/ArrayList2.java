package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");
		
		ArrayList al_dup=new ArrayList();
		
		al_dup.addAll(al);
		
		System.out.println("After adding:-"+al_dup);
		
		al_dup.removeAll(al);
		System.out.println("After removeing:-"+al_dup);

		
		//Sort --callmections.sort();
		
		System.out.println("Elements in the arraylist:"+al);
		Collections.sort(al);
		System.out.println("Elements in the arraylist after sorting:"+al);
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("Elements in the arraylist after sorting reverse order:"+al);
		
		//Shuffling -- collections.shuffle()
		Collections.shuffle(al);
		System.out.println("Elements in the arraylist after shuffleing:"+al);
		
	}

}
