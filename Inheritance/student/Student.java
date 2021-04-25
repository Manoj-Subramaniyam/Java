package org.student;
import org.department.Department;

public class Student extends Department {
	public void studentName() {
		// TODO Auto-generated method stub
		System.out.println("XYZ");

	}
	public void studentDepartment() {
		// TODO Auto-generated method stub
		System.out.println("ECE");

	}
	public void studentId() {
		// TODO Auto-generated method stub
		System.out.println("13BEC010");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj1=new Student();
		obj1.studentId();
		obj1.studentName();
		obj1.studentDepartment();
		obj1.deptName();
		obj1.collegeName();
		obj1.collegeCode();
		obj1.CollegeRank();
	}

}
