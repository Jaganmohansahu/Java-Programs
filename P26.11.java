<<<<<<< HEAD
<<<<<<< HEAD
//Thread priorities
class MyClass extends Thread
{
	int count = 0;
	public void run()
	{
		for(int i=1; i<=10000; i++)
			count++;

		System.out.println("Completed thread: "+Thread.currentThread().getName());
		System.out.println("Its priority: "+Thread.currentThread().getPriority());
	}
}
class Prior
{
	public static void main(String[] args) 
	{
		MyClass obj = new MyClass();

		Thread t1 = new Thread(obj, "One");
		Thread t2 = new Thread(obj, "Two");

		t1.setPriority(2);
		t2.setPriority(Thread.NORM_PRIORITY);

		t1.start();
		t2.start();
	}
=======
//Thread priorities
class MyClass extends Thread
{
	int count = 0;
	public void run()
	{
		for(int i=1; i<=10000; i++)
			count++;

		System.out.println("Completed thread: "+Thread.currentThread().getName());
		System.out.println("Its priority: "+Thread.currentThread().getPriority());
	}
}
class Prior
{
	public static void main(String[] args) 
	{
		MyClass obj = new MyClass();

		Thread t1 = new Thread(obj, "One");
		Thread t2 = new Thread(obj, "Two");

		t1.setPriority(2);
		t2.setPriority(Thread.NORM_PRIORITY);

		t1.start();
		t2.start();
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Thread priorities
class MyClass extends Thread
{
	int count = 0;
	public void run()
	{
		for(int i=1; i<=10000; i++)
			count++;

		System.out.println("Completed thread: "+Thread.currentThread().getName());
		System.out.println("Its priority: "+Thread.currentThread().getPriority());
	}
}
class Prior
{
	public static void main(String[] args) 
	{
		MyClass obj = new MyClass();

		Thread t1 = new Thread(obj, "One");
		Thread t2 = new Thread(obj, "Two");

		t1.setPriority(2);
		t2.setPriority(Thread.NORM_PRIORITY);

		t1.start();
		t2.start();
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}