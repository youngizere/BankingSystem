
package bankingsystemtest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
/**
 *
 * @author Izere Young Israel
 */
public class AccountDbSetter {
    
      static final String DB_URL = "jdbc:mysql://localhost/bankingsystem";
   static final String DB_DRV = "com.mysql.jdbc.Driver";
   static final String DB_USER = "root";
   static final String DB_PASSWD = "";  
 
 
public static void getUserQuery(float balance,int pin){
      Connection connection;
      Statement statement ;
      ResultSet resultSet;
      PreparedStatement ps;
      
      try{
         connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWD);
         statement = connection.createStatement();
         
         ps = connection.prepareStatement("UPDATE account SET balance = ? "+"WHERE pin =?");
        
         ps.setFloat(1, balance);
         ps.setInt(2, pin);
         ps.executeUpdate();
         ps.close();
           
                    
         

      }catch(SQLException ex){
          
          ex.getMessage();
          ex.printStackTrace();          
      }

}
}
