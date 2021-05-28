package day17_ternary_nested_conditions;

public class VendingNestedIf {
    public static void main(String[] args) {

        String selection = "snake";
        String drink = "Coke";
        String snake = "candy";
        if (selection.equals("drink")) {
            System.out.println("drink option is selected");
            if (drink.equals("Tea"))
                System.out.println(drink + " drink is selected");
                if (drink.equals("Coke"))
                    System.out.println(drink + " drink is selected");
            } else if (selection.equals("snake")) {
                System.out.println("Snake option is selected");
                if (snake.equals("Chips"))
                    System.out.println(snake + " snake is selected");
                if (snake.equals("candy"))
                    System.out.println(snake + " snake is selected");
            }
        }
    }




