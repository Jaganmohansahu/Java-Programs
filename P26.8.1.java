<<<<<<< HEAD
<<<<<<< HEAD
//Thread Deadlock
class BookTicket extends Thread
{
	Object train, comp;
	BookTicket(Object train, Object comp)
	{
		this.train = train;
		this.comp = comp;
	}
	public void run()
	{
		synchronized(train)
		{
			System.out.println("BookTicket locked on train");
			try
			{
				Thread.sleep(1500);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
			System.out.println("BookTicket now waiting to lock on compartment...");
			synchronized(comp)
			{
				System.out.println("BookTicket locked on compartment");
			}
		}
	}
}
class CancelTicket extends Thread
{
	Object train, comp;
	CancelTicket(Object train, Object comp)
	{
		this.train = train;
		this.comp = comp;
	}
	public void run()
	{
		synchronized(train)
		{
			System.out.println("CancelTicket locked on train");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e){}

			System.out.println("CancelTicket now waiting to lock on compartment...");
			synchronized(comp)
			{
				System.out.println("CancelTicket locked on compartment");
			}
		}
	}
}
class DeadLock
{
	public static void main(String[] args) throws Exception 
	{
		Object train = new Object();
		Object compartment = new Object();

		BookTicket obj1 = new BookTicket(train, compartment);
		CancelTicket obj2 = new CancelTicket(train, compartment);

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		t2.start();
	}
=======
//Thread Deadlock
class BookTicket extends Thread
{
	Object train, comp;
	BookTicket(Object train, Object comp)
	{
		this.train = train;
		this.comp = comp;
	}
	public void run()
	{
		synchronized(train)
		{
			System.out.println("BookTicket locked on train");
			try
			{
				Thread.sleep(1500);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
			System.out.println("BookTicket now waiting to lock on compartment...");
			synchronized(comp)
			{
				System.out.println("BookTicket locked on compartment");
			}
		}
	}
}
class CancelTicket extends Thread
{
	Object train, comp;
	CancelTicket(Object train, Object comp)
	{
		this.train = train;
		this.comp = comp;
	}
	public void run()
	{
		synchronized(train)
		{
			System.out.println("CancelTicket locked on train");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e){}

			System.out.println("CancelTicket now waiting to lock on compartment...");
			synchronized(comp)
			{
				System.out.println("CancelTicket locked on compartment");
			}
		}
	}
}
class DeadLock
{
	public static void main(String[] args) throws Exception 
	{
		Object train = new Object();
		Object compartment = new Object();

		BookTicket obj1 = new BookTicket(train, compartment);
		CancelTicket obj2 = new CancelTicket(train, compartment);

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		t2.start();
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Thread Deadlock
class BookTicket extends Thread
{
	Object train, comp;
	BookTicket(Object train, Object comp)
	{
		this.train = train;
		this.comp = comp;
	}
	public void run()
	{
		synchronized(train)
		{
			System.out.println("BookTicket locked on train");
			try
			{
				Thread.sleep(1500);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
			System.out.println("BookTicket now waiting to lock on compartment...");
			synchronized(comp)
			{
				System.out.println("BookTicket locked on compartment");
			}
		}
	}
}
class CancelTicket extends Thread
{
	Object train, comp;
	CancelTicket(Object train, Object comp)
	{
		this.train = train;
		this.comp = comp;
	}
	public void run()
	{
		synchronized(train)
		{
			System.out.println("CancelTicket locked on train");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e){}

			System.out.println("CancelTicket now waiting to lock on compartment...");
			synchronized(comp)
			{
				System.out.println("CancelTicket locked on compartment");
			}
		}
	}
}
class DeadLock
{
	public static void main(String[] args) throws Exception 
	{
		Object train = new Object();
		Object compartment = new Object();

		BookTicket obj1 = new BookTicket(train, compartment);
		CancelTicket obj2 = new CancelTicket(train, compartment);

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		t2.start();
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}