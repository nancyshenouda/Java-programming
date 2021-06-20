package day55_abstraction.interfaces_demo;

public interface MyInterface {

    public abstract void learn();
}
interface MyInterface2{

}
class MyClass implements MyInterface, MyInterface2{ // this is one of the benefits of interface

    @Override
    public void learn() {
        System.out.println("Learning in MyClass");
    }
}

class Main{
    public static void main(String[] args) {

        //MyInterface myInterface = new MyInterface(); Error because Interface class cannot be instantiated/ create objects from it

        MyClass myClass = new MyClass();
        myClass.learn();


    }
}
