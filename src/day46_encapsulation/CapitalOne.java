package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {

        CheckingAccount account1 = new CheckingAccount();
        account1.setAccountHolder("Nancy Shenouda");
        account1.setAccountNumber(123456789012l);
        account1.setAccountType("checking");
        account1.setBalance(12000.000);

        System.out.println(account1);
    }
}
