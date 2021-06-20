package day55_abstraction.exercise_example;

public class AtTheGym {
    public static void main(String[] args) {

        //Exercise exercise = new Exercise(); // cannot create object/instantiate abstract class
        Exercise exercise1 = new Running();
        Exercise exercise2 = new Swimming();
        Exercise exercise3 = new FreeWeight(); // we can have a variable type of an abstract class and the object can be any Sub class

        Running running = new Running();
        Swimming swimming = new Swimming();
        Lifting lifting = new FreeWeight(); // this is Polymorphism

        exercise1.start();
        exercise1.perform();
        System.out.println("Running 30 minutes - calories = " + exercise1.getCaloriesCount(30));

        exercise2.start();
        exercise2.perform();
        System.out.println("Swimming for 30 minutes - calories = " + exercise2.getCaloriesCount(30));

        exercise3.start();
        exercise3.perform();
        System.out.println("Lifting for 30 minutes - calories = " + exercise3.getCaloriesCount(30));
    }
}
