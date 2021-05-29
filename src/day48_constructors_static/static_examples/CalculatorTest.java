package day48_constructors_static.static_examples;

public class CalculatorTest {
    public static void main(String[] args) {

        Calculator.add(20,30); // add method is static so it can be called using className.staticMethodName

         // the multiply method is not static/
        // it is an object method so we need to create an object to call it
        Calculator calObject = new Calculator();
        calObject.multiply(10,30);
        // static methods also can be called using objects
        calObject.add(5,3);

    }
}
