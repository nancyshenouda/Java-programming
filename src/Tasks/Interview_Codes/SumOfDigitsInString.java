package Tasks.Interview_Codes;

/*
String -- sum of digits in a string
Write a method that can return the sum of the digits in a string
 */
public class SumOfDigitsInString {

    public static void main(String[] args) {
        System.out.println(sumOfDigit("123456"));

    }
    public static int sumOfDigit(String word){

        int sum = 0;

        char [] arr = word.toCharArray();

        for(char each : arr){
            if(Character.isDigit(each)){
                sum+=Integer.valueOf(""+each);
            }
        }
        return sum;
    }
}
