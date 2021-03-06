<<<<<<< HEAD
<<<<<<< HEAD
//Thread unsafe - Two threads acting on same object
class Reserve implements Runnable
{
	int available = 1;
	int wanted;
	Reserve(int i)
	{
		wanted = i;
	}
	public void run()
	{
		System.out.println("Available Berths = "+available);
		if(available >= wanted)
		{
			String name = Thread.currentThread().getName();
			System.out.println(wanted+" Berths reserved for "+name);
			try
			{
				Thread.sleep(1500);
				available = available - wanted;
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
		else	System.out.println("Sorry, no berths");
	}
}
class Unsafe
{
	public static void main(String[] args) 
	{
		Reserve obj = new Reserve(1);

		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);

		t1.setName("First Person");
		t1.setName("Second Person");

		t1.start();
		t2.start();
	}
=======
//Thread unsafe - Two threads acting on same object
class Reserve implements Runnable
{
	int available = 1;
	int wanted;
	Reserve(int i)
	{
		wanted = i;
	}
	public void run()
	{
		System.out.println("Available Berths = "+available);
		if(available >= wanted)
		{
			String name = Thread.currentThread().getName();
			System.out.println(wanted+" Berths reserved for "+name);
			try
			{
				Thread.sleep(1500);
				available = available - wanted;
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
		else	System.out.println("Sorry, no berths");
	}
}
class Unsafe
{
	public static void main(String[] args) 
	{
		Reserve obj = new Reserve(1);

		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);

		t1.setName("First Person");
		t1.setName("Second Person");

		t1.start();
		t2.start();
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Thread unsafe - Two threads acting on same object
class Reserve implements Runnable
{
	int available = 1;
	int wanted;
	Reserve(int i)
	{
		wanted = i;
	}
	public void run()
	{
		System.out.println("Available Berths = "+available);
		if(available >= wanted)
		{
			String name = Thread.currentThread().getName();
			System.out.println(wanted+" Berths reserved for "+name);
			try
			{
				Thread.sleep(1500);
				available = available - wanted;
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
		else	System.out.println("Sorry, no berths");
	}
}
class Unsafe
{
	public static void main(String[] args) 
	{
		Reserve obj = new Reserve(1);

		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);

		t1.setName("First Person");
		t1.setName("Second Person");

		t1.start();
		t2.start();
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}