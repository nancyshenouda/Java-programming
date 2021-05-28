package day33_arrays;

import java.util.Arrays;

public class ReverseArrayV2 {
    public static void main(String[] args) {


        int num1 =10;
        int num2=30;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println();
        // swap these two variable using additional variable
        int temp=num1;
        num1=num2;
        num2=temp;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        int []numbers={1,2,3,4,5};
        System.out.println("array before swap -" + Arrays.toString(numbers));

       for(int i=0;i<numbers.length/2;i++) {
           int tempNum = numbers[i];
           numbers[i] = numbers[numbers.length - 1-i];
           numbers[numbers.length - 1-i] = tempNum;

       }

        System.out.println("array after swap - " + Arrays.toString(numbers));

    }
}
