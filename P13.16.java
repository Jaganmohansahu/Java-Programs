<<<<<<< HEAD
<<<<<<< HEAD
//Passing objects by pass by value method
class Employee
{
	int id;
	Employee(int id)
	{
		this.id = id;
	}
}
class Check
{
	void swap(Employee obj1, Employee obj2)
	{
		Employee temp;
		temp = obj1;
		obj1 = obj2;
		obj2 = temp;
	}
}
class PassObjects
{
	public static void main(String[] args) 
	{
		Employee obj1 = new Employee(10);
		Employee obj2 = new Employee(20);

		Check obj = new Check();
		System.out.println(obj1.id+"\t"+obj2.id);	

		obj.swap(obj1,obj2);
		System.out.println(obj1.id+"\t"+obj2.id);
	}
=======
//Passing objects by pass by value method
class Employee
{
	int id;
	Employee(int id)
	{
		this.id = id;
	}
}
class Check
{
	void swap(Employee obj1, Employee obj2)
	{
		Employee temp;
		temp = obj1;
		obj1 = obj2;
		obj2 = temp;
	}
}
class PassObjects
{
	public static void main(String[] args) 
	{
		Employee obj1 = new Employee(10);
		Employee obj2 = new Employee(20);

		Check obj = new Check();
		System.out.println(obj1.id+"\t"+obj2.id);	

		obj.swap(obj1,obj2);
		System.out.println(obj1.id+"\t"+obj2.id);
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Passing objects by pass by value method
class Employee
{
	int id;
	Employee(int id)
	{
		this.id = id;
	}
}
class Check
{
	void swap(Employee obj1, Employee obj2)
	{
		Employee temp;
		temp = obj1;
		obj1 = obj2;
		obj2 = temp;
	}
}
class PassObjects
{
	public static void main(String[] args) 
	{
		Employee obj1 = new Employee(10);
		Employee obj2 = new Employee(20);

		Check obj = new Check();
		System.out.println(obj1.id+"\t"+obj2.id);	

		obj.swap(obj1,obj2);
		System.out.println(obj1.id+"\t"+obj2.id);
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}