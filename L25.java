<<<<<<< HEAD
<<<<<<< HEAD
//Copy constructor
class Student
{
	int roll;
	String name;

	public Student()
	{

	}
	Student(Student s)
	{
		roll = s.roll;
		name = s.name;
	}
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		System.out.println("s1: "+s1.roll+"\t\t"+s1.name);
		s1.roll = 100;
		s1.name = "Raja";
		System.out.println("s1: "+s1.roll+"\t\t"+s1.name);

		Student s2 = new Student(s1);
		System.out.println("s2: "+s2.roll+"\t\t"+s2.name);

		s2.roll = 101;
		s2.name = "Rani";
		System.out.println("s2: "+s2.roll+"\t\t"+s2.name);
		System.out.println("s1: "+s1.roll+"\t\t"+s1.name);

		Student s3 = new Student(s2);
		System.out.println("s3: "+s3.roll+"\t\t"+s3.name);
	}
=======
//Copy constructor
class Student
{
	int roll;
	String name;

	public Student()
	{

	}
	Student(Student s)
	{
		roll = s.roll;
		name = s.name;
	}
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		System.out.println("s1: "+s1.roll+"\t\t"+s1.name);
		s1.roll = 100;
		s1.name = "Raja";
		System.out.println("s1: "+s1.roll+"\t\t"+s1.name);

		Student s2 = new Student(s1);
		System.out.println("s2: "+s2.roll+"\t\t"+s2.name);

		s2.roll = 101;
		s2.name = "Rani";
		System.out.println("s2: "+s2.roll+"\t\t"+s2.name);
		System.out.println("s1: "+s1.roll+"\t\t"+s1.name);

		Student s3 = new Student(s2);
		System.out.println("s3: "+s3.roll+"\t\t"+s3.name);
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Copy constructor
class Student
{
	int roll;
	String name;

	public Student()
	{

	}
	Student(Student s)
	{
		roll = s.roll;
		name = s.name;
	}
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		System.out.println("s1: "+s1.roll+"\t\t"+s1.name);
		s1.roll = 100;
		s1.name = "Raja";
		System.out.println("s1: "+s1.roll+"\t\t"+s1.name);

		Student s2 = new Student(s1);
		System.out.println("s2: "+s2.roll+"\t\t"+s2.name);

		s2.roll = 101;
		s2.name = "Rani";
		System.out.println("s2: "+s2.roll+"\t\t"+s2.name);
		System.out.println("s1: "+s1.roll+"\t\t"+s1.name);

		Student s3 = new Student(s2);
		System.out.println("s3: "+s3.roll+"\t\t"+s3.name);
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}