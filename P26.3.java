<<<<<<< HEAD
<<<<<<< HEAD
//To create a thread and run it, then stop it
import java.io.*;
class MyThread extends Thread 
{
	boolean stop = false;
	public void run()
	{
		for(int i=1; i<=100000; i++)
		{
			System.out.println(i);
			if(stop)
				return;
		}
	}
}
class Demo1
{
	public static void main(String args[]) throws IOException
	{
		MyThread obj = new MyThread();
		Thread t = new Thread(obj);
		t.start();

		System.in.read();
		obj.stop = true;
	}
=======
//To create a thread and run it, then stop it
import java.io.*;
class MyThread extends Thread 
{
	boolean stop = false;
	public void run()
	{
		for(int i=1; i<=100000; i++)
		{
			System.out.println(i);
			if(stop)
				return;
		}
	}
}
class Demo1
{
	public static void main(String args[]) throws IOException
	{
		MyThread obj = new MyThread();
		Thread t = new Thread(obj);
		t.start();

		System.in.read();
		obj.stop = true;
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//To create a thread and run it, then stop it
import java.io.*;
class MyThread extends Thread 
{
	boolean stop = false;
	public void run()
	{
		for(int i=1; i<=100000; i++)
		{
			System.out.println(i);
			if(stop)
				return;
		}
	}
}
class Demo1
{
	public static void main(String args[]) throws IOException
	{
		MyThread obj = new MyThread();
		Thread t = new Thread(obj);
		t.start();

		System.in.read();
		obj.stop = true;
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}