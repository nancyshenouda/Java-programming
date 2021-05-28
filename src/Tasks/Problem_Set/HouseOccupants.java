package Tasks.Problem_Set;

import java.util.Scanner;


    public class HouseOccupants {
        public static void main(String [] args ){
            System.out.println("Enter the house type: ");
            Scanner scan = new Scanner(System.in);
            String houseOccupants =scan.nextLine();

            switch(houseOccupants){
                case "Treehouse":
                    System.out.println("Number of occupants is 1");
                    break;
                    case "Mobile home":
                        System.out.println("Number of occupants is 2");
                        break;
                     case "Apartment":
                         System.out.println("Number of occupants is 4");
                         break;
                case "Town house":
                    System.out.println("Number of occupants is 6");
                    break;
                case "Villa":
                    System.out.println("Number of occupants is 8");
                    break;
                case "Mansion":
                    System.out.println("Number of occupants is 10");
                    break;


            }


        }
    }

