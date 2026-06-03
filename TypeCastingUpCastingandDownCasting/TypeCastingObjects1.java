package TypeCastingUpCastingandDownCasting;
class Parent
{
	String name="John";
	
	void m1()
	{
		System.out.println("This is m1 from Parent..");
	}
}

class Child extends Parent
{
	int id=101;
	void m2()
	{
		System.out.println("This is m2 from Child...");
	}
}



public class TypeCastingObjects1 {

	public static void main(String[] args) {
		/* 
		Child c=new Child();
		System.out.println(c.name);//Parent
		c.m1();
		System.out.println(c.id); //Child
		c.m2();
		*/
		/*
		Parent p=new Child();//upcasting
		System.out.println(p.name);//Parent
		p.m1();
		System.out.println(p.id);//we canot access
		p.m2();//we canot access
		*/
		//downcasting
		/*
		Parent p=new Parent();
		Child c=(Child) p;
		System.out.println(c.name);
		System.out.println(c.id);
		c.m1();
		c.m2();
		*/
		
	}

}
