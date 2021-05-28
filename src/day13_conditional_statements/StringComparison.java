package day13_conditional_statements;

public class StringComparison {
    public static void main(String[] args) {
        String city="Cairo";
        if(city.equals("Cairo")){
            System.out.println("Then it is my city");}
        else{
            System.out.println("it is not my city");
        }
        String weather= "nice";
        if(weather!="sunny"){
            System.out.println("Then we will go out for a picnic");}
        else{
            System.out.println("We are staying home and code java!");
        }

    }
}
