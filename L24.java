//How to create object
class Student
{
	int roll = 100;
	String name = "Raja";
}
class Test
{
	public static void main(String[] args) throws Exception
	{
		Student s = (Student)Class.forName("Student").newInstance();
		System.out.println("Roll: "+s.roll);
		System.out.println("Name: "+s.name);
	}
}