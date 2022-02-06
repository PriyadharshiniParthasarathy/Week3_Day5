package org.student;

public class Students {
//Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber
	
	
	public void getStudentInfo(int ID)
	{
		System.out.println("ID - " + ID);
	}
	
	public void getStudentInfo(int ID, String name)
	{
		System.out.println("ID - " + ID);
		System.out.println("Name - " + name);
	}
	
	public void getStudentInfo(String Email, Long phoneno )
	{
		System.out.println("Email - " + Email);
		System.out.println("Phoneno - " +phoneno );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students st = new Students();
			st.getStudentInfo(1001);
			st.getStudentInfo(1001, "Priya");
			st.getStudentInfo("alpha123@gmail.com", 9876543210L);
		
		

	}
	

}
