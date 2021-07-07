package day60_exceptions;

public class MultiCatchBlock {
    public static void main(String[] args) {
        String word = "java";

        //String word = null;
        try {
            System.out.println(10/0);
            System.out.println("word = " +word);
            System.out.println("length = " + word.length());
            System.out.println(word.substring(20));
        } catch(NullPointerException e){
            System.out.println("nullPointerException caught and handled, please check if String has value");
        } catch(StringIndexOutOfBoundsException e){
            System.out.println("Index is wrong, please check if you have entered a valid index");
        }catch(Throwable t){ // parent of all exceptions - parent type must be at the end
            System.out.println("Exception is caught");
            System.out.println("Reason = "+ t.getMessage());
        }

            System.out.println("---More code after try and catch----");

    }
}
