package OfficeHours.practice_03_17_2021;

public class HouseBuyer {
    public static void main(String[] args) {
        String name = "Hills";
        int averagePrice = 0;
        double rating = 0;
        boolean gated = false;
        boolean allowPets = true;

        switch (name) {
            case "Hills":
                averagePrice = 89000;
                rating = 4.0;
                gated = false;
                allowPets = true;
                break;
            case "Oaks":
                averagePrice = 75000;
                rating = 3.5;
                gated = false;
                allowPets = false;
                break;
            default:
                name = "invalid name";
                averagePrice = 0;
                rating = 0;
                gated = false;
                allowPets = false;
        }
        System.out.println("name = " + name);
        System.out.println("Price = " + averagePrice);
        System.out.println("Rating = " + rating);
        System.out.println("Gated  = " + gated);
        System.out.println("allowPets = " + allowPets);
        

    }
}
