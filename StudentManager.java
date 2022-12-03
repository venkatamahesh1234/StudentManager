class Student
{
	String name;
	int rollno;
	String course;
	String email;
	long mobile;
	String address;
	char gender;
	int yearofjoin;
	public void printStudent()
	{

		System.out.println("Student Name : "+name);
		System.out.println("Student Roll Number : "+rollno);
		System.out.println("Student Course : "+course);
		System.out.println("Student Email  : "+email);
		System.out.println("Student mobile number : "+mobile);
		System.out.println("Student Address : "+address);
		System.out.println("Student Gender : "+gender);
		System.out.println("Student Year Of Join : "+yearofjoin);

	}
}
class StudentManager extends Student
{
	public static void main(String args[])
	{
		Student s=new Student();
		s.name = "Mahesh";
		s.rollno = 2746;
		s.course ="Java Full Stack";
		s.email = "mahi@gmail.com";
		s.mobile = 8627784233l;
		s.address = "Hyderabad";
		s.yearofjoin = 2022;
		
		s.printStudent();
		
	}
}
