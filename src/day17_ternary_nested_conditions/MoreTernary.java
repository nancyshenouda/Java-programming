package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate=50;
        String reply = (hourlyRate >50 )? "Accept" : "Reject";
        System.out.println("reply = " + reply);

        String todayClass = "Java";
        String teacher = (todayClass.equals("Java"))? "Saim /Morudil"  : "Nadir";
        System.out.println("teacher = " + teacher);



        boolean isEligibleToDrive = true;
        String driving = (isEligibleToDrive)? "have DL, he can drive" : "No DL, he cannot drive";
        System.out.println("driving = " + driving);
        



    }
}
