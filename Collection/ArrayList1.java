package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {

		//ArrayList al= new ArrayList();
		//ArrayList<String> al=new ArrayList<String>();
		//List al=new ArrayList();
		ArrayList al=new ArrayList();
		
		//Add new element to the array list
		al.add(100);
		al.add(10.5);
		al.add("Welcome");
		al.add(true);
		al.add('A');
		al.add(100);
		
		
		System.out.println("Number of element ArrayList:-"+al.size());
		System.out.println(al);
		
		System.out.println("remove value form list:-"+al.remove(5));
		System.out.println("remove vlaue form ArrayList"+al.remove(Character.valueOf('A')));
		System.out.println(al.remove("Welcome"));
		System.out.println("After removing element from ArrayList"+al);
		
		//Insert a new element
		//add(Index,Object);
		al.add(1,"Python");
		System.out.println("After Insert element in arrayList:-"+al);
		
		//Retrieve specific element 
		System.out.println(al.get(2));//10.5 , here 2 is index of element/object
		
		//change element /replace
		//set(index, object);
		al.set(1,"C#");
		System.out.println("after replaceing the element"+al);
		
		
		//Search -- contains -Returns true/false
		System.out.println(al.contains("C#"));//true
		System.out.println(al.contains("Java"));//false
		
		//is Empty -Returns true /false

		System.out.println(al.isEmpty());
		
		//1) for ...loop
		/*for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}*/
		
		//2)For..each loop
	/*	System.out.println("Reading element using for...each loop");
		for(Object e:al) {
			System.out.println(e);
		}*/
		//3)iterator
		 
		System.out.println("Reading element using Iterator method");
				Iterator it=al.iterator();
		
				while(it.hasNext()) {
					System.out.println(it.next());//Printing element and move to next 
					
				}
		
		
		
		
		
	}

}
