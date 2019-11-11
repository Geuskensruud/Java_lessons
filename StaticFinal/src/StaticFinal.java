
//class Student {
//	//variable
//	int rollno;
//	String name;
//	static String college= "ABC";
//	
//	//constructor
//	Student(int rollno, String name){
//		this.rollno = rollno;
//		this.name = name;
//	}
//	//method display students
//	void studentDisplay() {
//		System.out.println(rollno + " " + name + " " + college);
//	}
//	//static method
//	static void staticStudentDisplay() {
//		System.out.println(college);
//	}
//}


class Student {
	//variable
	int rollno;
	String name;
	final String college= "ABC";
	
	//constructor
	Student(int rollno, String name, String college){
		this.rollno = rollno;
		this.name = name;
	}
	
	//method display students
	void studentDisplay() {
		System.out.println(rollno + " " + name + " " + college);
	}
}

public class StaticFinal {

	public static void main(String[] args) {
		Student s1 = new Student(1, "John", "EDF");
		s1.studentDisplay();
	}
}
