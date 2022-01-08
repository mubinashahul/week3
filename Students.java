package Assign_Overloading;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("Student Id "+id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Student Id "+id);	
		System.out.println("Student Name "+name);
		
	}
	public void getStudentInfo(String email, long phonenumber) {
		System.out.println("Student Email "+email);
		System.out.println("Student Phone Number "+phonenumber);
		
	}
	public static void main(String[] args) {
		
		Students stud = new Students();
		stud.getStudentInfo(10);
		stud.getStudentInfo(101, "Mubi");
		stud.getStudentInfo("mubi@gmail.com", 9876544321l);
	}

}
