
package bankingsystemtest;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
//import java.util.Scanner;

/**
 *
 * @author Izere Young Israel
 */
public class BankingSystemTest extends Application {
    
    static int in;
    static float inA;
    static float inT;
    static int inAc;
   
    
 
    @Override
    public void start(Stage primaryStage) {
        GridPane gp = new GridPane();
        gp.setAlignment(Pos.BASELINE_LEFT);
        gp.setPadding(new Insets(11,12,23,14));
        gp.setHgap(20);
        gp.setVgap(20);  
        Label title = new Label();
        gp.add(title, 2, 0);
        title.setText("Izere Banking");
        title.setTextFill(Color.web("#808080"));
        title.setFont(new Font("Cambria", 30));
        Label enterPin = new Label();
        gp.add(enterPin, 1, 2);
        enterPin.setText("Enter Your PIN:");
        enterPin.setTextFill(Color.web("#808080"));
        enterPin.setFont(new Font("Cambria", 20));
         
        gp.setStyle("-fx-background-color:white;"+
                    "-fx-font-size:20px"                  
                    );        
        TextField tfPin = new TextField();
        gp.add(tfPin, 2, 2);
        
        
        AccountDbGetter.tfAccountNo = new Label(); 
        gp.add(AccountDbGetter.tfAccountNo, 2, 3);  
        
        AccountDbGetter.tfName= new Label();         
        gp.add(AccountDbGetter.tfName, 2, 4);
        
        AccountDbGetter.tfId= new Label();
        gp.add(AccountDbGetter.tfId, 2,5);
        
        AccountDbGetter.tfInterestRate= new Label(); 
        gp.add(AccountDbGetter.tfInterestRate, 2, 6);  
        
        
        AccountDbGetter.tfBalance= new Label(); 
        gp.add(AccountDbGetter.tfBalance, 2, 7);
        
        AccountDbGetter.tfDate = new Label();
        gp.add(AccountDbGetter.tfDate, 2, 8);
    
        
        Button okButton = new Button("ENTER");
        
        gp.add(okButton, 5, 2);
     
        okButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e){
                             in= Integer.parseInt(tfPin.getText());
              
                 AccountDbGetter.getQueryResult(in);  
                 Button okButton1= new Button("CONFIRM");
                 gp.add(okButton1, 4, 8);
                 okButton1.setOnAction(new EventHandler<ActionEvent>(){
                     
                 @Override
                         public void handle(ActionEvent e){
                             
                         
             GridPane gp2 = new GridPane();
             gp2.setAlignment(Pos.BASELINE_LEFT);
             gp2.setPadding(new Insets(11,12,23,14));
             gp2.setHgap(20);
             gp2.setVgap(20);
             Label title = new Label();
             gp2.add(title, 3, 0);
             title.setText("Izere Banking");
             title.setTextFill(Color.web("#808080"));
             title.setFont(new Font("Cambria", 30));
             gp2.setStyle("-fx-background-color:white;"+
                    "-fx-font-size:20px"                  
                    );  
             Button okButton2 = new Button("Checking Account");
             gp2.add(okButton2, 3, 3);
             Button okButton3 = new Button("Savings Account");
             gp2.add(okButton3, 3, 4);
            
             
             okButton2.setOnAction(new EventHandler<ActionEvent>(){
                 
             
                     

                     @Override
                     public void handle(ActionEvent e) {
                         GridPane gp3= new GridPane();
                         gp3.setAlignment(Pos.BASELINE_LEFT);
                         gp3.setPadding(new Insets(11,12,23,14));
                         gp3.setHgap(20);
                         gp3.setVgap(20);
                         Label title = new Label();
                         gp3.add(title, 3, 0);
                         title.setText("Izere Banking");
                         title.setTextFill(Color.web("#808080"));
                         title.setFont(new Font("Cambria", 30));
                         gp3.setStyle("-fx-background-color:white;"+
                                     "-fx-font-size:20px"                  
                            );  
                         
                         Button okButtonA = new Button("Withdraw");
                         gp3.add(okButtonA, 3, 3);
                         
                         okButtonA.setOnAction(new EventHandler<ActionEvent>(){
                         @Override
                         public void handle(ActionEvent e) {
                             GridPane gp5= new GridPane();
                             gp5.setAlignment(Pos.BASELINE_LEFT);
                             gp5.setPadding(new Insets(11,12,23,14));
                             gp5.setHgap(20);
                             gp5.setVgap(20);
                             Label title = new Label();
                             gp5.add(title, 3, 0);
                             title.setText("Izere Banking");
                             title.setTextFill(Color.web("#808080"));
                             title.setFont(new Font("Cambria", 30));
                             gp5.setStyle("-fx-background-color:white;"+
                                     "-fx-font-size:20px"                  
                            ); 
                             Label amount = new Label();
                             amount.setText("Enter Amount:");
                             amount.setTextFill(Color.web("#808080"));
                             gp5.add(amount, 3, 3);
                             TextField inAmount = new TextField();
                             gp5.add(inAmount, 4, 3);
                             Button but = new Button("OK");
                             gp5.add(but, 5, 3);
                             but.setOnAction(new EventHandler<ActionEvent>(){
                              @Override
                              public void handle(ActionEvent e) {
                                  inA = Float.parseFloat(inAmount.getText());
                             Account obj = new Account();
                             
                             obj.setBalance(AccountDbGetter.accountBalance);
                             obj.withdraw(inA);
                             AccountDbSetter.getUserQuery(obj.getBalance(inA, 0),in);
                             Label display1 = new Label();
                             display1.setText("Withdrawn Amount: "+obj.withdraw(inA));
                             display1.setTextFill(Color.web("#808080"));
                             gp5.add(display1, 3, 4);
                             Label display2 = new Label();
                             display2.setText("Available Balance: "+obj.getBalance(inA, 0));
                             display2.setTextFill(Color.web("#808080"));
                             gp5.add(display2, 3, 5);
                             
                              }
                             }
                             );
                             
                           Scene scene3= new Scene(gp5,850,650);
             
                         primaryStage.setScene(scene3);
                         scene3.getStylesheets().add
                          (BankingSystemTest.class.getResource("BankingSystemTest.css").toExternalForm());
                         primaryStage.show();
                         }
                         }
                         );
                         
             

                         Button okButtonB = new Button("Deposit");
                         gp3.add(okButtonB, 3, 4);
                         okButtonB.setOnAction(new EventHandler<ActionEvent>(){
                         @Override
                         public void handle(ActionEvent e) {
                             GridPane gp6= new GridPane();
                             gp6.setAlignment(Pos.BASELINE_LEFT);
                             gp6.setPadding(new Insets(11,12,23,14));
                             gp6.setHgap(20);
                             gp6.setVgap(20);
                             Label title = new Label();
                             gp6.add(title, 3, 0);
                             title.setText("Izere Banking");
                             title.setTextFill(Color.web("#808080"));
                             title.setFont(new Font("Cambria", 30));
                             gp6.setStyle("-fx-background-color:white;"+
                                     "-fx-font-size:20px"                  
                            ); 
                             Label amount = new Label();
                             amount.setText("Enter Amount:");
                             amount.setTextFill(Color.web("#808080"));
                             gp6.add(amount, 3, 3);
                             TextField inAmount = new TextField();
                             gp6.add(inAmount, 4, 3);
                             Button but = new Button("OK");
                             gp6.add(but, 5, 3);
                             but.setOnAction(new EventHandler<ActionEvent>(){
                              @Override
                              public void handle(ActionEvent e) {
                                  inA = Float.parseFloat(inAmount.getText());
                             Account obj = new Account();
                             
                             obj.setBalance(AccountDbGetter.accountBalance);
                             obj.deposity(inA);
                             AccountDbSetter.getUserQuery(obj.getBalance(0, inA),in);
                             Label display1 = new Label();
                             display1.setText("Deposit Amount: "+obj.deposity(inA));
                             display1.setTextFill(Color.web("#808080"));
                             gp6.add(display1, 3, 4);
                             Label display2 = new Label();
                             display2.setText("Available Balance: "+obj.getBalance(0, inA));
                             display2.setTextFill(Color.web("#808080"));
                             gp6.add(display2, 3, 5);
                             
                              }
                             }
                             );
                             
                           Scene scene3= new Scene(gp6,850,650);
             
                         primaryStage.setScene(scene3);
                         scene3.getStylesheets().add
                          (BankingSystemTest.class.getResource("BankingSystemTest.css").toExternalForm());
                         primaryStage.show();
                         }
                         }
                         );
                         Button okButtonC = new Button("Balance Inquiry");
                         gp3.add(okButtonC, 3, 5);
                         okButtonC.setOnAction(new EventHandler<ActionEvent>(){
                         @Override
                         public void handle(ActionEvent e) {
                             GridPane gp7= new GridPane();
                             gp7.setAlignment(Pos.BASELINE_LEFT);
                             gp7.setPadding(new Insets(11,12,23,14));
                             gp7.setHgap(20);
                             gp7.setVgap(20);
                             Label title = new Label();
                             gp7.add(title, 3, 0);
                             title.setText("Izere Banking");
                             title.setTextFill(Color.web("#808080"));
                             title.setFont(new Font("Cambria", 30));
                             gp7.setStyle("-fx-background-color:white;"+
                                     "-fx-font-size:20px"                  
                            ); 
                            
                             
                             
                            
                            
                             AccountDbGetter.tfAccountNo = new Label(); 
                             gp7.add(AccountDbGetter.tfAccountNo, 3, 3);  
                             
                             AccountDbGetter.tfAccountNo.setText("Account Number: "+AccountDbGetter.accountAccountNo);
                             AccountDbGetter.tfAccountNo.setTextFill(Color.web("#808080"));
        
                             AccountDbGetter.tfName= new Label();         
                             gp7.add(AccountDbGetter.tfName, 3, 4);
                             
                             AccountDbGetter.tfName.setText("Name: "+AccountDbGetter.accountName);
                             AccountDbGetter.tfName.setTextFill(Color.web("#808080"));

        
                             AccountDbGetter.tfId= new Label();
                             gp7.add(AccountDbGetter.tfId, 3,5);
                             
                             AccountDbGetter.tfId.setText("ID: "+AccountDbGetter.accountId);
                             AccountDbGetter.tfId.setTextFill(Color.web("#808080"));
        
                             AccountDbGetter.tfInterestRate= new Label(); 
                             gp7.add(AccountDbGetter.tfInterestRate, 3, 6);  
                               
                             AccountDbGetter.tfInterestRate.setText("Interest Rate: "+AccountDbGetter.accountInterestRate);
                             AccountDbGetter.tfInterestRate.setTextFill(Color.web("#808080"));

        
                             AccountDbGetter.tfBalance= new Label(); 
                             gp7.add(AccountDbGetter.tfBalance, 3, 7);
                             
                             AccountDbGetter.tfBalance.setText("Balance: "+AccountDbGetter.accountBalance);
                             AccountDbGetter.tfBalance.setTextFill(Color.web("#808080"));
        
                             AccountDbGetter.tfDate = new Label();
                             gp7.add(AccountDbGetter.tfDate, 3, 8);
                             
                             Account ob = new Account();
            
                             AccountDbGetter.tfDate.setText("Date: "+ob.getDateCreated());
                             AccountDbGetter.tfDate.setTextFill(Color.web("#808080"));

                             Scene scene3= new Scene(gp7,850,650);
             
                             primaryStage.setScene(scene3);
                             scene3.getStylesheets().add
                            (BankingSystemTest.class.getResource("BankingSystemTest.css").toExternalForm());
                            primaryStage.show();
                               }
                         }
                         );
                         
                         Button okButtonD = new Button("Transfer");
                         gp3.add(okButtonD, 3, 6);
                         
                         okButtonD.setOnAction(new EventHandler<ActionEvent>(){
                         @Override
                         public void handle(ActionEvent e) {
                             GridPane gp8= new GridPane();
                             gp8.setAlignment(Pos.BASELINE_LEFT);
                             gp8.setPadding(new Insets(11,12,23,14));
                             gp8.setHgap(20);
                             gp8.setVgap(20);
                             Label title = new Label();
                             gp8.add(title, 3, 0);
                             title.setText("Izere Banking");
                             title.setTextFill(Color.web("#808080"));
                             title.setFont(new Font("Cambria", 30));
                             gp8.setStyle("-fx-background-color:white;"+
                                     "-fx-font-size:20px"                  
                            ); 
                             Label amt = new Label();
                             amt.setText("Enter Amount:");
                             amt.setTextFill(Color.web("#808080"));
                             gp8.add(amt, 3, 3);
                             TextField amountIn = new TextField();
                             gp8.add(amountIn, 4, 3);
                             
                             Label accNo= new Label();
                             accNo.setText("Account Number:");
                             accNo.setTextFill(Color.web("#808080"));
                             gp8.add(accNo, 3, 4);
                             TextField inAcc = new TextField();
                             gp8.add(inAcc, 4, 4);

                             Button butt = new Button("OK");
                             gp8.add(butt, 4, 5);
                             butt.setOnAction(new EventHandler<ActionEvent>(){
                              @Override
                              public void handle(ActionEvent e) {
                                  inT= Float.parseFloat(amountIn.getText());
                                  inAc= Integer.parseInt(inAcc.getText());
                             CheckingAccount obj = new CheckingAccount();
                             
                             obj.setTransfer(inT);
                             obj.getTransfer();
                             obj.setPayment(0);
                             obj.getPayment();
                             
                             
                             Account ob = new Account();
                             ob.withdraw(0);
                             ob.deposity(0);
                             ob.setBalance(AccountDbGetter.accountBalance);
                             ob.getBalance();
                             ob.getBalance(0, 0);
                             
                             AccountDbSetter.getUserQuery(obj.getBalance(AccountDbGetter.accountBalance, 0,inT), in);
                           
                             TransfersDbSetter.getUserQuery(obj.getBalance(TransferDbGetter.accountBalance, inT), inAc);
                             TransferTableSetter.getUserQuery(inT, AccountDbGetter.accountAccountNo, inAc);
                             Label dis1 = new Label();
                             dis1.setText("Transfered Amount: "+obj.getTransfer());
                             dis1.setTextFill(Color.web("#808080"));
                             gp8.add(dis1, 3, 6);
                             Label dis2 = new Label();
                             dis2.setText("Available Balance: "+obj.getBalance(AccountDbGetter.accountBalance, 0,inT));
                             dis2.setTextFill(Color.web("#808080"));
                             gp8.add(dis2, 3, 7);
                             
                              }
                             }
                             );
                             
                           Scene scene3= new Scene(gp8,850,650);
             
                         primaryStage.setScene(scene3);
                         scene3.getStylesheets().add
                          (BankingSystemTest.class.getResource("BankingSystemTest.css").toExternalForm());
                         primaryStage.show();
                         }
                         }
                         );
                         Button okButtonE = new Button("Payment");
                         gp3.add(okButtonE, 3, 7);
                         okButtonE.setOnAction(new EventHandler<ActionEvent>(){
                         @Override
                         public void handle(ActionEvent e) {
                             GridPane gp10= new GridPane();
                             gp10.setAlignment(Pos.BASELINE_LEFT);
                             gp10.setPadding(new Insets(11,12,23,14));
                             gp10.setHgap(20);
                             gp10.setVgap(20);
                             Label title = new Label();
                             gp10.add(title, 3, 0);
                             title.setText("Izere Banking");
                             title.setTextFill(Color.web("#808080"));
                             title.setFont(new Font("Cambria", 30));
                             gp10.setStyle("-fx-background-color:white;"+
                                     "-fx-font-size:20px"                  
                            ); 
                             Label amt = new Label();
                             amt.setText("Enter Amount:");
                             amt.setTextFill(Color.web("#808080"));
                             gp10.add(amt, 3, 3);
                             TextField amountIn = new TextField();
                             gp10.add(amountIn, 4, 3);
                             
                             Label accNo= new Label();
                             accNo.setText("Account Number:");
                             accNo.setTextFill(Color.web("#808080"));
                             gp10.add(accNo, 3, 4);
                             TextField inAcc = new TextField();
                             gp10.add(inAcc, 4, 4);

                             Button butt = new Button("OK");
                             gp10.add(butt, 4, 5);
                             butt.setOnAction(new EventHandler<ActionEvent>(){
                              @Override
                              public void handle(ActionEvent e) {
                                  inT= Float.parseFloat(amountIn.getText());
                                  inAc= Integer.parseInt(inAcc.getText());
                             CheckingAccount obj = new CheckingAccount();
                             
                             obj.setTransfer(inT);
                             obj.getTransfer();
                             obj.setPayment(0);
                             obj.getPayment();
                             
                             
                             SavingsAccount ob = new SavingsAccount();
                             ob.withdraw(0);
                             ob.deposity(0);
                             ob.setBalance(AccountDbGetter.accountBalance);
                             ob.getBalance();
                             ob.getBalance(0, 0);
                             
                             AccountDbSetter.getUserQuery(obj.getBalance(AccountDbGetter.accountBalance, 0,inT), in);
                             
                             TransfersDbSetter.getUserQuery(obj.getBalance(TransferDbGetter.accountBalance, inT), inAc);
                             PaymentTableSetter.getUserQuery(AccountDbGetter.accountAccountNo, inAc, inT);
                             Label dis1 = new Label();
                             dis1.setText("Payed Amount: "+obj.getTransfer());
                             dis1.setTextFill(Color.web("#808080"));
                             gp10.add(dis1, 3, 6);
                             Label dis2 = new Label();
                             dis2.setText("Available Balance: "+obj.getBalance(AccountDbGetter.accountBalance, 0,inT));
                             dis2.setTextFill(Color.web("#808080"));
                             gp10.add(dis2, 3, 7);
                             
                              }
                             }
                             );
                             
                           Scene scene3= new Scene(gp10,850,650);
             
                         primaryStage.setScene(scene3);
                         scene3.getStylesheets().add
                          (BankingSystemTest.class.getResource("BankingSystemTest.css").toExternalForm());
                         primaryStage.show();
                         }
                         }
                         );

                         Button previousButton = new Button("Previous");
                         gp3.add(previousButton, 3, 8);
                         
                         Scene scene2= new Scene(gp3,850,650);
             
                         primaryStage.setScene(scene2);
                         scene2.getStylesheets().add
                          (BankingSystemTest.class.getResource("BankingSystemTest.css").toExternalForm());
                         primaryStage.show();
             
                         
                            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                     }
                   }
                 );
                         

             
             okButton3.setOnAction(new EventHandler<ActionEvent>(){
                 
             
                     

                     @Override
                     public void handle(ActionEvent e) {
                         GridPane gp4 = new GridPane();
                         gp4.setAlignment(Pos.BASELINE_LEFT);
                         gp4.setPadding(new Insets(11,12,23,14));
                         gp4.setHgap(20);
                         gp4.setVgap(20);
                         Label title = new Label();
                         gp4.add(title, 3, 0);
                         title.setText("Izere Banking");
                         title.setTextFill(Color.web("#808080"));
                         title.setFont(new Font("Cambria", 30));
                         gp4.setStyle("-fx-background-color:white;"+
                           "-fx-font-size:20px"                  
                                   );  
                         Button okButtonA = new Button("Deposit");
                         gp4.add(okButtonA, 3, 3);
                          okButtonA.setOnAction(new EventHandler<ActionEvent>(){
                         @Override
                         public void handle(ActionEvent e) {
                             GridPane gp9= new GridPane();
                             gp9.setAlignment(Pos.BASELINE_LEFT);
                             gp9.setPadding(new Insets(11,12,23,14));
                             gp9.setHgap(20);
                             gp9.setVgap(20);
                             Label title = new Label();
                             gp9.add(title, 3, 0);
                             title.setText("Izere Banking");
                             title.setTextFill(Color.web("#808080"));
                             title.setFont(new Font("Cambria", 30));
                             gp9.setStyle("-fx-background-color:white;"+
                                     "-fx-font-size:20px"                  
                            ); 
                             Label amount = new Label();
                             amount.setText("Enter Amount:");
                             amount.setTextFill(Color.web("#808080"));
                             gp9.add(amount, 3, 3);
                             TextField inAmount = new TextField();
                             gp9.add(inAmount, 4, 3);
                             Button b = new Button("OK");
                             gp9.add(b, 5, 3);
                             b.setOnAction(new EventHandler<ActionEvent>(){
                              @Override
                              public void handle(ActionEvent e) {
                                  inA = Float.parseFloat(inAmount.getText());
                             Account obj = new Account();
                             
                             obj.setBalance(AccountDbGetter.accountBalance);
                             obj.deposity(inA);
                             AccountDbSetter.getUserQuery(obj.getBalance(0, inA),in);
                             Label display1 = new Label();
                             display1.setText("Deposit Amount: "+obj.deposity(inA));
                             display1.setTextFill(Color.web("#808080"));
                             gp9.add(display1, 3, 4);
                             Label display2 = new Label();
                             display2.setText("Available Balance: "+obj.getBalance(0, inA));
                             display2.setTextFill(Color.web("#808080"));
                             gp9.add(display2, 3, 5);
                             
                              }
                             }
                             );
                             
                           Scene scene3= new Scene(gp9,850,650);
             
                         primaryStage.setScene(scene3);
                         scene3.getStylesheets().add
                          (BankingSystemTest.class.getResource("BankingSystemTest.css").toExternalForm());
                         primaryStage.show();
                         }
                         }
                         );
                         
                         Button okButtonB = new Button("Withdraw");
                         gp4.add(okButtonB, 3, 4);
                                                  
                         okButtonB.setOnAction(new EventHandler<ActionEvent>(){
                         @Override
                         public void handle(ActionEvent e) {
                             GridPane gp5= new GridPane();
                             gp5.setAlignment(Pos.BASELINE_LEFT);
                             gp5.setPadding(new Insets(11,12,23,14));
                             gp5.setHgap(20);
                             gp5.setVgap(20);
                             Label title = new Label();
                             gp5.add(title, 3, 0);
                             title.setText("Izere Banking");
                             title.setTextFill(Color.web("#808080"));
                             title.setFont(new Font("Cambria", 30));
                             gp5.setStyle("-fx-background-color:white;"+
                                     "-fx-font-size:20px"                  
                            ); 
                             Label amount = new Label();
                             amount.setText("Enter Amount:");
                             amount.setTextFill(Color.web("#808080"));
                             gp5.add(amount, 3, 3);
                             TextField inAmount = new TextField();
                             gp5.add(inAmount, 4, 3);
                             Button but = new Button("OK");
                             gp5.add(but, 5, 3);
                             but.setOnAction(new EventHandler<ActionEvent>(){
                              @Override
                              public void handle(ActionEvent e) {
                                  inA = Float.parseFloat(inAmount.getText());
                             SavingsAccount obj = new SavingsAccount();
                             
                             obj.setBalance(AccountDbGetter.accountBalance);
                             obj.withdraw(inA);
                             AccountDbSetter.getUserQuery(obj.getBalance(inA, 0),in);
                             Label display1 = new Label();
                             display1.setText("Withdrawn Amount: "+obj.withdraw(inA));
                             display1.setTextFill(Color.web("#808080"));
                             gp5.add(display1, 3, 4);
                             Label display2 = new Label();
                             display2.setText("Available Balance: "+obj.getBalance(inA, 0));
                             display2.setTextFill(Color.web("#808080"));
                             gp5.add(display2, 3, 5);
                             
                              }
                             }
                             );
                             
                           Scene scene3= new Scene(gp5,850,650);
             
                         primaryStage.setScene(scene3);
                         scene3.getStylesheets().add
                          (BankingSystemTest.class.getResource("BankingSystemTest.css").toExternalForm());
                         primaryStage.show();
                         }
                         }
                         );
                         Button okButtonC = new Button("Check Balance");
                         gp4.add(okButtonC, 3, 5);
                         okButtonC.setOnAction(new EventHandler<ActionEvent>(){
                         @Override
                         public void handle(ActionEvent e) {
                             GridPane gp7= new GridPane();
                             gp7.setAlignment(Pos.BASELINE_LEFT);
                             gp7.setPadding(new Insets(11,12,23,14));
                             gp7.setHgap(20);
                             gp7.setVgap(20);
                             Label title = new Label();
                             gp7.add(title, 3, 0);
                             title.setText("Izere Banking");
                             title.setTextFill(Color.web("#808080"));
                             title.setFont(new Font("Cambria", 30));
                             gp7.setStyle("-fx-background-color:white;"+
                                     "-fx-font-size:20px"                  
                            ); 
                            
                             
                             
                            
                            
                             AccountDbGetter.tfAccountNo = new Label(); 
                             gp7.add(AccountDbGetter.tfAccountNo, 3, 3);  
                             
                             AccountDbGetter.tfAccountNo.setText("Account Number: "+AccountDbGetter.accountAccountNo);
                             AccountDbGetter.tfAccountNo.setTextFill(Color.web("#808080"));
        
                             AccountDbGetter.tfName= new Label();         
                             gp7.add(AccountDbGetter.tfName, 3, 4);
                             
                             AccountDbGetter.tfName.setText("Name: "+AccountDbGetter.accountName);
                             AccountDbGetter.tfName.setTextFill(Color.web("#808080"));

        
                             AccountDbGetter.tfId= new Label();
                             gp7.add(AccountDbGetter.tfId, 3,5);
                             
                             AccountDbGetter.tfId.setText("ID: "+AccountDbGetter.accountId);
                             AccountDbGetter.tfId.setTextFill(Color.web("#808080"));
        
                             AccountDbGetter.tfInterestRate= new Label(); 
                             gp7.add(AccountDbGetter.tfInterestRate, 3, 6);  
                               
                             AccountDbGetter.tfInterestRate.setText("Interest Rate: "+AccountDbGetter.accountInterestRate);
                             AccountDbGetter.tfInterestRate.setTextFill(Color.web("#808080"));

        
                             AccountDbGetter.tfBalance= new Label(); 
                             gp7.add(AccountDbGetter.tfBalance, 3, 7);
                             
                             AccountDbGetter.tfBalance.setText("Balance: "+AccountDbGetter.accountBalance);
                             AccountDbGetter.tfBalance.setTextFill(Color.web("#808080"));
        
                             AccountDbGetter.tfDate = new Label();
                             gp7.add(AccountDbGetter.tfDate, 3, 8);
                             
                             Account ob = new Account();
            
                             AccountDbGetter.tfDate.setText("Date: "+ob.getDateCreated());
                             AccountDbGetter.tfDate.setTextFill(Color.web("#808080"));

                             Scene scene3= new Scene(gp7,850,650);
             
                             primaryStage.setScene(scene3);
                             scene3.getStylesheets().add
                            (BankingSystemTest.class.getResource("BankingSystemTest.css").toExternalForm());
                            primaryStage.show();
                               }
                         }
                         );
                         
                         Button previousButton = new Button("Previous");
                         gp4.add(previousButton, 3, 6);
             
                         Scene scene2= new Scene(gp4,850,650);
             
                         primaryStage.setScene(scene2);
                         scene2.getStylesheets().add
                          (BankingSystemTest.class.getResource("BankingSystemTest.css").toExternalForm());
                         primaryStage.show();

                        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                     }
             }
             );
             
             Scene scene1= new Scene(gp2,850,650);
             
             primaryStage.setScene(scene1);
             scene1.getStylesheets().add
                (BankingSystemTest.class.getResource("BankingSystemTest.css").toExternalForm());
             primaryStage.show();
                             
                         
                 
                
            
                         }
                 }
                 );
                         }
        }
        );
        
            
                
        Scene scene = new Scene(gp, 850, 650);             
        primaryStage.setTitle("Izere Banking");
        primaryStage.setScene(scene);
        scene.getStylesheets().add
                (BankingSystemTest.class.getResource("BankingSystemTest.css").toExternalForm());
        primaryStage.show();
    }
    
    
    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) {
        launch(args);
        
    
    }    
}
