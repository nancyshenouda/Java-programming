package day18_conditions_practice_strings_intro;

public class SwitchCheckNumbers {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;

        switch(num1) {
            case 10:
                num1++;
                num2+=10;
                System.out.println(num1);
                System.out.println(num2);
                break;
            case 20:
                num1+=num2;
                num2--;
                System.out.println(num1);
                System.out.println(num2);
                break;
            case 30:
                num1 = 0;
                num2 -= 3;
            System.out.println(num1);
            System.out.println(num2);
            break;


        }
    }
}
