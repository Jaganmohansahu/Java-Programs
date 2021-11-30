//Scanner to scan the input from keyboard
import java.util.Scanner;
class Ex3
{
	public static void main(String[] args) 
	{
		System.out.println("Enter id, name, salary: ");	
		Scanner sc = new Scanner(System.in);

		int id = sc.nextInt();
		String name = sc.next();
		float sal = sc.nextFloat();

		System.out.println("ID= "+id);
		System.out.println("NAME= "+name);
		System.out.println("SALARY= "+sal);
	}
}