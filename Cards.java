
/**
 * This class will be used to control credit or ATM cards.
 *
 * @Joe Diaz
 * @version 1.0(08-21-2017)
 */
public class Cards
{
    // instance variables - replace the example below with your own
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
     */
    public void depositMoney(float money)
    {
        balance=balance+money;
    }
    
    /**
     * this method withdraws money 
     */
    public void withdrawMoney(float money)
    {
        if(balance>=money)
        {
            balance=balance-money;
            System.out.println(balance);
        }
        else
            System.out.println("Your request exceeds current balance");
    }
    
    /**
     * this method checks the current balance 
     */
    public float checkBalance(float balance)
    {
        System.out.println(balance);
        return 0;
    }
}
