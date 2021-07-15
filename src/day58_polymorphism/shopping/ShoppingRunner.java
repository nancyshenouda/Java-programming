package day58_polymorphism.shopping;

public class ShoppingRunner {
    public static void main(String[] args) {

        OnlineShopping online = new Amazon();
        online.buy();
        online.sell();
        online.ship();
        ((Amazon)online).primeShipping(); // down casting

        Amazon amazon = new Amazon(); // not polymorphic
        amazon.buy();
        amazon.sell();
        amazon.ship();
        amazon.primeShipping();

        OnlineShopping etsy = new Etsy();
        etsy.buy();
        etsy.sell();
        etsy.ship();  // upCasting (implicit)
        ((Etsy)etsy).makeAndSellFromHome(); // down casting  (Explicit)



    }
}
