package Tasks.Replit;


import java.util.Scanner;

public class BurgerChicken {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String type= scan.next();
        double price=0.0;


        if(type.equals("burger") || (type.equals("chicken"))){
           price= 10.0;
            System.out.println(price);
        }else if(type.equals("soda")){
            price = 2.0;
            System.out.println(price);

        }else if (type.equals("fries")){
            price = 3.0;
            System.out.println(price);
        }

        }

    }

