package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		ArrayList mylist=new ArrayList();
		
		mylist.add(100);
		mylist.add("Java");
		mylist.add("A");
		mylist.add("Java");
		mylist.add(null);
		mylist.add("Welcome");
		mylist.add(null);
		
		
		//size of arraylist
		System.out.println("list count form mylist is:"+mylist.size());//7
		
		
		//printing arraylist
		System.out.println("Printing Data from ArrayList"+mylist);//[100, Java, A, Java, null, Welcome, null]
		
		//remove element from arraylist
		mylist.remove(3); //here 3 is index of element
		System.out.println("After removing"+mylist);//[100, Java, A, null, Welcome, null]
		
		
		//Insert a new element in the arraylist
		mylist.add(2, true);
		System.out.println("After insertion :"+mylist);//[100, Java, true, A, null, Welcome, null]
		
		//Modify element in the arraylist (Modify/Replace/Change)
		mylist.set(1, "Python");
		System.out.println("After Modify element in the arraylist"+mylist);//[100, Python, true, A, null, Welcome, null]
	
		//Access specific element form arraylist
		System.out.println("Access element for arraylist :-"+mylist.get(5));
		
		//Reading All the element form ArrayList
		//Using for...loop
		
		/*for(int i=0;i < mylist.size();i++) {
			System.out.println(mylist.get(i));
		}*/
		
		//using for...each loop or Enhance for_loop
		
		/*for(Object X:mylist) {
			System.out.println(X);
				
		}*/
		//using Iterator
		/*Iterator it=mylist.iterator();
		//System.out.println(it.next());
		while(it.hasNext()){
			System.out.println(it.next());	
		}
	*/
		//Checking Array list is empty or not
		
		System.out.println("Is Arraylist is empty?"+ mylist.isEmpty());
		
		
		//Remove all the element from Arraylist
		ArrayList mylist2=new ArrayList();
		
		mylist2.add(100);
		mylist2.add("Welcome");
		 
		mylist.removeAll(mylist2);
		System.out.println("After removing multiple element form Arraylist:-"+ mylist);
		
		//remove all the element/clear
		mylist.clear();
		System.out.println("Is Arraylist is empty?"+ mylist.isEmpty());
		
	}

}
