package day06_arithmetics_operators;

public class MoreMathOperators {
    public static void main(String[ ] args){
        int toyotas=431;
        int hondas=233;
        int vws=2;
        int teslas=20;
        int nessan=1;
        int bmws=155;
        int totalCarsInParking=toyotas+hondas+vws+teslas+nessan+bmws;

        System.out.println("There are " + totalCarsInParking + " in parking lots.");
        String pizza = "hawaiian";
        int slices =8;
        int people = 4;
        int slicesPerPerson =slices/people;
        System.out.println("there are " + slicesPerPerson + " Slices per person.");
        System.out.println("We ordered "+ pizza + " pizza with " + slices + " slices, " + people + " people ate " + slicesPerPerson + " slices each");


    }
}
