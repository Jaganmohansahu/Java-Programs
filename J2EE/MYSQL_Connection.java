import java.sql.Connection;
import java.sql.DriverManager;

public class MYSQL_Connection {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lit", "root", "tiger");
        
        if(con != null)
        {
            System.out.println("Connected with MYSQL database using TYPE-4");
            System.out.println(con);
        }
    }
}