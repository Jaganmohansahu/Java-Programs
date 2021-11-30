//Link List
import java.util.*;
class Employee
{
	int empid;
	Employee next;
}
class LinkedList_Manually
{
	class Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		Employee begin = new Employee();
		begin.empid = input();
		begin.next = null;
		while(true)
		{
			System.out.println("1- Insert at begin \n 2- Insert at end");
			System.out.println("10- Display \n 0- EXIT");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1:
				begin = insertAtbegin(begin);
				break;
				case 2:
				insertAtEnd(begin);
				break;
				case 10;
				displayList(begin);
				break
				case 0:
				system.exit(0);
				default:
				System.out.println("Not a valid choice");
			}	//end of switch
		}	//end of while
	}	//end of main
	public static Employee insertAtbegin(Employee begin)
	{
		Employee temp = new Employee();
		temp.empid = input();
		temp.next = begin;
		return temp;
	}
	public static void insertAtEnd(Employee begin)
	{
		Employee temp = new Employee();
		temp.empid = input();
		
		while(begin.next!= null)
			begin = begin.next;
		begin.next = temp;
	}
	public static void displayList(Employee begin)
	{
		System.out.println("Employee details: ");
		while(begin!= null)
		{
			System.out.println(begin.empid);
			begin = begin.next;
		}
	}
	static int input()
	{
		System.out.println("Enter the id for new employee: ");
		int empid = sc.nextInt();
		begin = begin.next;
	}
}