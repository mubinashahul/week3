package org.student;

import org.department.Department;

public class Student extends Department{

		public void studentName() {
			String studName ="Mubi";
			System.out.println("Student Name is "+studName);
		}
		public void studentDept() {
			String studDept = "BSC";
			System.out.println("Department is "+studDept);
		}
		public void studentId() {
			int studId = 10;
			System.out.println("Student ID is "+studId);
		}
	public static void main(String[] args) {
		Student st = new Student();
		st.collegeName();
		st.collegeCode();
		st.collegeRank();
		st.deptName();
		st.studentName();
		st.studentDept();
		st.studentId();
	}

}
