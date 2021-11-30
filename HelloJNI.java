public class HelloJNI
{
	static
	{
		System.loadLibrary("Hello");
	}
	private native void sayHello();

	public static void main(String[] args) 
	{
		new HelloJNI().sayHello();	
	}
}