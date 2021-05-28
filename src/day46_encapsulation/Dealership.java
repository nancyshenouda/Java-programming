package day46_encapsulation;

public class Dealership {
    public static void main(String[] args) {

        Car car1 = new Car();
        //car1.model = "Nissan Altima";
        //System.out.println(car1.model);// cannot access the variable model as it is private

        car1.setModel("Nissan Altima");
        System.out.println("car 1 model = " + car1.getModel());// now we can access the model from inside the method

        car1.setYear(2020);
        System.out.println("car1 year = " + car1.getYear());

        car1.setMileage(65000);
        System.out.println("car 1 mileage = " + car1.getMileage());
        System.out.println(car1);
        System.out.println(car1.toString());

        Car car2 = new Car();
        car2.setModel("Alfa Romel");
        System.out.println("car 2 is " + car2.getModel());

        car2.setYear(2021);
        System.out.println("car 2 year = " + car2.getYear());

        car2.setMileage(21000);
        System.out.println("car 2 mileage = " + car2.getMileage());
        System.out.println(car2); // it is the same result as .toString
        System.out.println(car2.toString());
    }

}
