package day08_casting_scanner;

public class ShoppingBalanceCalculator {
    public static void main(String [] args){
        double balance=345.55;
        double price1=20.88;
        double price2=89.99;
        double price3=15;
        double remainingBalance=(balance-(price1+price2+price3));

        int balanceWithNoCents=(int)remainingBalance;//casting is changing or converting double to a smaller portion int
        System.out.println("My initial balance is $"+ balance + " I bought stuff with $" + price1 + " and $"
                 + price2 + " and $" + price3 +". Now my remaining balance is $"+ balanceWithNoCents +".");

    }
}
