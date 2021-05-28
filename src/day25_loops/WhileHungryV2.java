package day25_loops;

public class WhileHungryV2 {
    public static void main(String[] args) {

        boolean isHungry = true;
        int bananas = 0;

        while(isHungry && bananas <3){
            bananas++;

            System.out.println("Eating banana - " + bananas);

        }


    }
}
