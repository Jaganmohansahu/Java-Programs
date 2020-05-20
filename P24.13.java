<<<<<<< HEAD
<<<<<<< HEAD
//De=serialization -> to retrive objects from obj 	\\ERROR
import java.io.*;
import java.util.*;
class GetObj
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fis = new FileInputStream("objfile");

		ObjectInputStream ois = new ObjectInputStream(fis);

		try
		{
			Employee e;
			while((e=(Employee)ois.readObject()) != null)
			{
				e.displayData();
			}
		}
		catch(EOFException ee)
		{
		System.out.println("End of file reached");
	}
	finally
	{
		ois.close();
	}
}
=======
//De=serialization -> to retrive objects from obj 	\\ERROR
import java.io.*;
import java.util.*;
class GetObj
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fis = new FileInputStream("objfile");

		ObjectInputStream ois = new ObjectInputStream(fis);

		try
		{
			Employee e;
			while((e=(Employee)ois.readObject()) != null)
			{
				e.displayData();
			}
		}
		catch(EOFException ee)
		{
		System.out.println("End of file reached");
	}
	finally
	{
		ois.close();
	}
}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//De=serialization -> to retrive objects from obj 	\\ERROR
import java.io.*;
import java.util.*;
class GetObj
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fis = new FileInputStream("objfile");

		ObjectInputStream ois = new ObjectInputStream(fis);

		try
		{
			Employee e;
			while((e=(Employee)ois.readObject()) != null)
			{
				e.displayData();
			}
		}
		catch(EOFException ee)
		{
		System.out.println("End of file reached");
	}
	finally
	{
		ois.close();
	}
}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}