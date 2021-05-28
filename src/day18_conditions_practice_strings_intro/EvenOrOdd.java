package day18_conditions_practice_strings_intro;
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner scan= new Scanner(System.in);
        int num = scan.nextInt();
        if(num%2==0){
            System.out.println(num + " is Even");
        }else if(num%2!=0){
            System.out.println(num + " is Odd");
        }
        
        String result = (num%2==0)? "Even" : "Odd";
        System.out.println("result = " + result);;


    }
}

