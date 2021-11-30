//Single tasking using a thread
class MyThread implements Runnable
{
	public void run()
	{
		task1();
		task2();
		task3();
	}
	void task1()
	{
		System.out.println("This is task 1");
	}
	void task2()
	{
		System.out.println("This is task 2");
	}
	void task3()
	{
		System.out.println("This is task 3");
	}
}
class Single
{
	public static void main(String[] args) 
	{
		MyThread obj = new MyThread();
		Thread t1 = new Thread(obj);
		t1.start();	
	}
}