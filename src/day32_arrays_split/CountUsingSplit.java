package day32_arrays_split;

public class CountUsingSplit {
    public static void main(String[] args) {
        String catsTypes = "bengal cat tabby cat persian cat no cat here some other cat type";

        String [] catsArray=catsTypes.split("cat");

        System.out.println("Number of cat = " + (catsArray.length-1));

        for( String type : catsArray){
            System.out.print(type + " ");
        }
        System.out.println();
        int count = 0;
         for(int i = 0; i < catsTypes.length() - 2; i++) {
         if(catsTypes.substring(i, i +3).equals("cat")) {
         count++;
         }
         }
         System.out.println("count of cats = " + count);

    }
}
