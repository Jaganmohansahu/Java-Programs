import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * Set JDK version 1.6 (64-bit)
 * Connect with ORACLE Database using Properties class
 */
public class Driver1_Connection3 
{
    public static void main(String[] args) throws Exception
    {
        Properties p = new Properties();
        p.load(new FileInputStream("db.properties"));
        
        Class.forName(p.getProperty("driver"));
        Connection con = DriverManager.getConnection(p.getProperty("url"), p);
        
        if(con != null)
        {
            System.out.println("Connected with ORACLE Database using Properties class");
            System.out.println(con);
        }
    }
}
