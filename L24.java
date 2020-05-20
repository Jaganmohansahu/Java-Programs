<<<<<<< HEAD
<<<<<<< HEAD
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
=======
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
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
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
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}