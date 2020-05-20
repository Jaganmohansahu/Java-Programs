import java.sql.*;

class Type5_Connection
{
	public static void main(String[] args) {
		try
		{
			Class.forName("com.ddtek.jdbc.oracle.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:datadirect:oracle://localhost:1521;SID=xe", "system", "system");

			if(con != null)
			{
				System.out.println("Connected with Type-5 driver");
				System.out.println(con);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}