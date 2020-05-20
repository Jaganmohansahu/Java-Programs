<<<<<<< HEAD
<<<<<<< HEAD
//Two threads performing two tasks at a time
class MyThread implements Runnable
{
	String str;
	MyThread(String str)
	{
		this.str = str;
	}
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(str+" : "+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
	}
}
class Theatre
{
	public static void main(String[] args) 
	{
		MyThread obj1 = new MyThread("Cut the ticket");
		MyThread obj2 = new MyThread("Show the seat");	

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		t2.start();
	}
=======
//Two threads performing two tasks at a time
class MyThread implements Runnable
{
	String str;
	MyThread(String str)
	{
		this.str = str;
	}
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(str+" : "+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
	}
}
class Theatre
{
	public static void main(String[] args) 
	{
		MyThread obj1 = new MyThread("Cut the ticket");
		MyThread obj2 = new MyThread("Show the seat");	

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		t2.start();
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Two threads performing two tasks at a time
class MyThread implements Runnable
{
	String str;
	MyThread(String str)
	{
		this.str = str;
	}
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(str+" : "+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
	}
}
class Theatre
{
	public static void main(String[] args) 
	{
		MyThread obj1 = new MyThread("Cut the ticket");
		MyThread obj2 = new MyThread("Show the seat");	

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		t2.start();
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}