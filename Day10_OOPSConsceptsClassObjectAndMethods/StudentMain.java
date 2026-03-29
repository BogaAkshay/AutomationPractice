package Day10_OOPSConsceptsClassObjectAndMethods;

public class StudentMain {

	public static void main(String[] args) {
		Student stu1=new Student();
		stu1.sid =101;
		stu1.sname="Smith";
		stu1.grad='A';
		stu1.printData();

		Student stu2=new Student();
		stu2.sid =102;
		stu2.sname="John";
		stu2.grad='B';
		stu2.printData();
	}

}
