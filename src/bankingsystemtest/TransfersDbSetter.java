
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
public class TransfersDbSetter {
     static final String DB_URL = "jdbc:mysql://localhost/bankingsystem";
   static final String DB_DRV = "com.mysql.jdbc.Driver";
   static final String DB_USER = "root";
   static final String DB_PASSWD = "";  
 
 
public static void getUserQuery(float balance,int accountNo){
      Connection connection;
      Statement statement ;
      ResultSet resultSet;
      PreparedStatement ps;
      
      try{
         connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWD);
         statement = connection.createStatement();
         
         ps = connection.prepareStatement("UPDATE account SET balance = ? "+"WHERE accountNo =?");
        
         ps.setFloat(1, balance);
         ps.setInt(2, accountNo);
         ps.executeUpdate();
         ps.close();
           
                    
         

      }catch(SQLException ex){
          
          ex.getMessage();
          ex.printStackTrace();          
      }

}
}
