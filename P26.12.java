//Using thread groups
class TGroups
{
	public static void main(String[] args) throws Exception
	{
		Reservation res = new Reservation();
		Cancellation can = new Cancellation();

		ThreadGroup tg = new ThreadGroup("First Group");

		Thread t1 = new Thread(tg, res, "First Thread");
		Thread t2 = new Thread(tg, res, "Second Thread");

		ThreadGroup tg1 = new ThreadGroup(tg, "Second Group");

		Thread t3 = new Thread(tg1, can, "Third Thread");
		Thread t4 = new Thread(tg1, can, "Fourth Thread");

		System.out.println("Parent of tg1 = "+tg1.getParent());

		tg1.setMaxPriority(7);

		System.out.println("Thread group of t1 = "+t1.getThreadGroup());
		System.out.println("Thread group of t3 = "+t3.getThreadGroup());

		t1.start();
		t2.start();
		t3.start();
		t4.start();

		System.out.println("No. of threads active in thread group = "+tg.activeCount());
	}
}
class Reservation extends Thread 
{
	public void run()
	{
		System.out.println("I am reservartion thread");
	}
}
class Cancellation extends Thread
{
	public void run()
	{
		System.out.println("I am cancellation thread");
	}
}