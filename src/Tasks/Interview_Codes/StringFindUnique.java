package Tasks.Interview_Codes;

/*
String -- Find the unique
Write a return  method that can find the unique characters from the String

Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
 */
public class StringFindUnique {

    public static String findUnique(String str){

        String [] arr = str.split("");
        String word = "";
        int count = 0;

        for(int i=0; i<arr.length;i++) {
            count = 0;
        for(int j=0;j<arr.length;j++){
            if(arr[i].equals(arr[j]))
                count++;
            }
            if(count==1){
                word+=arr[i];
        }

        }
        return word;
    }

    public static void main(String[] args) {
        System.out.println(findUnique("AAADDDGGGESSCT"));
    }
}
