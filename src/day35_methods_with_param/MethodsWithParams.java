package day35_methods_with_param;

public class MethodsWithParams {
    public static void main(String[] args) {

        displayValue(5);
        displayValue(10);
        displayValue(15);
        greetByName("Nancy");
        String name = "Heaven";
        greetByName(name);
    }
    public static void displayValue(int num){
        System.out.println("The value of num =" + num);
    }
    public static void greetByName(String name){
        System.out.println("Hello " + name +", how are you today?");
    }
}
