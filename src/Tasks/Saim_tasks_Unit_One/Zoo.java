package Tasks.Saim_tasks_Unit_One;

public class Zoo {
    public static void main(String [] args){
        String name="Manassas Zoo", foundedDate="March 7- 2021", startingTime="7 am", closingTime="5 pm",
                parkRules="Stick to the signed instructions/opening and closing times/ keep the tickets with you all the time/don't cross the borders between the animals cages and audience/don't try to feed the animals";
        Boolean openOnHolidays=false, hasAquariumSection=true;
        int numberOfBigCats=7, numberOfHoofedAnimals=50, numberOfReptiles=5, numberOfBirds=200, numberOfPrimates=20, numberOfEmployees=400,
                ticketCostForAdults=15, ticketCostForUnder13=10;
        System.out.println(" ***** Welcome to our Manassas Zoo *******");
        System.out.println();
        System.out.println("Manassas Zoo was founded on " + foundedDate +
                ". We have different types of animals and birds from different species. The total number of big cats is " + numberOfBigCats +
                ". The number of hoofed animals is " + numberOfHoofedAnimals + ". The number of reptiles is " + numberOfReptiles +
                ". The total number of different kind of birds is " + numberOfBirds + ". The number of primates is " + numberOfPrimates +
                ". Do we have Aquarium Section? " + hasAquariumSection +
                ". Also the number of Employees around the Zoo is "+ numberOfEmployees);
        System.out.println();
        System.out.println("We are open from "+ startingTime + " and are closing at " + closingTime + ". Open on Holidays? " + openOnHolidays);
        System.out.println();
        System.out.println("The ticket Per Adult is: " + "$"+ ticketCostForAdults + " and for minors under 13 is: "+ "$" + ticketCostForUnder13);
        System.out.println();
                System.out.println(" Please follow the below Park rules: " + "\n" + parkRules);

    }
}
