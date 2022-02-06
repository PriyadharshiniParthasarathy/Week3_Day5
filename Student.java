package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName()
	{
		System.out.println("studentName - Priya");
	}
	public void studentDept()
	{
		System.out.println("studentDept - MCA");
	}
	public void studentId()
	{
		System.out.println("studentId - A3001");
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