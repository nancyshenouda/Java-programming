package day57_abstraction_polymorphism.abstract_class_vs_interface;

public class Runner {
    public static void main(String[] args) {

        //AbstractA object = new AbstractA() // we cannot create object from Abstract classes
        //InterfaceA object = new InterfaceA()// we cannot create object from Interface classes

        /**
         * We cannot create object(instantiate) neither of them.
         AbstractA absA = new AbstractA();
         InterfaceA iA = new InterfaceA();
         */
        InterfaceA.staticMethodE("wooden spoon");
        //ConcreteA.staticMethodE("hello"); -> staticMethodE only works with interface.staticMethodE
        ConcreteA.staticMethodC();
    }
}
