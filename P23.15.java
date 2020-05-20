<<<<<<< HEAD
<<<<<<< HEAD
//To create an ArrayList of Employee Objects and 
//Search for a particular Employee object based on id number
import java.io.*;
import java.util.*;
class Employee
{
	int id;
	String name;
	String address;

	Employee(int i, String n, String a )
	{
		id =i; 
		name = n;
		address = a;
	}
	void display()
	{
		System.out.println("ID: "+id);
		System.out.println("Name "+name);
		System.out.println("Address: "+address);
	}
}
class EmpList
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int id;
		String name;
		String address;

		ArrayList<Employee> arl = new ArrayList<>();

		for(int i=0; i<5; i++)
		{
			System.out.print("Enter id: ");
			id = Integer.parseInt(br.readLine());

			System.out.print("Enter name: ");
			name = br.readLine();

			System.out.print("Enter address: ");
			address = br.readLine();

			Employee obj = new Employee(id, name, address);

			arl.add(obj);
		}
		System.out.print("Enter id to search: ");
		id = Integer.parseInt(br.readLine());

		boolean found = false;

		for(int i=0; i<arl.size(); i++)
		{
			Employee obj = arl.get(i);

			if(id == obj.id)
			{
				obj.display();
				found = true;
			}
		}
		if(!found)
			System.out.println("Employee not found");
	}
=======
//To create an ArrayList of Employee Objects and 
//Search for a particular Employee object based on id number
import java.io.*;
import java.util.*;
class Employee
{
	int id;
	String name;
	String address;

	Employee(int i, String n, String a )
	{
		id =i; 
		name = n;
		address = a;
	}
	void display()
	{
		System.out.println("ID: "+id);
		System.out.println("Name "+name);
		System.out.println("Address: "+address);
	}
}
class EmpList
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int id;
		String name;
		String address;

		ArrayList<Employee> arl = new ArrayList<>();

		for(int i=0; i<5; i++)
		{
			System.out.print("Enter id: ");
			id = Integer.parseInt(br.readLine());

			System.out.print("Enter name: ");
			name = br.readLine();

			System.out.print("Enter address: ");
			address = br.readLine();

			Employee obj = new Employee(id, name, address);

			arl.add(obj);
		}
		System.out.print("Enter id to search: ");
		id = Integer.parseInt(br.readLine());

		boolean found = false;

		for(int i=0; i<arl.size(); i++)
		{
			Employee obj = arl.get(i);

			if(id == obj.id)
			{
				obj.display();
				found = true;
			}
		}
		if(!found)
			System.out.println("Employee not found");
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//To create an ArrayList of Employee Objects and 
//Search for a particular Employee object based on id number
import java.io.*;
import java.util.*;
class Employee
{
	int id;
	String name;
	String address;

	Employee(int i, String n, String a )
	{
		id =i; 
		name = n;
		address = a;
	}
	void display()
	{
		System.out.println("ID: "+id);
		System.out.println("Name "+name);
		System.out.println("Address: "+address);
	}
}
class EmpList
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int id;
		String name;
		String address;

		ArrayList<Employee> arl = new ArrayList<>();

		for(int i=0; i<5; i++)
		{
			System.out.print("Enter id: ");
			id = Integer.parseInt(br.readLine());

			System.out.print("Enter name: ");
			name = br.readLine();

			System.out.print("Enter address: ");
			address = br.readLine();

			Employee obj = new Employee(id, name, address);

			arl.add(obj);
		}
		System.out.print("Enter id to search: ");
		id = Integer.parseInt(br.readLine());

		boolean found = false;

		for(int i=0; i<arl.size(); i++)
		{
			Employee obj = arl.get(i);

			if(id == obj.id)
			{
				obj.display();
				found = true;
			}
		}
		if(!found)
			System.out.println("Employee not found");
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}