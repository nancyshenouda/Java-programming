package OfficeHours.Practice_03_18_2021;
import java.util.Scanner;
public class BakingContest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int judge = 1;

        System.out.println("Enter judge " + judge++ + " score");
        int scoreOne=scan.nextInt();
        System.out.println("Enter judge " + judge++ + " score");
        int scoreTwo=scan.nextInt();
        System.out.println("Enter judge " + judge++ + " score");
        int scoreThree=scan.nextInt();
        System.out.println("Enter Other Person1's score");
        int otherPerson1 = scan.nextInt();
        System.out.println("Enter Other Person2's score");
        int otherPerson2 = scan.nextInt();

        int ourAverage= (scoreOne + scoreTwo + scoreThree)/3;
        if(ourAverage > otherPerson1 && ourAverage > otherPerson2 ) {
            System.out.println("First Place");
        } else if((ourAverage > otherPerson1 && ourAverage< otherPerson2 ) ||
                (ourAverage < otherPerson1 && ourAverage> otherPerson2)){
            System.out.println("Second Place");

        }else {
            System.out.println("Third Place");}


    }
}
