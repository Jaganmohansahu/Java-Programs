<<<<<<< HEAD
<<<<<<< HEAD
class Television
{
	private static String Manufacturer;
	private static int SCREEN_SIZE;
	private boolean powerOn;
	private int volume;
	private int channel;
	String pow = "off";
	static java.util.Scanner sc = new java.util.Scanner(System.in);
	public Television(String brand, int size)
{
	System.out.println("A "+size+" inch "+brand+" has been turned "+pow+"\n");
	power();
	System.out.println("A "+size+" inch "+brand+" has been turned "+pow+"\n");
	if(powerOn==true)
	{
		channel = getChannel();
		System.out.println("Channel: "+channel+" volume: "+getVolume()+"\n");
		System.out.println("Too low...!!  I am increase the volume"+"\n");
		increaseVolume();
		System.out.println("Channel: "+channel+" Volume: "+volume+"\n");
		System.out.println("Too loud...!!  I am decreasing the volume"+"\n");
		decreaseVolume();
		System.out.println("Channel: "+channel+" Volume: "+volume+"\n");
	}
	else
	{
		System.out.println("Please turn on the television");
	}
}
void setChannel(int station)
{
	channel = station;
}
void power()
{
	System.out.println("Enter the power button");
	String press = sc.next();
	if(press.equalsIgnoreCase("ON"))
	{
		powerOn = true;
		pow = "ON";
	}
	else
	{
		powerOn = false;
		pow = "OFF";
	}
}
public void increaseVolume()
{
	System.out.println("Enter the increaseVolume");
	int inc = sc.nextInt();
	volume = volume+inc;
}
public void decreaseVolume()
{
	System.out.println("Enter the decreaseVolume");
	int dec = sc.nextInt();
	volume = volume-dec;
}
public int getChannel()
{
	System.out.println("What channel do you want??");
	channel = sc.nextInt();
	return channel;
}
int getVolume()
{
	System.out.println("Enter the volume: ");
	volume = sc.nextInt();
	return volume;
}
static String getManufacturer()
{
	System.out.println("Enter the name of Manufacturer: ");
	Manufacturer = sc.next();
	return Manufacturer;
}
static int getScreenSize()
{
	System.out.println("Enter the size of the screen: ");
	SCREEN_SIZE = sc.nextInt();
	return SCREEN_SIZE;
}
public static void main(String[] args) 
{
	Television tv = new Television(Television .getManufacturer(), Television. getScreenSize());

}
=======
class Television
{
	private static String Manufacturer;
	private static int SCREEN_SIZE;
	private boolean powerOn;
	private int volume;
	private int channel;
	String pow = "off";
	static java.util.Scanner sc = new java.util.Scanner(System.in);
	public Television(String brand, int size)
{
	System.out.println("A "+size+" inch "+brand+" has been turned "+pow+"\n");
	power();
	System.out.println("A "+size+" inch "+brand+" has been turned "+pow+"\n");
	if(powerOn==true)
	{
		channel = getChannel();
		System.out.println("Channel: "+channel+" volume: "+getVolume()+"\n");
		System.out.println("Too low...!!  I am increase the volume"+"\n");
		increaseVolume();
		System.out.println("Channel: "+channel+" Volume: "+volume+"\n");
		System.out.println("Too loud...!!  I am decreasing the volume"+"\n");
		decreaseVolume();
		System.out.println("Channel: "+channel+" Volume: "+volume+"\n");
	}
	else
	{
		System.out.println("Please turn on the television");
	}
}
void setChannel(int station)
{
	channel = station;
}
void power()
{
	System.out.println("Enter the power button");
	String press = sc.next();
	if(press.equalsIgnoreCase("ON"))
	{
		powerOn = true;
		pow = "ON";
	}
	else
	{
		powerOn = false;
		pow = "OFF";
	}
}
public void increaseVolume()
{
	System.out.println("Enter the increaseVolume");
	int inc = sc.nextInt();
	volume = volume+inc;
}
public void decreaseVolume()
{
	System.out.println("Enter the decreaseVolume");
	int dec = sc.nextInt();
	volume = volume-dec;
}
public int getChannel()
{
	System.out.println("What channel do you want??");
	channel = sc.nextInt();
	return channel;
}
int getVolume()
{
	System.out.println("Enter the volume: ");
	volume = sc.nextInt();
	return volume;
}
static String getManufacturer()
{
	System.out.println("Enter the name of Manufacturer: ");
	Manufacturer = sc.next();
	return Manufacturer;
}
static int getScreenSize()
{
	System.out.println("Enter the size of the screen: ");
	SCREEN_SIZE = sc.nextInt();
	return SCREEN_SIZE;
}
public static void main(String[] args) 
{
	Television tv = new Television(Television .getManufacturer(), Television. getScreenSize());

}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
class Television
{
	private static String Manufacturer;
	private static int SCREEN_SIZE;
	private boolean powerOn;
	private int volume;
	private int channel;
	String pow = "off";
	static java.util.Scanner sc = new java.util.Scanner(System.in);
	public Television(String brand, int size)
{
	System.out.println("A "+size+" inch "+brand+" has been turned "+pow+"\n");
	power();
	System.out.println("A "+size+" inch "+brand+" has been turned "+pow+"\n");
	if(powerOn==true)
	{
		channel = getChannel();
		System.out.println("Channel: "+channel+" volume: "+getVolume()+"\n");
		System.out.println("Too low...!!  I am increase the volume"+"\n");
		increaseVolume();
		System.out.println("Channel: "+channel+" Volume: "+volume+"\n");
		System.out.println("Too loud...!!  I am decreasing the volume"+"\n");
		decreaseVolume();
		System.out.println("Channel: "+channel+" Volume: "+volume+"\n");
	}
	else
	{
		System.out.println("Please turn on the television");
	}
}
void setChannel(int station)
{
	channel = station;
}
void power()
{
	System.out.println("Enter the power button");
	String press = sc.next();
	if(press.equalsIgnoreCase("ON"))
	{
		powerOn = true;
		pow = "ON";
	}
	else
	{
		powerOn = false;
		pow = "OFF";
	}
}
public void increaseVolume()
{
	System.out.println("Enter the increaseVolume");
	int inc = sc.nextInt();
	volume = volume+inc;
}
public void decreaseVolume()
{
	System.out.println("Enter the decreaseVolume");
	int dec = sc.nextInt();
	volume = volume-dec;
}
public int getChannel()
{
	System.out.println("What channel do you want??");
	channel = sc.nextInt();
	return channel;
}
int getVolume()
{
	System.out.println("Enter the volume: ");
	volume = sc.nextInt();
	return volume;
}
static String getManufacturer()
{
	System.out.println("Enter the name of Manufacturer: ");
	Manufacturer = sc.next();
	return Manufacturer;
}
static int getScreenSize()
{
	System.out.println("Enter the size of the screen: ");
	SCREEN_SIZE = sc.nextInt();
	return SCREEN_SIZE;
}
public static void main(String[] args) 
{
	Television tv = new Television(Television .getManufacturer(), Television. getScreenSize());

}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}