<<<<<<< HEAD
<<<<<<< HEAD
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
=======
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
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
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
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}