import java.sql.DriverManager;
import java.util.Enumeration;

class Driver1_Load3
{
    public static void main(String[] args)  throws Exception
    {
        
        Enumeration e = DriverManager.getDrivers();
        while (e.hasMoreElements()) 
        {
            System.out.println(e.nextElement());           
        }
    }
}
