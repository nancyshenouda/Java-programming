package Tasks.Arrays_Practice;
/*
Even and odd from array
Write a program that can count the even and odd number from an array of integers
Use for each to make it easier
Ex:Input: [4,1,3,12,5]
Output:
Even:2
Odd: 3
 */
public class EvenOddCount {
    public static void main(String[] args) {

        int [] numbers = {4,1,3,12,5};
        int countEven=0;
        int countOdd=0;

        for (int each : numbers){

            if(each%2==0){
                countEven++;

            }
            if(each%2!=0){
                countOdd++;

            }
        }
        System.out.println("even numbers = " + countEven);
        System.out.println("odd numbers =" + countOdd);
    }
}
