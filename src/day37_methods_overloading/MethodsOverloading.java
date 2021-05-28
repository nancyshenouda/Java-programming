package day37_methods_overloading;

public class MethodsOverloading {
    public static void main(String[] args) {
        MethodsOverloading.sum(10,5); //Result = 15
        sum(3,5,10);  // result = 18
        sum((int)5.5,10); //result = 15 ( the decimal will be removed)
        sum("Nancy", " 100");  // Nancy 100
    }
    public static void sum(int num1, int num2){
       // System.out.println("Sum of (num1, num2) =");
        System.out.println("Result = " + (num1+num2)); // ==>result = 15
        //System.out.println(num1 + num2 +" Result"); //==> 15 result
        //System.out.println("Result = " + (num1 + num2)); ==> result = 15
        //System.out.println("Result " + num1 + num2); ==> result 105
    }
    public static void sum(int num1, int num2, int num3){
        System.out.println("Result = " + (num1 + num2 + num3));
        //System.out.println("Result " + num1 + num2 + num3); ==> result 3510
    }
    public static void sum(String name, String age){
        System.out.println(name + age);

    }
}
