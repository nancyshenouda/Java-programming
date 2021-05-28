package Tasks.Saim_tasks_Unit_One;


public class FieldTrip {
    public static void main(String[] args) {

        int grade = 5;
        String location = " ";
        int numberOfGroups= 1;
        String teacherInCharge = " ";
        switch (grade) {
            case 1:
                location = "Apple orchard";
                numberOfGroups = 3;
                teacherInCharge = "Ms. Smith";
                break;
            case 2:
                location = "Zoo";
                numberOfGroups = 7;
                teacherInCharge = "Mr. Lee";
                break;
            case 3:
                location = "Aquarium";
                numberOfGroups = 5;
                teacherInCharge = "Mr. Wilson";

                break;
            case 4:
                location = "Movie theater";
                numberOfGroups = 2;
                teacherInCharge = "Mr. Reyee";
                break;
            case 5:
                location = "Museum";
                numberOfGroups = 5;
                teacherInCharge = "Mr. Lela";
                break;
            case 6:
                location = "Six Flags";
                numberOfGroups = 8;
                teacherInCharge = "Mr. Watt";
                break;
            default:
                System.out.println("Invalid grade");
                break;
        }
        System.out.println("Grade : " + grade + " will go to " + location +
                " and the number of group will be "
                + numberOfGroups + " and the teacher name will be " + teacherInCharge);
    }

}
