
package bankingsystemtest;

/**
 *
 * @author Izere Young Israel
 */
public class SavingsAccount extends Account{
    private float withdrawRestriction;
    public SavingsAccount(){
        
    }
    public SavingsAccount(int accountNo, String name, int id, int pin, float balance, float annuallInterestRate, float withdrawRestriction){
        super(accountNo,name,id,pin,balance,annuallInterestRate);
        this.withdrawRestriction = withdrawRestriction;
    }

    public void setWithdrawRestriction(float withdrawRestriction) {
        this.withdrawRestriction = withdrawRestriction;
    }
     
    public float getWithdrawRestriction() {
        return withdrawRestriction;
    }

    
       @Override
    public float withdraw(float withdrawRestriction){
        return super.withdraw(withdrawRestriction)-super.withdraw(withdrawRestriction)*getWithdrawRestriction();
    }
    
}
