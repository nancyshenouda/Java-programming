package day56_abstraction.drivable;

import day56_abstraction.greeting.Greeting;

public class Plane extends Transportation implements SelfDrivable, Greeting {
    @Override
    public void autoPiloting() {
        System.out.println("Plane can auto piloting");
    }

    @Override
    public void transportPassengers() {
        System.out.println("plane transports passengers");
    }

    @Override
    public void cost(int miles) {
        System.out.println("plane costs " +( miles *25) + " to fly "+ miles + " miles");
    }

    @Override
    public void hi() {
        System.out.println("plane say welcome on board");
    }

    @Override
    public void bye() {
        System.out.println("Plane say Tahnks for flying with us");
    }

    public void land() {
        System.out.println("Plane is landing");
    }
}
