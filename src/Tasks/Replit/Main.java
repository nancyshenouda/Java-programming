package Tasks.Replit;
import java.util.*;

class Main{
    //create your method below
    public static List<Integer> appendPosSum(List<Integer> nums) {

        List<Integer> positive = new ArrayList();

        int sum=0;
        for (int each : nums) {
            if (each > 0) {
                sum += each;
                positive.add(each);
            }
        }
        positive.add(sum);
        return positive;
    }

    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(appendPosSum(list));

    }

}