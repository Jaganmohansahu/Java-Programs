// This program uses exec() method to start an external application.
// Here we get current runtime object, with that we invoke exec method

import java.util.Properties;
import java.io.*;
class RunExternal
{
	public static void main(String[] args) 
	{
		try
		{
			// Get the current runtime to interface with the environment
			//in which the application is running
			Runtime runtime = Runtime.getRuntime();
			System.out.println("Solve the problem within 10 seconds!!");
			Process process = runtime.exec("calc");
			//Executes the specified string command in a separate process

				Thread.sleep(10*1000);
				try{
				Runtime.getRuntime().exec("taskkill /F /IM calc");

			process.destroy();	// Kills the process forcibly
		}catch(Exception e){e.printStackTrace();}

			int exitValueCalc = process.exitValue();
			// The exit value 0 indicates normal termination

			System.out.println("Process Exit Value: " + exitValueCalc);
		}	
		catch(Throwable e)
		{
			e.printStackTrace();
		}
	}
}