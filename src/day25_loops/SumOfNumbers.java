package day25_loops;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 1;

        for(int i = 1; i<=20; i++) {
            //System.out.println(i);
            sum += i;

            System.out.println("sum = " + sum);
        }
    }
}
