package day15_logicalOps_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade='A';
        if(grade=='A' || grade=='B' || grade=='C') {
            System.out.println("passed with grade " + grade);
        }else if(grade=='D') {
            System.out.println("qualify for retake");
        }else if(grade=='E'){
            System.out.println("fail with grade " + grade);
        }else{
            System.out.println("Invalid Grade");}
    }
}
