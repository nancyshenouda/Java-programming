package day22_String_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies = "java, html, css, selenium, testing, maven, cucumber";

        System.out.println(technologies.indexOf(","));
        // it searches for the FIRST "," and gives the position number of it in the String from left to right

        System.out.println(technologies.lastIndexOf(","));
        // searches for the LAST "," and print the position of it (40)

        int indexOfJava = technologies.indexOf("java");
        System.out.println("java is at index " + indexOfJava);

        int indexOfCss = technologies.indexOf("css");
        System.out.println("css is at index " + indexOfCss);
        // it gives the position number of the c letter starting css

        int indexOfCucumber = technologies.indexOf("cucumber");
        System.out.println("cucumber is at index " + indexOfCucumber);
        // it gives the position number of the c letter in cucumber
        System.out.println(technologies.indexOf("sql"));
        // the result is -1 if the index position doesn't exist

        if(technologies.indexOf("maven") > -1) {
            System.out.println("maven is present");
        }else {
            System.out.println("maven is there");
        }

        if(technologies.indexOf("maven") > 75){
            System.out.println("maven is there");
        }else{
            System.out.println("maven is not there");
        }
    }
}
