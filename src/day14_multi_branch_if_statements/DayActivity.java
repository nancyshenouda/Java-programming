package day14_multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args) {
        String weather = "snowy";
        //"rainy","snowy","windy";
        if(weather.equals("sunny")) {
            System.out.println( weather + "- go to park, and code java");
        }else if(weather.equals("rainy")){
                System.out.println(weather + " - Stay home, drink tea, and code java");
            }else if(weather.equals("snowy")){
            System.out.println(weather + " - clean the car then build snowman, drink hot chocolate, and code java");
        }else if(weather.equals("windy")){
            System.out.println(weather + " - get ready for power loss, fly a kite and code java");
        }else{
            System.out.println(weather + "Just keep coding java");
        }


    }
}
