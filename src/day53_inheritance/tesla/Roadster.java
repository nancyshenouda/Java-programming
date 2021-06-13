package day53_inheritance.tesla;

public class Roadster extends ElectricCar{

    public Roadster(String make, String model, double price, int year, int range) { // we have to create this constructor to match with super()
        super("Tesla", model, price, year, range);
    }
}
