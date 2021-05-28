package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String company="Capital one";
        System.out.println(company.contains("i")); // true as it contains letter i, it can be anywhere, doesn't matter
        System.out.println(company.contains("ital")); //true
        System.out.println(company.contains("l o"));// true
        System.out.println(company.contains("j"));// false
        System.out.println(company.contains("One")); // false as O is capital and it is case sensitive

        if(company.contains(" ")){
            System.out.println("company name with multiple words");
        }else{
            System.out.println("single word company name");
        }

        String etsyTitle= "Wooden spoon | Etsy";

        if(etsyTitle.contains(" | ")){
            System.out.println("Correct title");
        }else if(etsyTitle.contains("|")){
            System.out.println("incorrect title");
        }

        String firstName="Nancy";

        if(firstName.contains("a") && firstName.contains("y")){
            System.out.println("It is Nancy");
        }

        firstName= "Nadir";
        if(firstName.contains("N") || firstName.contains("e")){
            System.out.println("It is Nadir");
        }

        String email= "Shenouda.nancy@gmail.com";
        if(email.contains("@") && email.endsWith(".com")){
            System.out.println("valid email address");
        }else{
            System.out.println("Invalid email address");
        }

        if(email.toLowerCase().contains("D")){ // CHAINING
            System.out.println("valid email");
        }else{
            System.out.println("Invalid email"); // it is invalid as D is UPPER case
        }

    }
}
