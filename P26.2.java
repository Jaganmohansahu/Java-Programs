<<<<<<< HEAD
<<<<<<< HEAD
//To create a thread and run it
class MyThread extends Thread 
{
	public void run()
	{
		for(int i=1; i<=100000; i++)
		{
			System.out.println(i);
		}
	}
}
class Demo1
{
	public static void main(String[] args) 
	{
		MyThread obj = new MyThread();

		Thread t = new Thread(obj);

		t.start();	
	}
=======
//To create a thread and run it
class MyThread extends Thread 
{
	public void run()
	{
		for(int i=1; i<=100000; i++)
		{
			System.out.println(i);
		}
	}
}
class Demo1
{
	public static void main(String[] args) 
	{
		MyThread obj = new MyThread();

		Thread t = new Thread(obj);

		t.start();	
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//To create a thread and run it
class MyThread extends Thread 
{
	public void run()
	{
		for(int i=1; i<=100000; i++)
		{
			System.out.println(i);
		}
	}
}
class Demo1
{
	public static void main(String[] args) 
	{
		MyThread obj = new MyThread();

		Thread t = new Thread(obj);

		t.start();	
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}