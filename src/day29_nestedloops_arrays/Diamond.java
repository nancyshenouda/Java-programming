package day29_nestedloops_arrays;

public class Diamond {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            int space = 10-i;
            for(int n=1;n<=space;n++){

                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
//Reverse:
//
        for(int i=10;i>=1;i--){
            int space = 10-i;
            for(int n=1;n<=space;n++){

                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
