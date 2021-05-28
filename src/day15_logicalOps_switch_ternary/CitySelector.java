package day15_logicalOps_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city="Moscow";
        if(city.equals("Moscow") || city.equals("Tampa")) {
            System.out.println("Willing to relocate to " + city);
        }else {
            System.out.println("Not considering relocating to " + city);}

        String teacher= "Saim";
        if(teacher.equals("Saim")&& teacher.equals("Murodil")){
            System.out.println("It is a Java class! with " + teacher);}
        else if (teacher.equals("Nadir")){
            System.out.println("Is is a soft skills class with " + teacher);}
        else{
            System.out.println("It is a weekend");}
        String company="Google";
        int salary=65000;
        if(company.equals("Google") || salary>=100000) {
            System.out.println("I will accept the offer from " + company);
        }else {
            System.out.println("I will go for another company offer");}
    }
}
