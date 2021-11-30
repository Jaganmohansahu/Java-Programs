//A server with 2 threads to contact multiple clients
import java.io.*;
import java.net.*;
class MultiServe implements Runnable
{
	static ServerSocket ss;
	static Socket s;

	public void run()
	{
		String name = Thread.currentThread().getName();
		for (; ; ) 
		{
			try
			{
				System.out.println("Thread "+name+" ready to accept...");
				s = ss.accept();
				System.out.println("Thread "+name+" accpted a connection");

				PrintStream ps = new PrintStream(s.getOutputStream());
				ps.System.out.println("Thread "+name+" contacted you");

				ps.close();
				s.close();
			}	
			catch(Exception e){}
		}
	}
	public static void main(String[] args) 
	{
		MultiServe ms = new MultiServe();

		ss = new ServerSocket(999);

		Thread t1 = new Thread(ms, "One");
		Thread t2 = new Thread(ms, "Two");

		t1.start();
		t2.start();
	}
}