package day49_static;

public class BankAccount {

    static double balance = 500;
    static String user;

    public static void spend(double amount){
        System.out.println(user + " is spending $" + amount);
        balance -= amount;
    }
    public static void showBalance(){

        System.out.println("Current balance = " + balance);
    }
}
