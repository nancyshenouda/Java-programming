package day31_arrays;

public class CharArray {
    public static void main(String[] args) {

        char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ' ,'f', 'u', 'n'};

       for ( char charArrays  : letters  ){
           System.out.print(charArrays + " ");
        }
        System.out.println();
       String sentence = new String(letters);
        System.out.println("sentence = " + sentence);
        System.out.println();


        String item = "Wooden Spoon";
        char [] items = item.toCharArray();
        System.out.println(items);
        System.out.println(items.length);// the length of the chars in the array
        System.out.println();

        for(char itemsArray : items){
            System.out.print(itemsArray + " ");
        }
        System.out.println();
        //                      0       1           2       3       4           5
        String [] fruits = {"bananas", "apples", "kiwi", "mango", "papaya", "strawberry"};
        String fruitStr = "";
        for(String itemS : fruits) {
           // System.out.print(itemS + "-");
            fruitStr += itemS +"-";
        }

        System.out.println("fruitStr = " + fruitStr);
        System.out.println();

        String [] languages = {"java", "python", "c++", "sql", "ruby", "javascript"};

        System.out.println(String.join("|", languages));
        System.out.println();
        String str = "git";

        String [] words = {"one", "two", "three"};
        String sentences = String.join("! ", words);// .join method prints the array String items together/
        System.out.println("sentences = " + sentences);
        
    }

}
