package ConditionalStatements;

public class MultipleStatement {

	public static void main(String[] args) {
		
		/*if(true)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(2);
		} */
		/*if(1==2)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(2);
		}*/
		
		if(true)
		{
			if(false)
			{
				System.out.println("abc");
			}
			else
			{
				System.out.println("xyz");
			}
		}
		else
		{
			System.out.println("123");
		}
	}

}
