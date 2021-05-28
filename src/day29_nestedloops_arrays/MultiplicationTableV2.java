package day29_nestedloops_arrays;

public class MultiplicationTableV2 {
    public static void main(String[] args) {
        System.out.println("");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j + " x " + i + " = " + j * i + "\t | \t");
            }
            System.out.println("");
        }
        System.out.println("------------------------------------------------------------------------------");
        for (int i = 1; i <= 10; i++) {
            for (int j = 6; j <= 10; j++) {
                System.out.print(j + " x " + i + " = " + j * i + "\t | \t");
            }
            System.out.println("");
        }
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("|\t" + i * j + "\t");
                if (j == 10){
                    System.out.print("|");
                }
            }
            System.out.println("\n--------------------------------------------------------------------------------");
        }

    }
}
