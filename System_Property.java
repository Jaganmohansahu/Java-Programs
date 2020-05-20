/** System and Runtime classes were designed 
	to encapsulate the necessary connections to the underlying operating system.
	All methods and variables in the System class are static.
	*/
//The following program displays the System properties by using the System.getProperties() method.

import java.util.Properties;
class SystemProperty
{
	public static void main(String[] args) 
	{
		Properties properties;

		properties = System.getProperties();
		properties.list(System.out);	
	}
}