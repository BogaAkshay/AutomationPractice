package OOPSConceptsJavaMethodsAndConstructors;

public class ConstructorDemo {

	int x,y;
	ConstructorDemo() //Default Constructor
	{
		x=100;
		y=200;
	}
	
	ConstructorDemo(int a,int b) //Parameterized constructor
	{
		x=a;
		y=b;
	}
	
	void sum()
	{
		System.out.println(x+y);
	}
	
	
	public static void main(String[] args) {
		
		//ConstructorDemo cd=new ConstructorDemo(); //invoke default constructor
		//cd.sum();
		
		ConstructorDemo cd=new ConstructorDemo(10,40); //Parameterized constructor
		cd.sum();

	}

}
