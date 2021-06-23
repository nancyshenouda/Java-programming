package day56_abstraction.drivable;

public interface SelfDrivable {
    void autoPiloting();

    // void selfPark(); this causes error in sub classes, as it must be override abstract class

    public default void selfPark() {
        System.out.println("Performing self parking");
        // if we add default keyword to the method to make it have implementation without breaking the code
        // it is not an access modifier
        // it is automatically public
        //default is mendatory in interface c
        // everything in interface is public


    }
}
