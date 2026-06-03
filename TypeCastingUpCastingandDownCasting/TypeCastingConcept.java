package TypeCastingUpCastingandDownCasting;

public class TypeCastingConcept {
//UpCasting - Converting value from smaller --- larger
	//int --> long
	// float --> double
	
//DownCasting - Converting value from larger - smaller
	//long --> int
	//double --> float
	
	
	public static void main(String[] args) {
		// upcasting -automatic --- smaller to larger
		/*
		int intvalue =100;
		long longvalue = intvalue;
		System.out.println(longvalue);
		*/
		
		//float floatvalue= 10.5F;
		//double doublevalue=floatvalue;
		
		//downcasting - manually --- larger to smaller
		
		//long longvalue= 10000;
		//int intvalue=(int)longvalue;

		//double doublevalue =123.55;
		//float floatvalue=(float)doublevalue;
	
		//Example1
		/*
		int i=100;
		double d=i;
		System.out.println(d);//upcasting
		*/
		
		double d=10.5;
		int i=(int)d; //downcasting
		System.out.println(i);
		
	
	}

}
