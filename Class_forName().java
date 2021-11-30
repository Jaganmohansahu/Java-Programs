class Student
{
	int x=10;
}

class Test
{
	public static void main(String[] args) throws Exception
	{
		Class c = Class.forName("Student");

		Student s = (Student)c.newInstance();	//Create the object of that class which is already loaded into JVM
		System.out.println(s.x);	//Call the non-static member
	}
}