package day27_ForLoopsWithString2;

public class IndexOf {
    public static void main(String[] args) {

        String word= "githubg";
        char letter = 'g';
        int index = -1;

       for (int n= 0 ; n < word.length() ; n++){
           //System.out.println(n + "-" + word.charAt(n));
           if(word.charAt(n)==letter){
               index=n;
               System.out.println(letter + " is found at index " + index);
               break; // exit the For Loop. it doesnt check the last g, only the first one.
               // but it will still check the next code
               //return; exit the the whole main method
           }
       }
       if (index == -1){
           System.out.println(letter + " is not present");
       }
    }
}
