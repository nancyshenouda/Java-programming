package day55_abstraction.exercise_example;

public abstract class Exercise {
    // abstract class can have non-abstract methods
    public void start(){ // this is a non-abstract method as it doesn't have abstract keyword and Has implementation
        System.out.println("Warming up and starting the exercise...");
    }
    public abstract void perform();
    /**
     * abstract method doesn't have any implementation/body
     * it has only signature
     * purpose: letting sub classes implement/override their own way
      */

    public abstract int getCaloriesCount(int minutes);
    /**
     * another abstract method that concrete sub class can have its own implementation
     * @param minutes: means how long this exercise is performed
     * @return number of calories burned/used
     */
}
