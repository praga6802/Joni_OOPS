public class Student{
	String name;
	int rollno;
	
	Student(String n, int r){
		name=n;
		rollno=r;
		System.out.println("Student Name:"+name+"; RollNo: "+rollno);
	}
	
	public static void main(String[] args){
		Student s1= new Student("Ajay",101);
		Student s2= new Student("Fathima",102);
		Student s3= new Student("Keerthana",103);
		Student s4= new Student("Naveesha",104);
		Student s5= new Student("Praga",105);
	}
}
		

	