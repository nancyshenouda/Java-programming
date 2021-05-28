package day38_methods;

public class StringUtilTest {
    public static void main(String[] args) {
        //calling method isNullOrEmpty from StringUtils class
        String userName = "";
        if (StringUtils.isNullOrEmpty(userName)) {
            System.out.println("Fail: userName cannot be null or empty");
        }
        //calling method isPalindrome from StringUtils class
            System.out.println("isPalindrome 'civic' = " + StringUtils.isPalindrome("civic"));
            System.out.println("isPalindrome 'nancy' = " + StringUtils.isPalindrome("cybertek"));

            // calling method reverse from Reversed class
            System.out.println("Reversed str 'java' = " + Reverse.reverse("java"));

        }
    }



