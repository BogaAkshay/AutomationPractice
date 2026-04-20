package OOPSConceptsPolymorphismAndEncapsulationOverloading;

public class Box {
	
	
	double width, hight, depth;
	
	
	Box() //1
	{
		/*
		width=0;
		hight=0;
		depth=0;
		*/
		width=hight=depth=0;
	}

	
	Box(double w,double h,double d)//2
	{
		width=w;
		hight=h;
		depth=d;
		
	}
	
	Box(double len) //3
	{
		  width=hight=depth=len;
	}
	
	double valume()
	{
		return(width*hight*depth);
	}
}
