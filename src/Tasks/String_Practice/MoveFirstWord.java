package Tasks.String_Practice;

/*
[Move first word]
Given a sentence. Display the sentence with the first word moved to the end of the sentence.
Ex:
input: Java is a fun language
output: is a fun language Java
Hint: Use indexOf and substring
---------------------------------------------------
 */
public class MoveFirstWord {
    public static void main(String[] args) {

        String sentence = "Java is a fun language";

        String start = sentence.substring(sentence.indexOf(" ") +1);
        String javaStart = sentence.substring(0, sentence.indexOf(" "));

        //String newSentence = sentence.substring(sentence.indexOf(" ") + 1) + " " +
              //  sentence.substring(0, sentence.indexOf(" "));
        //int start = sentence.indexOf(0) ;
        //int end = sentence.indexOf(6);

        System.out.println(start + " " + javaStart);

    }
}
