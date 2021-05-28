package day35_methods_with_param;

public class Email {
    public static void main(String[] args) {
        buildEmail("Shenouda nancy","gmail");// we put the values here when we call the method.
        buildEmail("Mariam.mowad","yahoo");
    }
    public static void buildEmail(String name, String domain){


        System.out.println("My Email is: "+ name.replace(" ","_").toLowerCase() + "@" + domain + ".com");
    }
}
