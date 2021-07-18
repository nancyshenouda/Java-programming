package day58_polymorphism.superman;

public class SuperManTest {
    public static void main(String[] args) {
        Father super1 = new SuperMan(); // this is polymorphism
        super1.feedKids(); // SuperMan class can see only methods from Father class as the object is coming from Father
        super1.playWithKids();
        super1.raiseKids();
        ((SuperMan)super1).work("Engineer"); //We need down casting or without casting//ERROR as the object is not coming from Worker class


        System.out.println("----------------");
        Worker super2 = new SuperMan();
        super2.work("SDET"); // SuperMan class can see the methods from Worker class
        System.out.println("got paid $ " + super2.getPaid());
        ((Father)super2).raiseKids();  // down casting
        //ERROR as the object is not coming from Father class
        System.out.println("--------------------");
        SuperMan super3 = new SuperMan(); // SuperMan inherits from Father and Worker so he can have access to all the methods
        super3.feedKids();
        super3.playWithKids();
        super3.raiseKids();
        super3.work("Scrum Master");
        super3.getPaid();
    }
}
