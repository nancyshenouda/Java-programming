package Tasks.Interview_Codes;

/*
String -- Remove Duplicates
Write a return method that can remove the duplicated values from String

Ex:  removeDup("AAABBBCCC")  ==> ABC
 */
public class StringRemoveDuplicates {

    public static String removeDuplicate(String str){

        String word = "";

        for(int i=0;i<str.length();i++){
            if(!word.contains(""+str.charAt(i))){
                word+=str.charAt(i);
            }
        }
        return word;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicate("AAABBBCCC"));
    }

}
