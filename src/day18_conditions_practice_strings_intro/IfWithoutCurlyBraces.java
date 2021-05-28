package day18_conditions_practice_strings_intro;

public class IfWithoutCurlyBraces {
    public static void main(String [] args){

        String todaysClass = "Python";

        if(todaysClass.equals("Java"))
            System.out.println("Java is fun");

        else
            System.out.println("Its not Java. It is " + todaysClass);
// we cant skip {} if you need only one print statement in each IF, but it is recommended to ALWAYS use it
        int score = 1;
        if(score==1) {
            System.out.println("lowest score 1");
            System.out.println("fail");

        }else if(score ==2) {
            System.out.println("Score 2");
            System.out.println("fail again");

        }else if(score ==3) {
            System.out.println("Score 3");

        }else{
            System.out.println("Invalid score");}

        int a = 2;
        if(a==1)
            System.out.println("a is 1");
            System.out.println("1 is a");



    }
}
