package day53_inheritance.tesla;

public class CarObjects {

    public static void main(String[] args) {
        ElectricCar ec1 = new ElectricCar("Tesla","Model Y",48190.0, 2021, 326);
        ec1.drive(50);
        System.out.println(ec1);
        //System.out.println(ec1.make); error because make is private in ElectricCar class. It needs to be public(more visible)
        //System.out.println(ElectricCar.make); error as make is NOT STATIC in ElectricCar class.
        // static method can see only static instances or methods

        // we can access the private instances only via getter methods
        System.out.println("ect1 make = " + ec1.getMake());
        System.out.println("ec1 model = " + ec1.getModel());
        System.out.println("ec1 price = " + ec1.getPrice());
        System.out.println("ec1 year = " + ec1.getYear());
        System.out.println("ec1 range = " + ec1.getRange());
        System.out.println("ec1 count = " + ElectricCar.getCount());

        if(ec1.getPrice() > 10000){
            System.out.println(ec1.getMake() + " - " + ec1.getModel() + " is out of budget.");
        }else{
            System.out.println("purchasing " + ec1.toString());
        }
    }
}
