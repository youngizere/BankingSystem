
package bankingsystemtest;

/**
 *
 * @author Izere Young Israel
 */
public class CheckingAccount extends Account {
    private float payment;
    private float transfer;
    public CheckingAccount(){

        this.payment = payment;
        this.transfer = transfer;

    }
    public CheckingAccount(int accountNo, String name, int pin, int id, float balance, float annuallInterestRate, float payment, float transfer){
        super(accountNo,name, pin, id, balance, annuallInterestRate);
        this.payment = payment;
        this.transfer = transfer;
    }

    public void setPayment(float payment) {
        this.payment = payment;
    }

    public void setTransfer(float transfer) {
        this.transfer = transfer;
    }

    public float getPayment() {
        return payment;
    }

    public float getTransfer() {
        return transfer;
    }
   
    public float getBalance(float balance, float payment, float transfer){
        return balance- payment- transfer;
    }
    @Override
    public float getBalance(float balance, float receivedAm){
        return balance + receivedAm;
    }
}
