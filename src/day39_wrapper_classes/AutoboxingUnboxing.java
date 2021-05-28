package day39_wrapper_classes;

public class AutoboxingUnboxing {
    public static void main(String[] args) {
        //Auto-boxing: Converting from Primitive ==> Wrapper class object
        int num1=500;
        Integer num2=num1;
        Integer num3=234;
        System.out.println(num2);
        System.out.println(num3);

        // Un-Boxing: Converting from Wrapper class object ==> Primitive
        Double d1= new Double(33.99);
        double d2=d1;
        System.out.println(d1);

    }
}
