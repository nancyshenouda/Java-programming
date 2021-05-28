package day19_class_vs_object_strings;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word = "CyberTek";
        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());

        System.out.println("JAVA".toLowerCase());

        System.out.println("JAVA IS REALLY FUN".toLowerCase());

        word.toLowerCase();
        System.out.println(word);
        
        String wordInLcase= word.toLowerCase();
        System.out.println("wordInLcase = " + wordInLcase);

        word= word.toLowerCase();
        System.out.println("word = " + word);

        String company= "Amazon Web Services";
        System.out.println(company.toLowerCase());
        System.out.println(company.toUpperCase());
        System.out.println(company);
        System.out.println(company.equalsIgnoreCase("Amazon Web Services"));
        System.out.println("java".toUpperCase());


        System.out.println("company = " + company);
        company= company.toUpperCase();
        System.out.println("company = " + company);

    }
}
