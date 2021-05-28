package day12_boolean_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {

        int currentSpeed = 45;
        int speedLimit = 55;
        boolean isSpeeding = currentSpeed>speedLimit;
        boolean isNotSpeeding= currentSpeed<speedLimit;
        System.out.println(currentSpeed > speedLimit);
        System.out.println(speedLimit>currentSpeed);
        System.out.println(speedLimit==currentSpeed);
        System.out.println("Are you speeding? - " + isSpeeding);
        System.out.println("Are you Not Speeding - " + isNotSpeeding);
        System.out.println("Current Speed " + currentSpeed + "mph");
        System.out.println("Speed Limit " + speedLimit+ "mph");

        currentSpeed=65;
        isSpeeding=currentSpeed>speedLimit;
        System.out.println("Are you speeding? - " + isSpeeding);

        double accountBalance=250.25;
        double itemPrice=100.99;
        System.out.println(accountBalance >=itemPrice);
        System.out.println("Can i afford? - "+  (accountBalance>=itemPrice));
        
        boolean canAfford = accountBalance>=itemPrice;
        System.out.println("canAfford = " + canAfford);
        itemPrice=300;
        System.out.println("canAfford = " + canAfford);

        accountBalance=accountBalance-itemPrice;
        boolean isBroke =accountBalance <= 0;
        System.out.println("isBroke = " + isBroke);







        
        



    }
}
