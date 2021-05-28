package OfficeHours.Practice_05_18_2021;

import java.util.Arrays;

public class Mutability {
    public static void main(String[] args) {
        String one = "java";
        String two = one;

        System.out.println(two);

        String three = two.toUpperCase();
        System.out.println(three);

        System.out.println(two.toUpperCase()==three);//false
        one = one.substring(2);
        System.out.println(one);//va
        System.out.println(two); // == one == java
        
        String a = new String("Anything");
        String b= a;
        b = b.toUpperCase();
        System.out.println("a = "  + a);
        System.out.println("b = " + b);

        int [] arr = {1,2,3};
        int [] arr2 = arr;
        arr[0] = 100; // both of the arr and arr2 will change as both of them are pointing to the same object
        arr2 [1] = 200;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
}
