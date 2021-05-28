package day29_nestedloops_arrays;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println();
        for(int i=1; i<=5; i++){
            for(int n=1; n<=5; n++){
                System.out.println(i + "*" + n + "=" + i*n + "\t ||\t" );
            }
            System.out.println();
        }

        System.out.println("***************************************************");

        for(int i=6; i<=10; i++) {
            for (int n = 1; n <= 10; n++) {
                System.out.println(i + "*" + n + "=" + i * n + "\t ||\t");
            }
            System.out.println();
        }
    }
}
