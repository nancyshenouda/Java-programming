package day37_methods_overloading;

public class MethodPractice {
    public static void main(String[] args) {
        System.out.print(repeatString("java",5,'~'));
        System.out.println();
        System.out.println(repeatString("hi",5,'|'));
        System.out.println();
        System.out.println(repeatString("I can do it\n ",10,'-'));


    }
    public static String repeatString(String word, int times, char delimiter){
        String retValue="";
        for (int i=0;i<=times;i++){
            if(i==times){
            //retValue+=word;
            }
            retValue+=word+delimiter;
        }
        return retValue;
    }
}
