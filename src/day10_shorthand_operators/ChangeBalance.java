package day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance=1200.44;
        System.out.println("balance = " + balance);
        
        
        double baklava= 22.50;
        System.out.println("baklava = " + baklava);
        
        balance=balance-baklava;
        System.out.println("balance after baklava = " + balance);
        

        double knafa=44.5;
        System.out.println("knafa = " + knafa);
        balance=balance-knafa;
        System.out.println("Balance after knafa = " + balance);

        knafa=knafa/2;
        System.out.println("knafa = " + knafa);
        balance=balance-knafa;
        System.out.println("balance after second knafa = " + balance);
        
        double plate=7.99;
        System.out.println("plate = " + plate);
        balance=balance-plate;
        System.out.println("Balance after plate = " + balance);
        
        double iceTea=3;
        System.out.println("iceTea = " + iceTea);
        balance=balance-iceTea;
        System.out.println("balance after ice tea = " + balance);
        balance=balance-(iceTea*4);
        System.out.println("balance after 4 ice tea = " + balance);

        System.out.println("returning baklava = " + baklava);
        balance=balance+baklava;
        System.out.println("balance after returning baklava = " + balance);

        
        
    }
    
}
