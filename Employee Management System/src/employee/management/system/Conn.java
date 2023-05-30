
package employee.management.system;
import java.sql.*;

/**
 *
 * @author arif049
 */
public class Conn {
    
    Connection c;
    Statement s;
    public Conn()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");// com/mysql/jdbc/Driver.class
            c=DriverManager.getConnection("jdbc:mysql:///employeemanagementsystem","root","Arif@049");
            s=c.createStatement();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
