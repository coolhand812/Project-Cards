
/**
 * This class will be used to control credit or ATM cards.
 *
 * @Joe Diaz
 * @version 1.0(08-21-2017)
 */
public class Cards
{
    private float balance;

    /**
     * Constructor for objects of class Cards
     */
    public Cards()
    {
        // initialise instance variables
        balance = 0;
    }

    /**
     * this method deposits money
     * @money is the variable used to reflect the cash amount for deposit.
     */
    public void depositMoney(float money)
    {
        if(balance >= 0){
        balance = balance + money;
        }
    }
    
    /**
     * this method withdraws from account
     * @money represents the cash amount to be withdrawn.
     */
    public float withdrawMoney(float money)
    {
        if(balance>=money)
        {
            if(balance>0){
                balance=balance-money;
                System.out.println(balance);
            }
            else
            System.out.println("Your request exceeds current balance");
        }
        else
            System.out.println("Your request exceeds current balance");
        return balance;
    }
    
    /**
     * this method checks the current balance
     * @balance Is the current balance in the account.
     */
    public float checkBalance()
    {
        return balance;
    }
}
