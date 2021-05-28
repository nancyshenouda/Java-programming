package OfficeHours.Practice_03_24_2021;

public class CharIndex {
    public static void main(String[] args) {
        String s = "java";

        System.out.println(s.charAt(0) + "" + s.charAt(1) + "" + s.charAt(2) + "" + s.charAt(3));
        System.out.println(s.charAt(0) + s.length()-1);

        String upper = "" + s.toUpperCase().charAt(0)+ s.toUpperCase().charAt(3);
        System.out.println(upper);
    }
}
