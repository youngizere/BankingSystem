
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
public class PaymentTableSetter {
     static final String DB_URL = "jdbc:mysql://localhost/bankingsystem";
   static final String DB_DRV = "com.mysql.jdbc.Driver";
   static final String DB_USER = "root";
   static final String DB_PASSWD = "";  
 
 
public static void getUserQuery(int accountNo, int receiverNo, float payment){
      Connection connection;
      Statement statement ;
      ResultSet resultSet;
      PreparedStatement ps;
      
      try{
         connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWD);
         statement = connection.createStatement();
         
         ps = connection.prepareStatement("INSERT INTO payments VALUES(?,?,?)");
        
         
         ps.setInt(1, accountNo);
         ps.setInt(2, receiverNo);
         ps.setFloat(3, payment);
         ps.execute();
         ps.close();
           
                    
         

      }catch(SQLException ex){
          
          ex.getMessage();
          ex.printStackTrace();          
      }

}

}
