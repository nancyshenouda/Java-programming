package Tasks.Saim_tasks_Unit_One;

public class HouseBuyer {
    public static void main(String[] args) {
        String name = "Oaks";
        int averagePrice = 0;
        double rating = 0;
        boolean gated = false;
        boolean allowPets = true;

        switch(name) {
            case "Hills":  System.out.println(name + " is a good choice as it is at $" + averagePrice + " rating is " + rating
                    + " Is it gated? " + gated + "Does it allow Pets? " + allowPets);
            averagePrice = 89000;
            rating = 4.0;
            gated = false;
            allowPets = true;
            break;

            case "Oaks": System.out.println(name + " is a good choice as it is at $" + averagePrice + " rating is " + rating
                    + " Is it gated? " + gated + "Does it allow Pets? " + allowPets);
            averagePrice = 75000;
            rating =  3.5;
            gated = false;
            allowPets =false;
        }

    }
    }

