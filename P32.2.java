import java.sql.*;
class Insertion
{
	public static void main(String[] args) throws Exception
	{
		//register oracle driver
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

		//get a connection with the database
		Connection con;
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "tiger");

		//create a statement to insert a row with only eno value as 777
		Statement stmt = con.createStatement();
		int norows = stmt.executeUpdate("insert into emptab(eno) values(777)");
		System.out.println("No. of rows affected = "+norows);

		//insert a row with eno, ename and sal values
		norows = stmt.executeUpdate("insert into emptab values(779, 'satyaraj', 5000.00)");
		System.out.println("No. of rows affected = " + norows);

		//close connection
		con.close();
	}
}