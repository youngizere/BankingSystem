
package bankingsystemtest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

import javafx.scene.control.Label;
import javafx.scene.paint.Color;


/**
 *
 * @author Izere Young Israel
 */
public class TransferDbGetter {
    static final String DB_URL = "jdbc:mysql://localhost/bankingsystem";
   static final String DB_DRV = "com.mysql.jdbc.Driver";
   static final String DB_USER = "root";
   static final String DB_PASSWD = "";  
   static int accountAccountNo ;
   static String accountName;
   static int accountId ;
   static double accountInterestRate;
   static int accountPin;
   static float accountBalance;
  
   
   static Label tfAccountNo ;
   static Label tfName;
   static Label tfId;
   
   static Label tfInterestRate;
   static Label tfPin;
   static Label tfBalance;
   static Label tfDate;
     
   
   

   
   public static void getQueryResult(int accountNo) {
   
      Connection connection;
      Statement statement ;
      ResultSet resultSet;
      PreparedStatement ps;
      
      try{
         connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWD);
         statement = connection.createStatement();
        
         String myQuery = "SELECT * FROM account WHERE accountNo = ?";
         ps = connection.prepareStatement(myQuery);
         ps.setInt(1, accountNo);
         resultSet = ps.executeQuery();
           
         
             if(resultSet.next()){  
               
            accountAccountNo = resultSet.getInt(6);
            accountName = resultSet.getString(2);
            accountId = resultSet.getInt(1);
            
            accountInterestRate = resultSet.getDouble(4);
            accountPin= resultSet.getInt(5);
            accountBalance = resultSet.getFloat(3);
            
           
            tfAccountNo.setText("Account Number: "+AccountDbGetter.accountAccountNo);
            tfAccountNo.setTextFill(Color.web("#808080"));
            tfName.setText("Name: "+AccountDbGetter.accountName);
            tfName.setTextFill(Color.web("#808080"));
            tfId.setText("ID: "+AccountDbGetter.accountId);
            tfId.setTextFill(Color.web("#808080"));
            tfInterestRate.setText("Interest Rate: "+AccountDbGetter.accountInterestRate);
            tfInterestRate.setTextFill(Color.web("#808080"));
         
            tfBalance.setText("Balance: "+AccountDbGetter.accountBalance);
            tfBalance.setTextFill(Color.web("#808080"));
            
            Account ob = new Account();
            
            tfDate.setText("Date: "+ob.getDateCreated());
            tfDate.setTextFill(Color.web("#808080"));
            
      
           }
                      
         

      }catch(SQLException ex){
          
          ex.getMessage();
          ex.printStackTrace();          
      }
      
      
       
   }
}
