/** The following program will pop up a notepad window
	and prints all the environment variables */

import java.lang.ProcessBuilder;
import java.lang.Process;
import java.util.*;
class Process1
{
	public static void main(String[] args) throws Exception
	{
		ProcessBuilder pb = new ProcessBuilder("C:\\WINDOWS\\NOTEPAD>EXE");
		Map<String, String> env = pb.environment();
		pb.redirectErrorStream(true);
		Process p = pb.start();
		System.out.println(env);
	}
}