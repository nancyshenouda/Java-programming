package day25_loops;

public class ForLoopFirst {
    public static void main(String[] args) {
        // below is infinite loop with For loop like while(true)

        //for(;;) {
         // System.out.println("Java is fun");}

        for(int i=0 ; i<5; i++){   // (initialization; boolean condition; updates)
            System.out.println("Hello World");// it prints 5 lines coz 0 is included/5 is not included/
                                             // condition is true /
                                            // updates it set upto 5 times till the conditions
                                            //becomes false
        }

        for(int i=1; i<=10; i++){   // start from 1 to 10
            System.out.println(i);
        }

        for(int n=10; n>=1; n--){  // starts from 10 to 1
            System.out.println(n);
        }
      }
    }

