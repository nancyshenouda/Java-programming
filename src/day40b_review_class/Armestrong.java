package day40b_review_class;

public class Armestrong {
    public static boolean isArmstrong(int num) {

        String strNum = "" + num;
        int power = strNum.length();
        int sum = 0;

        for(int i=0; i < strNum.length(); i++) {
            //  int temp = 1;
            int eachDigit = Integer.parseInt(strNum.substring(i, i+1));
            sum += Math.pow(eachDigit, power);  // 1 ^ 3 = 1 * 1 * 1
            // 5 ^ 3 = 5 * 5 * 5
//            for(int j = 0; j < power; j++) {
//                temp *= eachDigit;
//            }
        }

        return num == sum;

    }

}
