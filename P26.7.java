//Thread Synchronization - Two threads are acting on same object
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
		synchronized(this)
		{
			System.out.println("Available Berths = "+available);
			if(available >= wanted)
			{
				String name = Thread.currentThread().getName();
				System.out.println(wanted+" Berths reserved for "+name);
				try
				{
					Thread.sleep(1500);
					available = available -wanted;
				}
				catch(InterruptedException ie)
				{
					ie.printStackTrace();
				}
			}else	System.out.println("Sorry, no berths");
		}
	}
}
class Safe
{
	public static void main(String[] args) 
	{
		Reserve obj = new Reserve(1);	

		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);

		t1.setName("First person");
		t2.setName("Second person");

		t1.start();
		t2.start();
	}
}