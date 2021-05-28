package day19_class_vs_object_strings;

public class CheckCaseMatch {
    public static void main(String[] args) {
        String countryCode = "usa";

        if(countryCode.equals(countryCode.toUpperCase())){
            System.out.println("Pass - case is correct");
        }else{
            System.out.println("Fail - case is incorrect");
        }

        String word = "java";
        String uWord = word.toUpperCase();
        System.out.println(uWord);
        if(word.equals(uWord)){
            System.out.println("case match");
        }else {
            System.out.println("case mismatch");
        }
    }
}
