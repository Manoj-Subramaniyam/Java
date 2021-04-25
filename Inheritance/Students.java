package week3.day1;

public class Students {
	public void getStudentInfo(int id) {
		// TODO Auto-generated method stub
		System.out.println(id);

	}
	public void getStudentInfo(int id , String Name) {
		// TODO Auto-generated method stub
		System.out.printf("%d  %s\n",id,Name);

	}
	public void getStudentInfo(String emailId,double phoneNumber) {
		// TODO Auto-generated method stub
		
		System.out.printf("%s  %f",emailId,phoneNumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students obj1Students= new Students();
		obj1Students.getStudentInfo(12345);
		obj1Students.getStudentInfo(54321, "XYZ");
		obj1Students.getStudentInfo("xyz@gmail.com", 987654321);
	}

}
