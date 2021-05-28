package Tasks.Loops_Practice_1;

import java.util.Scanner;

/*
[Dynamic alphabet]•
Write a program that will ask‘upper’ or ‘lower’•If it is upper:
print the alphabet in all uppercase letter from A to Z•
If it is lower: print the alphabet in all uppercase letter from a to z
-Challenge: Also ask
if they want to show the alphabet in ascending or  order descending -Ascending: A –Z or a –z -Descending: Z –A or z –a
 */
public class DynamicAlphabetV2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want it uppercase or lower case?");
        String input = scan.next();
        int start;
        int end;

        System.out.println("Do you want then ascending or descending");
        String answer = scan.next();

        if (input.equals("uppercase")) {
            start ='A';
            end = 'Z';
        } else {
            start = 'a';
            end = 'z';
        }
        if(answer.equals("ascending")){
        for(int i = start; i<=end; i++){
        System.out.println((char)i + "");
       }
      }else{
       for(int i=end;i>=start; i--){
        System.out.println((char)i + "");
    }
}
    }

}



