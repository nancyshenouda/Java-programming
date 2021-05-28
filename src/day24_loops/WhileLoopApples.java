package day24_loops;

public class WhileLoopApples {
    public static void main(String [] args) throws InterruptedException {

        int apples = 1;

        while(apples <=10){
            System.out.println("Eating the apple number:" + apples);
            ++apples;
            Thread.sleep(1000);// this command is the same with every code, it doesnt change
        }
            System.out.println("No more apples :( ");


        }
    }


