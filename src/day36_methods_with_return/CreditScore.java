package day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(800);
        checkEligible(600);
        checkEligible(700);

        System.out.println(getCreditScore());
        System.out.println("Credit score is = "+ getCreditScore ());
        int score = getCreditScore();
        System.out.println("Score is = " + score);
    }

    public static void checkEligible(int creditScore) {

        if (creditScore >= 700) {
            System.out.println("you are eligible for leasing this car");
        } else {
            System.out.println("sorry, you are not eligible for leasing this car");
        }
    }
        public static int getCreditScore ( ){
            return 800;

        }
    }
