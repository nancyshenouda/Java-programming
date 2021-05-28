package day12_boolean_conditional_statements;

public class CompareChars {
    public static void main(String[] args) {
        char letter1 = 'n';
        char letter2= 'c';
        System.out.println(letter1 == letter2); //false
        System.out.println(letter1>letter2);//true
        System.out.println(letter1<letter2);//false
        System.out.println(letter1 !=letter2); //true

        char grade = 'B';
        boolean pass =grade <= 'D';
        System.out.println("Did you pass the text? - " + pass);

    }
}
