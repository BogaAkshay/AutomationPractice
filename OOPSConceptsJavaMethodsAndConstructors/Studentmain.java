package OOPSConceptsJavaMethodsAndConstructors;

public class Studentmain {

	public static void main(String[] args) {
	
		//Student st=new Student();
		
		//1) Using object reference variable
	//	st.sid=123;
		//st.sname="Jhon";
		//st.grad='A';
		
		
		//2)using Methods
		//st.setStudentData(100, "David", 'B');
	    //st.printStudentData();
		
		//3)Using constructor
		Student st=new Student(102,"Mark",'C');
		st.printStudentData();
	}

}
