package Tasks.Classes_Objects;

/*
Create a class Candy [Parent class]

    * instance variables:
        - brand (String), quantity (int), contains peanuts (boolean),

    * static variables:
        - number of total candy (int)

    * constructor to set all variables
        - Also increments total candy every time an object is made

    * encapsulate
        - Add one set of logic for quantity [ given number cannot be less than 0, otherwise it is not assigned]

    * override toString
 */
public class Candy {
    String brand;
    int quantity;
    boolean hasPeanuts;
    static int totalCandy = 1;

    public Candy(String brand, int quantity, boolean hasPeanuts, int totalCandy){
        this.brand = brand;
        this.quantity = quantity;
        this.hasPeanuts = hasPeanuts;
        totalCandy++;
    }

    public int getQuantity() {
        if(quantity >0){
            return totalCandy;
        }else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }
}
