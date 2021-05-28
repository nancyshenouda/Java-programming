package Tasks.Arrays_Practice_2;
/*
Gradebook ( Similar to MaxMinPrice from class)
Declare three arrays:
1.String array which will hold names for the students (give values)
2.Int array which has the score of the student got in the quiz (give values)
3.Char array which will have some letter grade based on the score (empty)
4.Output the gradebook at the end with all the information
Grade scale:
Above85: A
Above75:B
Above 65: C
Other: D
 */
public class GradeBook {
    public static void main(String[] args) {
String [] names = {"Nancy", "Fady", "Ramy", "Heaven"};
int [] scores = {77, 88, 95, 60};
char grade='A';

for(int i=0; i<names.length;i++){
    if(scores[i]>85){
        grade='A';
    }
   else if(scores[i]>75 && scores[i]<85){
        grade='B';
    }
   else if(scores[i]>65 &&  scores[i]<75){
        grade='C';
    }else{
        grade='D';
    }
    System.out.println(names[i]+ " got a score of " + scores[i] + " and the grade is -  " + grade);
}

}

    }

