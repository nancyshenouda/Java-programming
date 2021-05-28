package Tasks.Loops_Practice_2;

public class BiggestV2 {
    public static void main(String[] args) {

        String word = "aaabbbcccccddddee";
        int max = 0;
        int count = 1;
        char maxChar = ' ';

        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                count ++;
            } else {
                if (max < count)
                {
                    max = count;
                    maxChar = word.charAt(i);
                }
                count = 1;
            }
        }
        for (int i = 0; i < max; i++) {
            System.out.print(maxChar);
        }
    }
}

