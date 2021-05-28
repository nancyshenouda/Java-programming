package day15_logicalOps_switch_ternary;

public class CarDealership {
    public static void main(String[] args) {
        int budget=5000;
        double carPrice=9999;
        String model="Honda";
        if(carPrice<=budget && (model.equals("Toyota") || model.equals("Honda") || model.equals("Tesla"))){
            System.out.println("I will buy this car " + model + " at the price: " + carPrice);
        }else{
            System.out.println("I will keep looking " + model + " is not within my budget");}
        }
    }

