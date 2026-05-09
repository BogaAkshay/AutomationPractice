package DataAbstractionAndInterfaceConcept;

interface Shape{
	int lenth =10; //final & static
	int width =20; //final & static

	void circle(); //abstract method

	default void squear()
	{
		System.out.println("This is Squear -- default method");
	}

	static void rectangle()
	{
		System.out.println("This is rectangle - static method");
	}
}


public class InterfaceDemo implements Shape
{
	public void circle()
	{
		System.out.println("This is circle - abstrect method..");
	}
	
	void rectangle()
	{
		System.out.println("This is rectangle..");
	}
	
	int x=100,y=200;
	
	public static void main(String[] args) {
		//Scenario 1
		InterfaceDemo idobj = new InterfaceDemo();
		idobj.circle();// abstract method 
		idobj.squear();// default method
		
		Shape.rectangle(); //static method can directly access from interface*/
		idobj.rectangle();
		System.out.println(idobj.x + idobj.y);
		//Scenario 2
		
		Shape sh=new InterfaceDemo();
		 sh.circle(); //abstract method
		 sh.squear(); // default method
		 
		 Shape.rectangle(); //static method can directly access from interface
		 
		// sh.rectangle(); //we cannot access
	
		 System.out.println(Shape.lenth *Shape.width); //accessing static variable directly
		 
		// System.out.println(sh.x + sh.y); //we cannot access
	}

}
