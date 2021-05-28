package day39_wrapper_classes;

public class ParseString {
    public static void main(String[] args) {

        //IQ: HOW TO CONVERT A STRING TO A NUMBER?

        String total="2345";
        System.out.println("String total = " + total);
        int count = Integer.parseInt(total);
        System.out.println("count = " + count);
        count+=100;
        System.out.println(count);
        
        String longStr="12133546575686";
        long count1=Long.parseLong(longStr);
        System.out.println("count1 = " + count1);

        String strPrice = "123.99";
        double price = Double.parseDouble(strPrice);
        if(price > 100){
            System.out.println("Expensive");
        }

       String sentence = "I wrote 200 lines of codes";

        String [] arr = sentence.split(" ");
        int linesOfCodes = Integer.parseInt(arr[2]);
        System.out.println("linesOfCodes = " + linesOfCodes);





    }
}
