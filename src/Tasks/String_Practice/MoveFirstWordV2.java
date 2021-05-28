package Tasks.String_Practice;

/*
[Move first word]
Given a sentence. Display the sentence with the first word moved to the end of the sentence.
Ex:input: Java is a fun language
output: is a fun language Java
Hint: Use indexOf and substring
 */
public class MoveFirstWordV2 {
    public static void main(String[] args) {

        String sentence = "Java is a fun language";
        String java = sentence.substring(0,sentence.indexOf(" "));
        System.out.println(java);
        String end = sentence.substring(sentence.indexOf(" ")+1);
        System.out.println(end);
        System.out.println(end + " " + java);
    }
}
