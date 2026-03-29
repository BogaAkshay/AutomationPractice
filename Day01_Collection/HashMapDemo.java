package Day01_Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//declaration
		//HashMap hm=new HashMap();
		//Map mymap=new HashMap();

		HashMap<Integer,String> hm=new HashMap<Integer,String>();

		//Adding pairs
		 
		hm.put(101, "John");
		hm.put(102, "Scott");
		hm.put(103, "Mary");
		hm.put(104, "Mike");
		hm.put(102, "Dave");
		
		System.out.println(hm);//{101=John, 102=Dave, 103=Mary, 104=Mike}
		
		System.out.println("Size of HashMap :"+ hm.size()); //4
		
		//remove pair
		hm.remove(103); //103 is key of the pair
		System.out.println("After remove pair:"+hm); //After remove pair:{101=John, 102=Dave, 104=Mike}
		
		//access value of the key
		
		System.out.println(hm.get(102));//102 is key //Dave
		
		//get all the keys from hasmap
		System.out.println(hm.keySet());//[101, 102, 104]
		
		//get all the values form hasmap
		System.out.println(hm.values());//[John, Dave, Mike]
		
		//get key along with values
		System.out.println(hm.entrySet());//[101=John, 102=Dave, 104=Mike]
		
		//reading data from hashmap
		//Using for .. each  	
		
		/*for(int k : hm.keySet()) {
			System.out.println(k + "     "+hm.get(k));
			
		}*/
		
		//Using iterator
		
		Iterator<Entry<Integer, String>> it=hm.entrySet().iterator();
		
		while(it.hasNext()) {
			Entry<Integer,String> entry=it.next();
			System.out.println(entry.getKey()+"    "+ entry.getValue());
		}
		
		hm.clear();
		System.out.println(hm.isEmpty());//true
	}

}
