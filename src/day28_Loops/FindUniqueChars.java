package day28_Loops;

public class FindUniqueChars {
    public static void main(String[] args) {

        String word="javvvvvvaaaaaa";
        String unique = "";
        for(int i= 0; i < word.length(); i++) {

            //System.out.println(word.charAt(i));
            if (!unique.contains(word.charAt(i) + "")) { // if word.charAt(i) is not contained in unique, then unique
                // becomes any characters not repeated.
                unique += word.charAt(i); // unique now is a container to the unique characters
            }
        }
        System.out.println(unique);

        int numb = 100;
        String word1= numb+""; // the +"" is used to change any primitive to String.
        System.out.println(word1);

    }
}
