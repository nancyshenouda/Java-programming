package Tasks.Classes_Objects;

/*
Create a class Twix [Child class]

    * Inherits Candy class

    * constructor that invokes the parent constructor

    * extra: static hiding, final, sub class
 */
public class Twix extends Candy{

    public Twix(String brand, int quantity, boolean hasPeanuts, int totalCandy) {
        super(brand, quantity, hasPeanuts, totalCandy);
    }
}
