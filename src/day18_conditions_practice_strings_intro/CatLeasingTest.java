package day18_conditions_practice_strings_intro;

public class CatLeasingTest {
    public static void main(String[] args) {

        //String make = "Mercedes";
        //String model = "A";
        //int leasePrice = 00;

        String make = "Audi";
        String model = "E";
        int leasePrice = 00;

        //if(make.equals("Mercedes") && model.equals("E")){
        //  leasePrice = 500;
        // }else if(make.equals("Mercedes") && model.equals("A")){
        //  leasePrice = 400;
        // }

        if (make.equals("Audi")) {
            if (model.equals("A")) {
                leasePrice = 500;
            } else if (model.equals("E")) {
                leasePrice = 300;
            }

        System.out.println("make  = " + make);
                System.out.println("model  = " + model);
                System.out.println("leasePrice = " + leasePrice);
        } else{
            System.out.println("Invalid model");
        }
        }
}
