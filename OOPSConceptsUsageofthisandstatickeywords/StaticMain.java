package OOPSConceptsUsageofthisandstatickeywords;

public class StaticMain {

	
	
	public static void main(String[] args) {
	
		System.out.println(StaticDemo.a);
		StaticDemo.m1();
		
		// 1)static method can access static stuff directly ( without object)
		
		//System.out.println(a);
		//m1();
		
		//System.out.println(b);  //cannot access, b is non-static
		//m2(); //cannot access, m2() is non-static
		
		
		//2)static method can access non- static stuff through object.
		
		//StaticDemo sd=new StaticDemo();
		//System.out.println(sd.b);
		//sd.m2();
		
		//3) non-static method can access everything directly
	//	StaticDemo sd=new StaticDemo();
		//sd.m();
		
		
	}
}
