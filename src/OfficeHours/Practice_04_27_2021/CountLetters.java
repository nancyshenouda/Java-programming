package OfficeHours.Practice_04_27_2021;
/*
[Count Letters]
Create a method that will accept a String and print how many times each characters is found in the String
Ex:
	Input:
		"apple tree"
	Output:
		a - 1
		p - 2
		l - 1
		e - 3
	      - 1  (space char)
	    t - 1
	    r - 1
 */
public class CountLetters {
    public static void main(String[] args) {

        String words = "apple tree";
        int count = 0;
        String storage ="";

        for(int i=0;i<words.length();i++){
            count =0;
            for(int j=0;j<words.length();j++){
                if(words.charAt(i)==words.charAt(j)){
                    count++;
                }
                storage+=words.charAt(i)+ "";
            }
            System.out.println("" + words.charAt(i) + " " + count);
        }
    }
}
