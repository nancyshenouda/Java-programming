package day25_loops;

public class PrintStars {
    public static void main(String[] args) {
        for(int stars =1; stars<=15; stars++){
            System.out.print("* ") ;
        }
        System.out.println();
        String myStars = "";

        for(int i=1; i<=5; i++){
            myStars+="* ";

        System.out.println("My stars = " + myStars);}
    }
}
