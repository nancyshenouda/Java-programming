package day46_encapsulation;

public class CheckingAccount {
    private double balance;
    private long accountNumber;
    private String accountHolder;
    private String accountType = "checking";// default is checking

    public void setBalance(double balance) {

        this.balance = balance;
    }

    public void setAccountNumber(long accountNumber) {

        this.accountNumber = accountNumber;
    }

    public void setAccountHolder(String accountHolder) {

        this.accountHolder = accountHolder;
    }

    public void setAccountType(String accountType) {

        this.accountType = accountType;
    }

    public double getBalance() {

        return balance;
    }

    public long getAccountNumber() {

        return accountNumber;
    }

    public String getAccountHolder() {

        return accountHolder;
    }

    public String getAccountType() {
        return accountType;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "balance=" + balance +
                ", accountNumber=" + accountNumber +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountType='" + accountType + '\'' +
                '}';
    }
}
