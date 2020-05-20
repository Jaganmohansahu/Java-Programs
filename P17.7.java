<<<<<<< HEAD
<<<<<<< HEAD
//Cloning the class objects
class Employee implements Cloneable
{
	int id;
	String name;

	Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	void getData()
	{
		System.out.println("ID= "+id);
		System.out.println("Name= "+name);
	}
	public Object myClone()	throws CloneNotSupportedException
	{
		return super.clone();
	}
}
class CloneDemo
{	public static void main(String[] args) throws CloneNotSupportedException
	{
		Employee e1 = new Employee(10, "srinivas");

		System.out.println("Original object:");
		e1.getData();

		Employee e2 = (Employee)e1.myClone();

		System.out.println("Cloned object: ");
		e2.getData();
	}
}
=======
//Cloning the class objects
class Employee implements Cloneable
{
	int id;
	String name;

	Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	void getData()
	{
		System.out.println("ID= "+id);
		System.out.println("Name= "+name);
	}
	public Object myClone()	throws CloneNotSupportedException
	{
		return super.clone();
	}
}
class CloneDemo
{	public static void main(String[] args) throws CloneNotSupportedException
	{
		Employee e1 = new Employee(10, "srinivas");

		System.out.println("Original object:");
		e1.getData();

		Employee e2 = (Employee)e1.myClone();

		System.out.println("Cloned object: ");
		e2.getData();
	}
}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Cloning the class objects
class Employee implements Cloneable
{
	int id;
	String name;

	Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	void getData()
	{
		System.out.println("ID= "+id);
		System.out.println("Name= "+name);
	}
	public Object myClone()	throws CloneNotSupportedException
	{
		return super.clone();
	}
}
class CloneDemo
{	public static void main(String[] args) throws CloneNotSupportedException
	{
		Employee e1 = new Employee(10, "srinivas");

		System.out.println("Original object:");
		e1.getData();

		Employee e2 = (Employee)e1.myClone();

		System.out.println("Cloned object: ");
		e2.getData();
	}
}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
