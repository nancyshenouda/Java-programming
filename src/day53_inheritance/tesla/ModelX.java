package day53_inheritance.tesla;

public class ModelX extends ElectricCar{

    public ModelX(String make, String model, double price, int year, int range) {
        super(make, model, price, year, range);
        System.out.println("Welcome new Model X");

    }
    /**ERROR IN THE BELOW AS charge() METHOD is final (cannot be overridden) in the ElectricCar parent class
     *
     */
   // public void charge(){

   // }
}
