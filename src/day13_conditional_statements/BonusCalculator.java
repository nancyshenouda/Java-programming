package day13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {
        int salesAmount = 1000;
        int bonus = 0;

        if (salesAmount <= 2000) {
            System.out.println("Good job, you are qualified for bonus");
            bonus = 50;
        } else {
            System.out.println("Great job, you are qualified for full bonus");
            bonus = 100;
        }

        System.out.println("Your total bonus : $" + bonus);
    }
}
