package Tasks.constructors;

public class CreditCard {
    long cardNumber;
    double balance;
    double apr;
    boolean cashBack;

    public CreditCard(long cardNumber,
                      double balance,
                      double apr,
                      boolean cashBack){
        this. cardNumber = cardNumber;
        this.balance = balance;
        this.apr = apr;
        this.cashBack=cashBack;
    }

    public void useCard(){

    }
    public void payBalance(double balance){


    }
}
