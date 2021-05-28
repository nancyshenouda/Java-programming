package day21_string_manipulation;

public class ReplacePractice {
    public static void main(String[] args) {

        String word = "github";

        System.out.println(word.toUpperCase());
        System.out.println(word.replace("hub","lab"));
        System.out.println("word = " + word);
        
        word=word.replace("hub", "lab");
        System.out.println("word = " + word);


        String sentence = "java is fun";


        String withNoSpace = sentence.replace(" " ,"");
        System.out.println("withNoSpace = " + withNoSpace);

        System.out.println(sentence.replace("java", "selenium").replace("fun", "a lot of fun"));

        String result = "1-48 of over 4,000 results for java book";
                
                result = result.replace("1-48 of over", "")
                        .replace("," ,"")
                        .replace("results for java book" , "");
        System.out.println("result = " + result);
        
    }
}
