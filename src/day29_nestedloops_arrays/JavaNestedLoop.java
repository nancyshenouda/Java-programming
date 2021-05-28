package day29_nestedloops_arrays;

public class JavaNestedLoop {
    public static void main(String[] args) {
        String word = "java";

        for(int i=0; i<word.length();i++){
            for(int n=0; n<=i; n++){
                System.out.print(word.charAt(n));
            }
            System.out.println();
        }
        System.out.println("****************");
        //reverse

        for(int i=word.length()-1; i>=0;i--){
            for(int n=0; n<=i; n++){
                System.out.print(word.charAt(n));
            }
            System.out.println();
        }
        System.out.println("*************************");
        for(int i=0; i<word.length();i++){
            for(int j=i;j<word.length();j++){
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }
    }
}
