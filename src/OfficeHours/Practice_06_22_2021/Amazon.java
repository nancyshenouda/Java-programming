package OfficeHours.Practice_06_22_2021;

/*
Create a concrete class Amazon
    - Inherit OnlineShopping and implement all abstract methods
 */
public class Amazon extends OnlineShopping implements AllowUserToSell{
    @Override
    public boolean payForShipping(double price) {

            return price < 50;

    }

    @Override
    public void buyItem() {
        System.out.println("Buying items from Amazon");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning items to Amazon");
    }

    @Override
    public void viewCart() {
        System.out.println("Viewing Amazon cart");

    }

    @Override
    public void uploadProduct() {

    }
}
