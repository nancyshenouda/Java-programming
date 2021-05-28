package day28_Loops;

public class BreakVsContinue {
    public static void main(String[] args) {
        // BREAK STATEMENT:
        for (int n = 1; n <= 5; n++) {
            System.out.print(n);
            if (n == 3) {

                break;// it exit the loop after the first true condition which is after 3. it has to be INSIDE the loop
            }
        }
        //CONTINUE STATEMENT
        System.out.println();
        for (int i = 1; i<=5; i++){

            if(i==2 || i==4){
                continue;// it goes to the next iteration, it skips the code below( number 4)

            }
            System.out.print(i);
        }

    }

}