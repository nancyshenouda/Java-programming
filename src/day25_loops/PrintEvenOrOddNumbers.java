package day25_loops;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {

        System.out.println("Even numbers 0 - 100: ");
        for(int n = 0; n<=100; n++){

            if(n%2==0){
                System.out.print(n + " ");
            }

            }
        System.out.println();
        System.out.println("Odd numbers 0 - 100: ");
        for(int k=0; k<=100 ; k++){
            if(k%2!=0){
                System.out.print(k + " ");
            }
        }

        for(int i=0 ; i<=20 ; i++){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }
        }
    }

