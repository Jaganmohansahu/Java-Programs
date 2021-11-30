//To retrive data from oracle database

import java.sql.*;
class OracleData
{
    public static void main(String[] args) throws Exception
    {
        //Register the driver
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

        //Establish connection with the database
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "tiger");

        //create a sql statement
        Statement stmt = con.createStatement();

        //Execute the statement
        ResultSet rs = stmt.executeQuery("select * from emptab");

        //all rows of emptab are in rs. Now retrive column data from rs and display
        while(rs.next()) 
        {
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getFloat(3));
            System.out.println("==================");
        }

        //close the connection 
        con.close();
    }
}