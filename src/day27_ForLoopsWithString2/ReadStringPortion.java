package day27_ForLoopsWithString2;

public class ReadStringPortion {

    public static void main(String[] args) {

        String list = "cat,car,cat,red_car,java,selenium";

       // int i = 0;
        for (int i = 0; i< list.length()-2 ; i++ ){
        //System.out.print(list.substring(i, i+3) + " ") ;
            String part = list.substring(i, i + 3);
        if (part.equals("cat") || part.equals("car")) {
            System.out.println("cat or car found");
        }
        }
    }
}

      //  System.out.println(list.substring(i,i+3)); // the last index is not included (,= 3)
      //  i++;
      //  System.out.println(list.substring(i,i+3));
       // i++;
      //  System.out.println(list.substring(i,i+3));
       // i++;
      //  System.out.println(list.substring(i,i+3));
       // i++;
      //  System.out.println(list.substring(i,i+3));
        // i++;


