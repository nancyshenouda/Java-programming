package day18_conditions_practice_strings_intro;

public class Practice {
    public static void main(String[] args) {

        int num1 = 2;
        int num2 = 3;
        int num3 = 1;

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the biggest");
        }else if(num2 > num1 && num2 > num3){
            System.out.println(num2 + " is the biggest");
        }else if(num3 >num1 && num3 > num2){
            System.out.println(num3 + " is the biggest");
        }
    }
}
