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
        System.out.println("ec1 count = " + ElectricCar.getCount()); // we will get 1

        if(ec1.getPrice() > 10000){
            System.out.println(ec1.getMake() + " - " + ec1.getModel() + " is out of budget.");
        }else{
            System.out.println("purchasing " + ec1.toString());
        }
        ElectricCar ec2 = new ElectricCar("Tesla","CyberTruck", 59900, 2022, 300);
        System.out.println(ec2.toString());
        System.out.println("ec2 count = " + ElectricCar.getCount());// static methods can be called  by className
        System.out.println(ec2.getCount()); // we can access static method by object name as well

        Roadster roadster = new Roadster("Tesla", "Roadster",  200000, 2022, 620);
        System.out.println(roadster.toString());
        System.out.println("roadster count = " + roadster.getCount());

        ModelX modelX = new ModelX("Tesla", "Model X", 89000, 2021,360 );
        System.out.println(modelX.toString());
        System.out.println("Model X count = " + modelX.getCount());// calling a static method

        modelX.drive(10);
        System.out.println("Having lunch...");
        modelX.drive(10);
        System.out.println("Remaining range = "+ modelX.getRange());



    }
}
