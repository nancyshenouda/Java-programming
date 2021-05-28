package Tasks.Problem_Set;

public class NumbersProblemSet {
    public static void main(String [] args) {


        int a=3, b=2;
        long c = (a-- + b) * 2 / 3 % 2;

           //    ( 3 + 2) * 2 /3 % 2
        //         5 * 2 /3 % 2
        //         10 /3 % 2
        //          3 % 2
        //           1
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);



        /*Analyze each step, What is the result numOne, numTwo, and biggest?/*

         */

        int numOne = 10; // 13
        int numTwo = numOne++ * 3 + ++numOne + numOne++ % 2;
        //            10 * 3 + 12 + 12  % 2
        //              30 + 12 + 0
        //              42


//           ( 10      *  3)  + 12    +   ( 12  %  2)
        //             30     + 12   + 0
        //            30 + 12
        //             42

        System.out.println(numOne);
        System.out.println(numTwo);
        int biggest = numOne > numTwo ? numOne : numTwo;
         //            13 > 42
        System.out.println("biggest = " + biggest);


    }
}
