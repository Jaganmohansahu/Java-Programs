<<<<<<< HEAD
<<<<<<< HEAD
import java.sql.*;
class Updation
{
	public static void main(String[] args) throws Exception
	{
			String dname = System.getProperty("driver");

			Class.forName(dname);

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "tiger");

			Statement stmt = con.createStatement();

			int norows = stmt.executeUpdate("update emptab sal=30000 where eno>1001");
			System.out.println("No. of rows updated = "+norows);

			System.out.println("Press a key to continue...");
			System.in.read();

			norows = stmt.executeUpdate("delete emptab where eno<800");
			System.out.println("no of rows deleted = " + norows);

			con.close();
	}
=======
import java.sql.*;
class Updation
{
	public static void main(String[] args) throws Exception
	{
			String dname = System.getProperty("driver");

			Class.forName(dname);

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "tiger");

			Statement stmt = con.createStatement();

			int norows = stmt.executeUpdate("update emptab sal=30000 where eno>1001");
			System.out.println("No. of rows updated = "+norows);

			System.out.println("Press a key to continue...");
			System.in.read();

			norows = stmt.executeUpdate("delete emptab where eno<800");
			System.out.println("no of rows deleted = " + norows);

			con.close();
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
import java.sql.*;
class Updation
{
	public static void main(String[] args) throws Exception
	{
			String dname = System.getProperty("driver");

			Class.forName(dname);

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "tiger");

			Statement stmt = con.createStatement();

			int norows = stmt.executeUpdate("update emptab sal=30000 where eno>1001");
			System.out.println("No. of rows updated = "+norows);

			System.out.println("Press a key to continue...");
			System.in.read();

			norows = stmt.executeUpdate("delete emptab where eno<800");
			System.out.println("no of rows deleted = " + norows);

			con.close();
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}