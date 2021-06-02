package day49_static;

public class BankAccountTest {
    public static void main(String[] args) {

        BankAccount husband = new BankAccount();
        husband.user = "Fady";

        husband.showBalance();
        husband.spend(300);
        husband.showBalance();

        BankAccount wife = new BankAccount();

        wife.user = "Nancy";
        wife.showBalance(); // because the balance variable is static( one copy), both objects husband and wife are sharing it
        wife.spend(100);
        wife.showBalance();

        husband.showBalance();
        //System.out.println(BankAccount.balance);
    }
}
