package Tasks.Saim_tasks_unit_two;
/*
[Sport]

Given a sport you play at the community center you will have to pay some enterance fee.

    Soccer or Tennis fee is: 100
    Otherwise fee is: 50
 */
public class Sports {
    public static void main(String[] args) {
        String Sport = "Soccer";
        int fees = 100;

        fees = (Sport.equals("Tennis")) || (Sport.equals("Soccer")) ? 100 : 50;
        System.out.println(fees);


    }
}
