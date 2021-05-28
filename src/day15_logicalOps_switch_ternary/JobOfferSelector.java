package day15_logicalOps_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        String location="Honolulu";
        double salary=120_000;
        boolean remote=false;
        boolean benefits=true;
    //          false    &&   true
        if(location.equals("Honolulu") && remote || (benefits || salary>=salary)){
            System.out.println("Sure, i will accept the offer");
        }else{
            System.out.println("Go for the next offer or negotiate it");}
    }
}
