package Tasks.Classes_Objects;

/*
Create a class Take5 [Child class]

    * Inherits Candy class

    * constructor that invokes the parent constructor

    * extra: static hiding, final
 */
public class Take5 extends Candy{

    public Take5(String brand, int quantity, boolean hasPeanuts, int totalCandy) {
        super(brand, quantity, hasPeanuts, totalCandy);
    }
}
