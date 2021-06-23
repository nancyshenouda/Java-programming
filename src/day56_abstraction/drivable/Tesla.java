package day56_abstraction.drivable;

import day56_abstraction.greeting.Greeting;

public class Tesla extends Transportation implements SelfDrivable, Greeting {
    @Override
    public void transportPassengers() {
        System.out.println("Tesla is transporting people on the roads");
    }

    @Override
    public void cost(int miles) {

        System.out.println("Tesla costs " +( miles *0.10) + " to drive "+ miles + " miles");
    }

    @Override
    public void autoPiloting() {
        System.out.println("Tesla can run by auto pilot");
    }

    @Override
    public void hi() {
        System.out.println("tesla is saying hello hello peep peeep :) ");
    }

    @Override
    public void bye() {
        System.out.println("Bye bye charge me :) :)");
    }
}
