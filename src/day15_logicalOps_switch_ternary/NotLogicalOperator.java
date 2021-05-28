package day15_logicalOps_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true= " + (!true));
        System.out.println("!false = " + (!false));

        int age=5;
        if(!(age>7)){
            System.out.println("need to set in child car seat");}
        else {
            System.out.println("Can sit in normal seat. age = " + age);}

        boolean IsSmokingAllowed=true;
        if(!IsSmokingAllowed){
            System.out.println("We can have lunch there with our kids");}
        else{
            System.out.println("this is a smoking area");}

        boolean Affordable=false;
        if(!Affordable){
            System.out.println("I cann buy it now");}
        else{
            System.out.println("We cannot afford it");}

        String env = "qa";
        if(!env.equals("qa")){
            System.out.println("In wrong environment for QA testing");}
        String model ="Kia";
        if(!model.equals("Tesla")){
            System.out.println("Not interested. Thank you");}

        String secretPassword="abc123";
        String inputPassword="abc321";
        if(!inputPassword.equals(secretPassword)){
            System.out.println("Invalid password, please try again");}
        }

    }
