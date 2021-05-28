package Tasks.Loops_Practice_2;

/*
Count upper, lower, and numbers
Given a String, find and print how many uppercase letter, lowercase letter, and number are in the String.
Ex:Input: 2juMp41EEkd4s4
Output:
3 uppercase letters
6 lowercase letters
5numbers
 */
public class CountUpperLowerNumbersV2 {
    public static void main(String[] args) {

        String word = "2juMp41EEkd4s4";
        int upperLetters = 0;
        int lowerLetters = 0;
        int number = 0;

        for(int i=0; i<word.length();i++){
            char eachLetter = word.charAt(i);

            if(eachLetter>='A' && eachLetter<='Z'){
                upperLetters++;
            }else if(eachLetter>='a' && eachLetter<='z'){
                lowerLetters++;
            }else if(eachLetter>='1' && eachLetter<='9'){
                number++;
            }

        }
        System.out.println("number of uppercase letters - " +upperLetters );
        System.out.println("number of uppercase letters - " +lowerLetters );
        System.out.println("number of numbers - " +number );
    }
}
