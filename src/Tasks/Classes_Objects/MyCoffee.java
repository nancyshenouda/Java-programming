package Tasks.Classes_Objects;

public class MyCoffee {
    public static void main(String[] args) {
        Coffee type1= new Coffee();
        type1.setType("Latte");
        System.out.println("My favourite is " + type1.getType());
        type1.amount = 100;

        type1.drink(10);
        System.out.println("drink after drinking 10% = " + type1.getAmount());
        type1.refill();

        System.out.println( "drink after refill " + type1.getAmount());
        type1.drink(50);
        System.out.println("drink after 50% = " + type1.getAmount());

        Coffee type2 = new Coffee();
        type2.setType("American");
        System.out.println("The other favourite type is = " + type2.getType());

        type2.amount = 80;
        type2.drink(20);
        System.out.println("American after drinking 20% = " + type2.getAmount());
        type2.refill();
        System.out.println("American after refill = " + type2.getAmount());




    }
}
