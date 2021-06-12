package Tasks.Interview_Codes;

import javax.xml.stream.events.Characters;

/*
String -- Frequency of Characters
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
public class StringFrequencyOfCharacters {

    public static void main(String[] args) {

        System.out.println("frequencyOfCharacters(\"AAABBCDD\") = " + frequencyOfCharacters("AAABBCDD"));
    }

    public static String frequencyOfCharacters(String word) {

        String nonFrequent = "";
        for (int i = 0; i < word.length(); i++) {
            if (!nonFrequent.contains("" + word.charAt(i))) {
                nonFrequent += "" + word.charAt(i);
            }
        }
        String expectedResult="";
        for( int j=0;j < nonFrequent.length(); j++) {

            int count = 0;

            for(int i=0; i < word.length(); i++) {

                if(word.charAt(i) == nonFrequent.charAt(j))

                    count++;
            }

            expectedResult +=nonFrequent.charAt(j)+"" + count;

        }

        return expectedResult;

    }

    }










