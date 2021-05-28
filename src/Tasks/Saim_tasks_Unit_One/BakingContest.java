package Tasks.Saim_tasks_Unit_One;

/*
Baking contest]

You are in a baking contest. Your cookies will be rated by 3 judges.
The 3 scores from the judges will be averaged and compared with the 2 other people in the contest.

Use variables: judge score 1, judge score 2, judge score 3, other person score 1, other persons score 2

If your score is more than both of the other people then print "First place!"
If your score is more then one other person then print "Second place"
If your score is less than both of the other people then print "Third place"
 */
public class BakingContest {
    public static void main(String[] args) {

        int judgeScore1=5;
        int judgeScore2=5;
        int judgeScore3=5;
        int otherPersonScore1=20;
        int otherPersonScore2=17;
        int score=judgeScore1 + judgeScore2 + judgeScore3;
        if(score >otherPersonScore1 || score > otherPersonScore2 ) {
            System.out.println("First place");
        }else if(score >otherPersonScore1 || score < otherPersonScore2 ) {
            System.out.println("Second place");
        }else if(score < otherPersonScore1 && score <otherPersonScore2 ){
            System.out.println("Third place");}
    }
}
