package day59_polymorphism_exceptions.exception_handling;

public class RuntimeErrorExample {
    public static void main(String[] args) {

        System.out.println(10/2);
        System.out.println(10/0);
        // it leads to runtime exception, code compiles fine but during execution, it fails and throws (ArithmeticException)
        // the next lines of the code will not run/will be skipped
        System.out.println(10/3);


    }
}
