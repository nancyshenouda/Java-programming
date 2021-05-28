package day19_class_vs_object_strings;

public class StringStartsEndsWith {
    public static void main(String [] args){
        String word = "intellij idea";
        System.out.println(word.startsWith("i")); // true
        System.out.println(word.startsWith("in")); // true
        System.out.println(word.startsWith("intellij idea")); // true
        System.out.println("java".startsWith("ja")); //true
        System.out.println(word.endsWith("idea")); // true
        System.out.println(word.endsWith("intellij idea"));  //true
        System.out.println(word.startsWith("Int")); // false (Case sensitive)

        String name = "Maria";
        if(name.endsWith("a")){
            System.out.println("Maybe, it is a female name");

            String firstName = "Mr. Nadir";
            //firstName = "Mr. Nadir";
            //firstName = "Mrs. Nadir";
            //firstName= "Ms. Nancy";
            //firstName = "Sr. Nadir";

            if(firstName.startsWith("Dr.")){
                System.out.println("He must be a doctor");
        }else if(firstName.startsWith("Mr.")) {
                System.out.println("He must be a male");
            }else if(firstName.startsWith("Ms.")){
                System.out.println("She must be a single woman");
            }else if(firstName.startsWith("Mrs.")){
                System.out.println("She must be a married woman");

            }else if(firstName.startsWith("Sr.")){
                System.out.println("He must be a senior");}
            }

        String url = "www.amazon.com";
        if(url.endsWith(".com")){
            System.out.println("Commercial website");
        }else if(url.endsWith(".org")){
            System.out.println("Organization website");
        } else if(url.endsWith(".edu")){
            System.out.println("Educational website");
        } else if(url.endsWith(".us")){
            System.out.println("United States website");
        }
    }
}

