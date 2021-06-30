package day58_polymorphism;

public class Amazon extends OnlineShopping implements Prime{

    @Override
    public void buy() {
        System.out.println("Buying products from Amazom");
    }

    @Override
    public void sell() {
        System.out.println("Selling items on Amazon");
    }

    @Override
    public void ship() {
        System.out.println("Shipping from Amazon");
    }

    @Override
    public void primeShipping() {
        System.out.println("Free 2-days shipping for Prime users");
    }
}
