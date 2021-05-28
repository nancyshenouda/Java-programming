package day16_switch_ternary;

public class AdaireApartments {
    public static void main(String[] args) {
        System.out.println("#### WELCOME TO ADAIRE APARTMENTS ####");
        int numberOfBedrooms = 5;
        double StartingPrice= 0;
        switch (numberOfBedrooms){
            case  0:
                System.out.println("Studio apartment selected");
                StartingPrice =1454;
                break;
            case 1:
                System.out.println("One bedroom apartment selected");
                StartingPrice =1725;
                break;
            case 2:
                System.out.println("Two bedroom apartment selected");
                StartingPrice =2899;
                break;
            default:
                System.out.println(numberOfBedrooms + " bedrooms apartments are not available at the moment!");
                return;
        }
        System.out.println("Starting price " + StartingPrice);
    }
}
