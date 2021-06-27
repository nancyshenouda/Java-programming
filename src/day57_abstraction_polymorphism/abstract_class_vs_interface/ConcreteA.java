package day57_abstraction_polymorphism.abstract_class_vs_interface;


// a class an extends one Abstract class and implement multiple Interface classes (A, B)
// first non-abstract child class of Abstract or Interface is called Concrete class
// Marker Interface --> interface without any methods or variables...
// We can use this for Polymorphism or to mark the class as capable of whatever interface claims
public class ConcreteA extends AbstractA implements InterfaceA, InterfaceB{
    @Override
    public void absMethodA() {
        System.out.println("absMethodA implementation is called");
    }

    @Override
    public void methodB(){ // we can override non-final methods
        System.out.println("MethodB overriden version is called");
    }
    //@Override --> static methods can be hidden Not Overriden
    public static void staticMethodC(){
        System.out.println("staticMethodC hidden version is called");
    }

    @Override
    public void absMethodD(int num) {
        System.out.println("absMethodD overriden version ");
    }

}
