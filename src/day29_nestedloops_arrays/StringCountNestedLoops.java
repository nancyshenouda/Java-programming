package day29_nestedloops_arrays;

/*
1) find duplicates and count
2) find unique characters(appearing only once)
3) print character and number of occurences.
 */
public class StringCountNestedLoops {
    public static void main(String[] args) {
        String word = "java";
        String storage ="";

        for(int i=0; i<word.length();i++){
            char outer = word.charAt(i);
            int count=0;
            for(int j=0; j<word.length();j++){
               char inner = word.charAt(j);
               if(outer==inner){
                   count++;
               }
            }
            if (!storage.contains(word.charAt(i) + "")) {
                storage += word.charAt(i) + " = " + count + "\n";

            }
        }
        System.out.println(storage);

//        for(int minute =0; minute<=5; minute++){
//            for(int seconds =1; seconds<=59; seconds++){
//                System.out.println(minute + ":" + seconds);
//            }
//            System.out.println();
//        }



    }
}
