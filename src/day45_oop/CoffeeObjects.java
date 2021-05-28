package day45_oop;

public class CoffeeObjects {
    public static void main(String[] args) {
        Coffee myCoffee = new Coffee();
        // here we are using the methods to access the variables
        System.out.println("Coffee amount = " + myCoffee.getAmount());

        myCoffee.reFill();
        System.out.println("Amount after refill = " + myCoffee.getAmount());

        myCoffee.drink(10);
        System.out.println("Amount after drinking 10% = " + myCoffee.getAmount());


        myCoffee.setType("Turkish Coffee");
        System.out.println("My coffee type is " +myCoffee.getType());
        // toString method is describing and showing all the variable values
        System.out.println(myCoffee.toString());


        Coffee latte = new Coffee();
        latte.setType("Latte");
        System.out.println("Other coffee type is = " + latte.getType());

        System.out.println("Latte Amount = " + latte.getAmount());
       latte.reFill();
        System.out.println("Latte amount after refill = " + latte.getAmount());
        latte.drink(20);
        System.out.println("Latte amount after drinking 20% = " + latte.getAmount());
    }

}
