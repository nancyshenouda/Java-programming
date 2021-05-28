package day26_ForLoopsWithString;

public class CountMatches {
    public static void main(String[] args) {
        String word = "initialization";
        char letter = 'i';
        int count = 0;

        for (int i =0; i < word.length() ; i++){
            if(word.charAt(i)==letter){
                count++;
            }
        }
        System.out.println("There are " + count + " " + letter + " in the word " + word);
    }
}
