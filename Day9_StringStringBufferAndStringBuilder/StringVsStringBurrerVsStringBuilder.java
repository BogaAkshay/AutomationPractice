package Day9_StringStringBufferAndStringBuilder;

public class StringVsStringBurrerVsStringBuilder {

	public static void main(String[] args) {
		
		//String - Immutable
		/*String s= "Welcome";
		s.concat("To Java");
		System.out.println(s);//Welcome //immutable , cannot change original value of s
		*/
		
		//StringBuffer - mutable		
		/*StringBuffer s=new StringBuffer("Welcome");
		
		s.append("To Java");
		
		System.out.println(s);// WelcomeTo Java //mutable - we can change original value of s
		*/
		//StringBuilder -mutable
		StringBuilder s= new StringBuilder("Welcome");
		s.append("To Java");
		System.out.println(s);// WelcomeTo Java //mutable - we can change original value of s
		
		
	}

}
