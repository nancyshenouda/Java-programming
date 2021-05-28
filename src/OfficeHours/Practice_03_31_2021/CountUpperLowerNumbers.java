package OfficeHours.Practice_03_31_2021;

public class CountUpperLowerNumbers {

    // this practice is about ASCII Table

    public static void main(String[] args) {

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