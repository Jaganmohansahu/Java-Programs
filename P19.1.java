<<<<<<< HEAD
<<<<<<< HEAD
//Interface example - Connecting to any Database
interface MyInter
{
	void connect();
	void disconnect();
}
class OracleDB implements MyInter
{
	public void connect()
	{
		System.out.println("Connecting to Oracle database...");
	}
	public void disconnect()
	{
		System.out.println("Disconnected from Oracle");
	}
}
class SybaseDB implements MyInter
{
	public void connect()
	{
		System.out.println("Connecting to Sybase database...");
	}
	public void disconnect()
	{
		System.out.println("Disconnected from Sybase");
	}
}
class InterfaceDemo
{
	public static void main(String[] args)	throws Exception 
	{
			Class c = Class.forName(args[0]);
			MyInter mi = (MyInter)c.newInstance();

			mi.connect();
			mi.disconnect(); 
	}
=======
//Interface example - Connecting to any Database
interface MyInter
{
	void connect();
	void disconnect();
}
class OracleDB implements MyInter
{
	public void connect()
	{
		System.out.println("Connecting to Oracle database...");
	}
	public void disconnect()
	{
		System.out.println("Disconnected from Oracle");
	}
}
class SybaseDB implements MyInter
{
	public void connect()
	{
		System.out.println("Connecting to Sybase database...");
	}
	public void disconnect()
	{
		System.out.println("Disconnected from Sybase");
	}
}
class InterfaceDemo
{
	public static void main(String[] args)	throws Exception 
	{
			Class c = Class.forName(args[0]);
			MyInter mi = (MyInter)c.newInstance();

			mi.connect();
			mi.disconnect(); 
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Interface example - Connecting to any Database
interface MyInter
{
	void connect();
	void disconnect();
}
class OracleDB implements MyInter
{
	public void connect()
	{
		System.out.println("Connecting to Oracle database...");
	}
	public void disconnect()
	{
		System.out.println("Disconnected from Oracle");
	}
}
class SybaseDB implements MyInter
{
	public void connect()
	{
		System.out.println("Connecting to Sybase database...");
	}
	public void disconnect()
	{
		System.out.println("Disconnected from Sybase");
	}
}
class InterfaceDemo
{
	public static void main(String[] args)	throws Exception 
	{
			Class c = Class.forName(args[0]);
			MyInter mi = (MyInter)c.newInstance();

			mi.connect();
			mi.disconnect(); 
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}