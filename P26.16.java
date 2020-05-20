<<<<<<< HEAD
<<<<<<< HEAD
//Fixed thread pool
import java.util.concurrent.*;
class Tasks implements Runnable
{
	private int taskno;

	Tasks(int taskno)
	{
		this.taskno = taskno;
	}
	public void run()
	{
		for(int i=0; i<=100; i+=25)
		{
			String name = Thread.currentThread().getName();
			System.out.println(name+" completed task "+taskno+" by "+i+" percent.");
			try
			{
				Thread.sleep(3000);
			}catch(InterruptedException ie){}
		}
	}
}
class ThreadPoolDemo
{
	public static void main(String[] args) 
	{
		ExecutorService es = Executors.newFixedThreadPool(2);

		Tasks t[] = new Tasks[4];

		for(int i=0; i<4; i++)	
		{
			t[i] = new Tasks(i);

			es.execute(t[i]);
		}
		es.shutdown();
	}
=======
//Fixed thread pool
import java.util.concurrent.*;
class Tasks implements Runnable
{
	private int taskno;

	Tasks(int taskno)
	{
		this.taskno = taskno;
	}
	public void run()
	{
		for(int i=0; i<=100; i+=25)
		{
			String name = Thread.currentThread().getName();
			System.out.println(name+" completed task "+taskno+" by "+i+" percent.");
			try
			{
				Thread.sleep(3000);
			}catch(InterruptedException ie){}
		}
	}
}
class ThreadPoolDemo
{
	public static void main(String[] args) 
	{
		ExecutorService es = Executors.newFixedThreadPool(2);

		Tasks t[] = new Tasks[4];

		for(int i=0; i<4; i++)	
		{
			t[i] = new Tasks(i);

			es.execute(t[i]);
		}
		es.shutdown();
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Fixed thread pool
import java.util.concurrent.*;
class Tasks implements Runnable
{
	private int taskno;

	Tasks(int taskno)
	{
		this.taskno = taskno;
	}
	public void run()
	{
		for(int i=0; i<=100; i+=25)
		{
			String name = Thread.currentThread().getName();
			System.out.println(name+" completed task "+taskno+" by "+i+" percent.");
			try
			{
				Thread.sleep(3000);
			}catch(InterruptedException ie){}
		}
	}
}
class ThreadPoolDemo
{
	public static void main(String[] args) 
	{
		ExecutorService es = Executors.newFixedThreadPool(2);

		Tasks t[] = new Tasks[4];

		for(int i=0; i<4; i++)	
		{
			t[i] = new Tasks(i);

			es.execute(t[i]);
		}
		es.shutdown();
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}