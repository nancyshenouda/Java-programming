package day17_ternary_nested_conditions;

public class TernaryExamples {
    public static void main(String[] args) {
        int score = 50;
        String result = (score>60)? "pass" : "Fail";
        System.out.println(result);

        
        String quality = "bad";
        int x = (quality.equals("good")) ? 100 : 0;
        System.out.println(x);

        int score1 = 100;
        char grade = (score1 >90)? 'A' : 'B';
        System.out.println("grade = " + grade);
        
        int num1 = 30;
        int num2 = 20;
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("max = " + max);
    }
}
