
package bankingsystemtest;

import java.util.Date;

/**
 *
 * @author Izere Young Israel
 */
public class Account {
    private int accountNo;
    private String name;
    private int id;
    private int pin;
    private float balance;
    private float annuallInterestRate;
    private Date dateCreated = new Date();
    public Account(){
        this.accountNo = accountNo;
        this.name = name;
        this.pin = pin;
        this.annuallInterestRate = annuallInterestRate;
        this.id =id;
        this.balance = balance;
    }
    public Account(int accountNo, String name, int id, int pin, float balance, float annuallInterestRate){
        this.accountNo = accountNo;
        this.name = name;
        this.pin = pin;
        this.annuallInterestRate = annuallInterestRate;
        this.id =id;
        this.balance = balance;
    
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
    
    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setAnnuallInterestRate(float annuallInterestRate) {
        this.annuallInterestRate = annuallInterestRate;
    }

    public int getId() {
        return id;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public String getName() {
        return name;
    }

    public int getPin() {
        return pin;
    }

    public float getBalance() {
        return balance;
    }
    
    
   
    

    public double getAnnuallInterestRate() {
        return annuallInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    
    public float withdraw(float amountwith){
        return amountwith;
    }
    public float deposity(float amountdepo){
        return amountdepo;
    }
    public float getBalance(float withAm, float depAm ) {
        return getBalance() - withdraw(withAm) + deposity(depAm);
    }
   
    
      
}
