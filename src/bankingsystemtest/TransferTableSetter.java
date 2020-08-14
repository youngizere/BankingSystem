
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
public class TransferTableSetter {
    static final String DB_URL = "jdbc:mysql://localhost/bankingsystem";
   static final String DB_DRV = "com.mysql.jdbc.Driver";
   static final String DB_USER = "root";
   static final String DB_PASSWD = "";  
 
 
public static void getUserQuery(float transfer,int accountNo, int receiverNo){
      Connection connection;
      Statement statement ;
      ResultSet resultSet;
      PreparedStatement ps;
      
      try{
         connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWD);
         statement = connection.createStatement();
         
         ps = connection.prepareStatement("INSERT INTO transfers VALUES(?,?,?)");
        
         ps.setFloat(1, transfer);
         ps.setInt(2, accountNo);
         ps.setInt(3, receiverNo);
         ps.execute();
         ps.close();
           
                    
         

      }catch(SQLException ex){
          
          ex.getMessage();
          ex.printStackTrace();          
      }

}

    }
