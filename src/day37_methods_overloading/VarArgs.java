package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(10,5);
        addNumbers(10,5,77,12,100,500);
        addNumbers(10,5,11,22,33,44,66);
        addNumbers();

    }
    public static void addNumbers(int... nums){
        // when ... is inside the method(), it acts like regular Array
       int sum =0;
       for (int n: nums){
           sum+=n;
       }
        System.out.println("Sum = " + sum);
    }

}
