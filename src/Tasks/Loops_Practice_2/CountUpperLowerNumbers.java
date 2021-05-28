package Tasks.Loops_Practice_2;

/*
Count upper, lower, and numbers
Given a String, find and print how many uppercase letter, lowercase letter, and number are in the String.
Ex:Input:
2juMp41EEkd4s4
Output:
3 uppercase letters
6 lowercase letters
5numbers
 */
public class CountUpperLowerNumbers {
    public static void main(String[] args) {

        // this practice is about ASCII Table


            String str = "1234576554";
            int upperCase=0;
            int lowerCase=0;
            int number=0;

            for(int i =0; i <str.length();i++){
                char eachLetter = str.charAt(i);
                if(eachLetter>='A' && eachLetter<='Z') {   // we can still use the numbers range from ASCII table (65 to 90)
                    upperCase++;
                }else if(eachLetter >= 'a' && eachLetter<='z'){  // 97 - 122
                    lowerCase++;
                }else if(eachLetter >= '1' && eachLetter <='9'){  //48 - 57  true
                    number++;
                }
            }
            System.out.println("Uppercase - " + upperCase);
            System.out.println("lowercase - " + lowerCase);
            System.out.println("Numbers - " + number);
        }
    }
