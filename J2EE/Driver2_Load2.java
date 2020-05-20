import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

public class Driver2_Load2 
{
    public static void main(String[] args) throws Exception
    {
        oracle.jdbc.pool.OracleDataSource d = new oracle.jdbc.pool.OracleDataSource();
        DriverManager.registerDriver(d);

        Enumeration e = DriverManager.getDrivers();
        if(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
    }
}
