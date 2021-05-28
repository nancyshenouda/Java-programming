package day10_shorthand_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars=10;
        System.out.println("cars in Parking lot= " + cars);
        cars=cars+2;
        System.out.println("cars after adding 2 = " + cars);
        cars+=5;
        System.out.println("cars after adding 5= " + cars);
        cars-=6;
        System.out.println("cars after 6 people left = " + cars);
        cars=cars-1;
        System.out.println("cars left " + cars);
        
        int electricCars=13;
        System.out.println("electricCars = " + electricCars);
        cars+=electricCars;
        System.out.println("total cars with electric = " + cars);

        String word="Java";
        System.out.println("word = " + word);
        word=word+" programming";
        System.out.println("word = " + word);
        word+=" is fun";
        System.out.println("word = " + word);
        
        String selenium=" but \" selenium \"is more fun.";
        word+=selenium;
        System.out.println("word = " + word);

        char letter='D';
        System.out.println("letter = " + letter);
        letter+=3;
        System.out.println("letter = " + letter);
        letter+=1;
        System.out.println("letter = " + letter);
        
        double parkingFee=7.50;
        System.out.println("Regular parking Fee = $" + parkingFee);
        parkingFee = parkingFee/2;
        System.out.println("Early Bird parking fee = " + parkingFee);
        parkingFee-=parkingFee;
        System.out.println("Weekend parking Fee = " + parkingFee);


    }
}
