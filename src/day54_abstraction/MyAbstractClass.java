package day54_abstraction;

public abstract class MyAbstractClass {
    int num = 55;
public void learn(){
    System.out.println("Learning...");
}
public abstract void close();
}

class Sub extends MyAbstractClass{
@Override
    public void close(){
    System.out.println("Closing...");
}
        }

class MyObjects{
    public static void main(String[] args) {

        //MyAbstractClass mac = new MyAbstractClass(); // we cannot create object from an abstract class

        Sub sub = new Sub();
        sub.learn();
        System.out.println(sub.num);
        sub.close();


    }
}
