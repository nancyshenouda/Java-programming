package day61_exceptions_collections;

public class CustomExceptionTest {
    public static void main(String[] args) {
        int minutes = 80;
        System.out.println("CLass is going on for " + minutes + " minutes");
        if(minutes > 50){
            //throw new BreakTimeException();
            throw new BreakTimeException("It is break time");
        }
        System.out.println("Lets continue the class");

        double balance = 400;
        double itemPrice = 600;

        if(itemPrice>balance){
            throw new InsufficientBalanceException("Transaction declined, not enough funds");
        }else{
            System.out.println("Item successfully purchased");
        }
    }
}
