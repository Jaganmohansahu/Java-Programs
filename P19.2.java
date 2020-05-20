<<<<<<< HEAD
<<<<<<< HEAD
//An interface Printer to send text to any printer
import java.io.*;
interface Printer
{
	void printit(String text);
	void disconnect();
} 
class IBMPrinter implements Printer
{
	public void printit(String text)
	{
		System.out.println(text);
	}
	public void disconnect()
	{
		System.out.println("Printing completed");
		System.out.println("DIsconnected from IBM Printer");
	}
}
class EPSONPrinter implements Printer
{
	public void printit(String text)
	{
		System.out.println(text);
	}
	public void disconnect()
	{
		System.out.println("Printing completed");
		System.out.println("Disconnected from EPSON Printer");
	}
}
class UsePrinter
{
	public static void main(String[] args) throws Exception
	{
		FileReader fr = new FileReader("config.txt");
		LineNumberReader lnr = new LineNumberReader(fr);
		String printername = lnr.readLine();
		System.out.println("Loading the driver for: "+printername);
		Class c = Class.forName(printername);
		Printer ref = (Printer)c.newInstance();
		ref.printit("Hello, This is printed on the printer");
		ref.disconnect();
	}
=======
//An interface Printer to send text to any printer
import java.io.*;
interface Printer
{
	void printit(String text);
	void disconnect();
} 
class IBMPrinter implements Printer
{
	public void printit(String text)
	{
		System.out.println(text);
	}
	public void disconnect()
	{
		System.out.println("Printing completed");
		System.out.println("DIsconnected from IBM Printer");
	}
}
class EPSONPrinter implements Printer
{
	public void printit(String text)
	{
		System.out.println(text);
	}
	public void disconnect()
	{
		System.out.println("Printing completed");
		System.out.println("Disconnected from EPSON Printer");
	}
}
class UsePrinter
{
	public static void main(String[] args) throws Exception
	{
		FileReader fr = new FileReader("config.txt");
		LineNumberReader lnr = new LineNumberReader(fr);
		String printername = lnr.readLine();
		System.out.println("Loading the driver for: "+printername);
		Class c = Class.forName(printername);
		Printer ref = (Printer)c.newInstance();
		ref.printit("Hello, This is printed on the printer");
		ref.disconnect();
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//An interface Printer to send text to any printer
import java.io.*;
interface Printer
{
	void printit(String text);
	void disconnect();
} 
class IBMPrinter implements Printer
{
	public void printit(String text)
	{
		System.out.println(text);
	}
	public void disconnect()
	{
		System.out.println("Printing completed");
		System.out.println("DIsconnected from IBM Printer");
	}
}
class EPSONPrinter implements Printer
{
	public void printit(String text)
	{
		System.out.println(text);
	}
	public void disconnect()
	{
		System.out.println("Printing completed");
		System.out.println("Disconnected from EPSON Printer");
	}
}
class UsePrinter
{
	public static void main(String[] args) throws Exception
	{
		FileReader fr = new FileReader("config.txt");
		LineNumberReader lnr = new LineNumberReader(fr);
		String printername = lnr.readLine();
		System.out.println("Loading the driver for: "+printername);
		Class c = Class.forName(printername);
		Printer ref = (Printer)c.newInstance();
		ref.printit("Hello, This is printed on the printer");
		ref.disconnect();
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}