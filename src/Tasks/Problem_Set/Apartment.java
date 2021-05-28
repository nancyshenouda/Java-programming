package Tasks.Problem_Set;

public class Apartment {
    public static void main(String[] args) {
        String address= "Essex Grove Way";
        String nameOfOwner="Nancy Shenouda";
        String lenghthOfLease="12 months";
        String numberOfReviewStars="4 out of 5";
        int numberOfUnits=12;
        int averageSizeOfEachUnit= (3*5);
        int monthlyRentAmount=2100;
        int numberOfWashersAndDriers=2;
        int totalNumberOfResidentsInBuilding=200;
        int numberOfFloors=4;
        int numberOfParkingSpaces=30;
        boolean PetsAllowed=false, hasPool=false, isNearGasStation=true, hasBasement=false, hasAvailableUnitsForRent=true,
                hasAirConditioning=true, hasWheelChairAccess=true;
        long phoneNumberOfOwner=2406421334L;
        int monthlyRentAfterThreeYears=monthlyRentAmount*(12*3), monthlyRentAfterSixYears=monthlyRentAmount*(12*6);
        int averageNumberOfResidentsPerUnit=(totalNumberOfResidentsInBuilding/numberOfUnits);
        double averageNumberOfParkingSpotsPerUnit=(numberOfParkingSpaces/numberOfUnits);
        double averageNumberOfUnitsPerFloor=(numberOfUnits/numberOfFloors);
        System.out.println(monthlyRentAfterThreeYears);
        System.out.println(averageNumberOfResidentsPerUnit);
        System.out.println(averageNumberOfParkingSpotsPerUnit);
        System.out.println(averageNumberOfUnitsPerFloor);
    }
}
