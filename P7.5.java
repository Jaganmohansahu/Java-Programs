//employee details
import java.io.*;
class EmpData
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter ID: ");
		int id = Integer.parseInt(br.readLine());

		System.out.println("Enter sex(M/F)");
		char sex = (char)br.read();
		br.skip(2);		

		System.out.print("Enter name:");
		String name = br.readLine();

		System.out.println("ID is"+id);
		System.out.println("SEX IS"+sex);
		System.out.println("NAME IS"+name);
	
	}
}