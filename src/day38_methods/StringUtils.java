package day38_methods;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println(isNullOrEmpty(null));
        String word = null;
        //System.out.println(word.toUpperCase());// it will give null pointer exception error
        //System.out.println(word.isEmpty()); //it will give null pointer exception error
        System.out.println("word = " + word +  " = "+  isNullOrEmpty(word));  // null
        word="";
        System.out.println("word = " + word +  " = " + isNullOrEmpty(word)); // empty

    }

    public static boolean isNullOrEmpty(String str) {
        if (str ==null || str.isEmpty()) {
            // null has to be first because it needs to be checked first with ||.
            // if it is checked at the end, it will give NullPointerException
            return true;
        }
            return false;
        }
        //return str == null || str.isEmpty(); we can also use this way instead of if condition
        public static boolean isPalindrome(String str) {

            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length()-1-i)) {
                    return false;
                }
            }
            return true;
        }


    }

/*
Scanner input = new Scanner(System.in);
    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

    //TODO: Write your code below
int count=0;
    for(int even:nums){
      if(even%2==0){
count++;
      }

    }
    System.out.println(count);
  }
}
 */