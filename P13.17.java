//interchanging of the value by single object
class Employee
{
	int id1, id2;
	Employee(int id1, int id2)
	{
		this.id1 = id1;
		this.id2 = id2;
	}
}
class Check
{
	void swap(Employee obj)
	{
		int temp;
		temp = obj.id1;
		obj.id1 = obj.id2;
		obj.id2 = temp;
	}
}
class PassObjects
{
	public static void main(String[] args) 
	{
		Employee obj1 = new Employee(10,20);
		Check obj = new Check();
		System.out.println(obj1.id1+"\t"+obj1.id2);
		obj.swap(obj1);
		System.out.println(obj1.id1+"\t"+obj1.id2);	
	}
}