package day58_polymorphism.shopping;

public class Etsy extends OnlineShopping implements HandMade {

    @Override
    public void makeAndSellFromHome() {
        System.out.println("making and selling from home by Etsy");
    }

    @Override
    public void buy() {
        System.out.println("Buying items from Etsy");
    }

    @Override
    public void sell() {
        System.out.println("Selling items from Etsy");
    }

    @Override
    public void ship() {
        System.out.println("Shipping by Etsy");
    }
}
