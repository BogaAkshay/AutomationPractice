package Day01_Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet myset=new HashSet();
		//Set myset=new HashSet();
		
		//HashSet <String> myset=new HashSet <String>();
	
		
		//adding element into HashSet
			myset.add(100);
			myset.add(10.5);
			myset.add("Welcome");
			myset.add(true);
			myset.add(null);
			myset.add(100);
			myset.add('A');
			myset.add(null);
			//printing hashset
			System.out.println(myset); //[null, A, 100, 10.5, Welcome, true]
			//size of hashset
			
			System.out.println("Size of Hashset :"+myset.size());
			//remove element
			myset.remove(10.5);//[null, A, 100, Welcome, true] 10.5 is removed
			System.out.println("After removing :"+myset);
			
			//Inserting element is not possible 
			
			//Access specific element
			
			
			//converting HasSet to Arraylist
			
			ArrayList al=new ArrayList(myset);
			System.out.println(al);
			System.out.println(al.get(2));
	
			
			//Read all the element using for...each
			/*for(Object x : myset) {
				System.out.println(x);
			}*/
	
			
			// Using Iterator
			
			Iterator <Object>it=myset.iterator();
	
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		//clearing all the element in HashSet		
				
				myset.clear();
				System.out.println(myset);
				System.out.println(myset.isEmpty()); //true
		
		
	
	}

}
