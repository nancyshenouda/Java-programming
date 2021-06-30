package day58_polymorphism;

public class Casting {
    public static void main(String[] args) {
        // create variable of worker and object of SuperMan
        Worker worker = new SuperMan();
        worker.work("Manager");
        worker.getPaid();

        // how to call methods from another class like Father with the same object
        // we can cast it to SuperMan class or to Father class
        ((Father)worker).raiseKids(); // this is casing
        ((SuperMan)worker).playWithKids(); // this is casting from

        // another easier way

        SuperMan superMan = (SuperMan) worker; // downCasting from worker SuperMan


    }
}
