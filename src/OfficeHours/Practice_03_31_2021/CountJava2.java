package OfficeHours.Practice_03_31_2021;

public class CountJava2 {
    public static void main(String[] args) {
        String str = "java is fun, java class today, javascript";
        int count=0;

        for(int i = 0; i < str.length()-3; i++){

            String eachFourLetters = str.substring(i, i+4); //== str.substring(0,4)
            System.out.println(eachFourLetters);
            if(eachFourLetters.contains("java")){
                count++;
            }
        }
        System.out.println("java was fount " + count + " times");
    }
}
