package day15_logicalOps_switch_ternary;

public class AndOperatorsPractice {
    public static void main(String[] args) {
        boolean onSale=true;
        boolean freeShipping=true;
        String itemName="dress";

        if(onSale&&freeShipping){
            System.out.println("Add item: " + itemName + " in cart");
        }else{
            System.out.println("Move forward and code java");}
    }
}
