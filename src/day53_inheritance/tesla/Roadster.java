package day53_inheritance.tesla;

public class Roadster extends ElectricCar{

    //Roadster r = new Roadster("Roadster", 200000, 2022, 620);

    public Roadster(String make, String model, double price, int year, int range) { // we have to create this constructor to match with super()
        super("Tesla", model, price, year, range); // super() has to be the first statement in the constructor
        System.out.println("Welcome new Roadster");
    }
}
