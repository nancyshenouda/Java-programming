package day15_logicalOps_switch_ternary;

public class ORLogicalOperator {
    public static void main(String[] args) {
        System.out.println("true || true = "  + (true || true));
        System.out.println("true || false = " + (true  || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("false || false = " + (false || false));
        int apples=5;
        int oranges=3;
        System.out.println(apples > 3 || oranges > 4 );
        if (apples > 3 || oranges > 4) {     // true || false = true
            System.out.println("No need to buy any fruits today!");
        }else {
            System.out.println("need to get some fruits");
        }

        if(apples ==0 || oranges == 0){
            System.out.println("We need to purchase some more");
        } else {
            System.out.println("No need to buy anything");
        }
    }
}
