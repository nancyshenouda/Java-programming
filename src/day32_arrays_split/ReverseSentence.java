package day32_arrays_split;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "java is fun";

        String [] reverseArray=sentence.split(" ");
String reverse = "";
        for (int i=reverseArray.length-1; i>=0;i--){
           // System.out.print(reverseArray[i] + " ");
            reverse+=reverseArray[i] + " ";
        }
        System.out.println("sentence - " + sentence);
        System.out.print("reversed - " + reverse.trim());
    }
}
