package day37_methods_overloading;

public class DaySelector {
    public static void main(String[] args) {
        System.out.println(getDayName(8));
        System.out.println(getDayName(1));
        System.out.println(getDayName(7));
        System.out.println(getDayName(10));

        for( int i=1; i<9;i++){
            System.out.println(i + " = " +getDayName(i) );
        }
        //Store getDayName into variable, and print variable
        String today = getDayName(6);
        System.out.println("today = " + today);
        String someDay = getDayName(0);
        if(someDay == null) {
            System.out.println("someDay is null for invalid day");
        }
        System.out.println("------ printing dayNameV2 methods-----");

        System.out.println(getDayNameV2(2));
        System.out.println(getDayNameV2(8));
    }
    public static String getDayName( int day) {

        switch (day) {
            case 1:
                return "Monday";
            //break;  NO break; needed as it will be unreachable code coz return already does the same function.
            // return: it returns the value in the main method and exits the method at the same time.
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                System.out.println(day + " - ERROR: invalid day");
                return null;  // nothing, no object
        }
        }
        // method with break and return statement once at the end
    public static String getDayNameV2(int day){

            String dayName ="";

            switch(day){

                case 1:
                    dayName="Monday";
                    break;
                case 2:
                    dayName="Tuesday";
                    break;
                case 3:
                    dayName="Wednesday";
                    break;
                case 4:
                    dayName="Thursday";
                    break;
                case 5:
                    dayName="Friday";
                    break;
                case 6:
                    dayName="Saturday";
                    break;
                case 7:
                    dayName="Sunday";
                    break;
                default:
                    System.out.println("Invalid day - " + day);
                    dayName=null;
            }
                return dayName;
        }
    }

