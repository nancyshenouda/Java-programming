package day29_nestedloops_arrays;

public class StartNestedLoop {
    public static void main(String[] args) {

        for(int i=1; i<=5;i++){

            for(int n=1; n<=10;n++){

                System.out.print("* "); // only one statement
            }
            System.out.println();// we need this statement to go to the next line after the outer loop runs
        }
//OUTER : 1 - 10
//    INNER: 1 to OUTER
        for(int i=1;i<=5;i++){
            for(int n=1;n<=i;n++){

                System.out.print("* ");
            }
            System.out.println();
        }
//Reverse:
        for(int i=5;i>=1;i--){
            for(int n=1;n<=i;n++){

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
