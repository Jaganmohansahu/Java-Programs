//Program to run an external program

import java.util.Properties;
import java.io.*;
class ExternalProg
{
	public static void main(String[] args) 
	{
		//Loading an external program
		try
		{
			Process p = Runtime.getRuntime().exec("C:\\Program Files (x86)\\Cheat Engine 6.6\\Cheat Engine.exe");

		}	catch(IOException e){}
	}
}