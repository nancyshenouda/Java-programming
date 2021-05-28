package OfficeHours.Practice_03_15_2021;

 //Ex:
        // number = 65
        // Output:
       //  65 is divisible by 2: false
       //  65 is divisible by 3: false
       //  65 is divisible by 5: true
//
public class OperatorAnalize4 {
     public static void main(String[] args) {
         int number = 65;
         boolean by2 = number % 2 == 0;
         boolean by3 = number % 3 == 0;
         boolean by5 = number % 5 == 0;

         if (number % 2 == 0) {
             System.out.println(false);
         }
         if (number % 3 == 0) {
             System.out.println(false);
         }
         if (number % 5 == 0) {
             System.out.println(true);
         }
     }
 }