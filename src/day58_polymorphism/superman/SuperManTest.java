package day58_polymorphism.superman;

public class SuperManTest {
    public static void main(String[] args) {
        Father super1 = new SuperMan(); // this polymorphism
        super1.feedKids(); // SuperMan class can see only methods from Father class as the object is coming from Father
        super1.playWithKids();
        super1.raiseKids();
        //super1.work() ERROR as the object is not coming from Worker class
        Worker super2 = new SuperMan();
        super2.work("SDET"); // SuperMan class can see the methods from Worker class
        System.out.println("got paid $ " + super2.getPaid());
        //super2.raiseKids(); // ERROR as the object is not coming from Father class

        SuperMan super3 = new SuperMan();
        super3.feedKids();
        super3.playWithKids();
        super3.raiseKids();
        super3.work("Scrum Master");
        super3.getPaid();
    }
}
