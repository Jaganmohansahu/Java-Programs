//Connecting to www.yahoo.com and getting the details
import java.io.*;
import java.net.*;
import java.util.*;
class Details
{
	public static void main(String[] args) throws Exception
	{
		URL obj = new URL("http://intranet.iiit-bh.ac.in/academic");
		URLConnection conn = obj.openConnection();
		System.out.println("Date: "+new Date(conn.getDate()));
		System.out.println("Content-Type: "+conn.getContentType());
		System.out.println("Expiry: "+conn.getExpiration());
		System.out.println("Last modified: "+new Date(conn.getLastModified()));
		int l = conn.getContentLength();
		System.out.println("Length of content: "+l);
		if(l==0)
		{
			System.out.println("Content not available");
			return;
		}
		else
		{
			int ch;
			InputStream in = conn.getInputStream();
			while((ch = in.read()) != -1)
				System.out.print((char)ch);
		}
	}
}