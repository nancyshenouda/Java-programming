package day58_polymorphism;

public abstract class OnlineShopping {

    public abstract void buy();


    public abstract void sell();


   public  void ship(){ // non-abstract methods are optionally to override or not
       System.out.println("Shipping the purchased items");
   }


}
