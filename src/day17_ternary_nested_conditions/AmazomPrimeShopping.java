package day17_ternary_nested_conditions;

public class AmazomPrimeShopping {
    public static void main(String[] args) {
        int itemPrice = 50;
        boolean iPrimeMember = false;

        if (iPrimeMember == true) {
            System.out.println("Eligible to free 2 days shipping ");
        } else {
            if (itemPrice > 25) {
                System.out.println("Eligible for free regular shipping");
            } else {
                System.out.println("Not eligible for free shipping. Shipping fees are $10");
            }
        }
    }
}
