package day56_abstraction.drivable;

public class DrivableTest {
    public static void main(String[] args) {

        Tesla model3  = new Tesla();
        model3.hi();
        model3.start();
        model3.transportPassengers();
        model3.autoPiloting();
        model3.cost(25);
        model3.stop();
        model3.bye();

        Plane plane = new Plane();
        plane.hi();
        plane.start();
        plane.autoPiloting();
        plane.transportPassengers();
        plane.cost(25);
        plane.land();
        plane.stop();
        plane.bye();

        SelfDrivable sd1 = new Plane();
        sd1.autoPiloting();

        SelfDrivable sd2 = new Tesla();
        sd2.autoPiloting();

        Transportation tp1 = new Plane();
        Transportation tp2 = new Tesla();

    }
}
