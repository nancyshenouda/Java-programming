package Tasks.Problem_Set;
/*
[Personal Information - Scanner and If]
Ask the user how many people they live with?
 if user lives with Less than 2 people: print "Live with less than 2 people"
 if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
 if the user lives with more than 6 people: print "Live with "more than 6 people"
 Ask the user what city they live in?
 Ask the user if the live in downtown ("yes or no")
 if you live downtown, ask them have you thought about moving to the suburbs? ("yes or
no")
 if they have thought about it print "do it its great", if they have not print "You should
think about it"
 Ask the user their favorite animal?
 Print "Wow %animal is a great animal"
 Ask the user how many pets they want?
 Print "Interesting, do you want %numberOfPets %favoriteAnimals?"
 */

import java.util.Scanner;

public class PersonalInformation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many people you live with?");
        scan.nextLine();
        int people = scan.nextInt();
        if (people <= 2) {
            System.out.println("I Live with less than 2 people");
        } else if (people >= 3 && people <= 6) {
            System.out.println("I Live with 3 - 6 people");
        } else if (people > 6) {
            System.out.println("I Live with \"more than 6 people");
        }

        System.out.println("What city you live in?");
        scan.nextLine();
        String cityName = scan.next();



        System.out.println("You live in downtown? yes or no ");
        scan.nextLine();
        boolean inDownTown = scan.nextBoolean();
        if (inDownTown) {
            System.out.println("Have you thought about moving to the suburbs?");

            boolean doYouWantMove = scan.nextBoolean();
            if (doYouWantMove) {
                System.out.println("Do it, its great");
            } else {
                System.out.println("You should think about it");
            }

        }

        System.out.println("What is your favourite animal");
        scan.nextLine();
        String favAnimal = scan.nextLine();
        System.out.println("Wow " + favAnimal + " is a great animal");


        System.out.println("How many pets do you want?");

        int pets = scan.nextInt();
            System.out.println("Interesting, do you want " + pets + " of " + favAnimal +
                    "s?");
        }

    }







