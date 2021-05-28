package Tasks.Loops_Practice_2;

/*
Biggest substring of matching characters Given
a String find the biggest substring of chars that match and print it.
Ex: aaabbbcccccddddee
Output: ccccc
 */
public class BiggestSubstring {
    public static void main(String[] args) {


        //String biggest = "";

//        for (int i = 0; i < word.length() - 4; i++) {
//            if(word.charAt(i)==word.charAt(i + 1)){
//                biggest = word.substring(i, i + 5) + " ";
//                biggest += word.charAt(i);
//                System.out.println(biggest);
//            }
//
//        }
//
//    }
//
//}
        String word = "aaabbbcccccddddeeeeeeeee";
        int bigest = 0;
        int num = 1;
        char biggestChar = ' ';

        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                num++;
            } else {
                if (bigest <= num - 1) {
                    bigest = num;
                    biggestChar = word.charAt(i);
                }
                num = 1;
            }
        }
        for (int i = 0; i < bigest; i++) {
            System.out.print(biggestChar);
        }
    }
}


