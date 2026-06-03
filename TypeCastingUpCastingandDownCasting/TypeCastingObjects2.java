package TypeCastingUpCastingandDownCasting;
//Cat ct=(Cat)an; 
//A   b    C  d
class Animal{}

class Dog extends Animal{}
class Cat extends Animal{}


public class TypeCastingObjects2 {

	public static void main(String[] args) {
		//Rule 1 : conversion is valid or not 
		//The Type 'd' and 'c' must have some relationship (either Parent to Child or Child to Parent
		
		//Animal an=new Dog();
		//Cat ct=(Cat)an; //valid as per rule 1

		//Dog dg=new Dog();
		//Cat ct=(Cat)dg; //invalid as per rule 1
	
		//Rule 2 : assignment is valid or not
		//'C' must be either same or child of 'A'.
		
		//Animal an =new Dog();
		//Cat ct=(Cat)an; //valid as per Rule 2
	
		//Animal an =new Dog();
		//Cat ct=(Dog)an; //invalid as per Rule 2
		
		//Rule 3:
		//The Underlining object type of 'd' must be either same or Child of 'C'.
	
		//Animal an=new Dog();
		//Cat ct=(Cat) an; //invalid as per Rule 3
		
		
		//Rule 1,Rule 2, Rule 3
		Animal an=new Dog();
		Dog dg=(Dog) an; //Rule 1 - yes , Rule 2 -yes, Rule 3-yes
	}

}
