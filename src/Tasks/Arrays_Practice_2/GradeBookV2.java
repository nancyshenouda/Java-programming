package Tasks.Arrays_Practice_2;
/*
Gradebook ( Similar to MaxMinPrice from class)
Declare three arrays:1.String array which will hold names for the students (give values)
2.Int array which has the score of the student got in the quiz (give values)
3.Char array which will have some letter grade based on the score (empty)
4.Output the grade book at the end with all the information
Grade scale:
Above85: A
Above75:B
Above 65: C
Other: D
Ex: Mike |80 | B
 */
public class GradeBookV2 {
    public static void main(String[] args) {

        String []names = {"Fady", "Nancy", "Heaven", "Ramy"};
        int [] scores = {77, 88, 90, 60};
        char []grade= new char [names.length];

        for(int i=0;i<scores.length;i++){
            if(scores[i]>85){
                grade[i]='A';
            }
            if(scores[i]>75 && scores[i]<=85){
                grade[i]='B';

            }
            if(scores[i]>65 && scores[i]<=75){
                grade[i]='C';
            }
            if(scores[i]<65){
                grade[i]='D';
            }
            System.out.println(names[i] + "| " + scores[i] + "| " + grade[i]);
        }


    }
}
