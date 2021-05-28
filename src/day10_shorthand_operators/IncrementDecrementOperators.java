package day10_shorthand_operators;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int i=1;
        System.out.println("i = " + i);
        i++;
        System.out.println("i = " + i);
        i++;
        i++;
        i++;
        System.out.println("i = " + i);
        
        int linesOfCode=15;
        System.out.println("linesOfCode = " + linesOfCode);
        linesOfCode=linesOfCode+1;
        System.out.println("linesOfCode = " + linesOfCode);
        linesOfCode++;
        System.out.println("linesOfCode = " + linesOfCode);
        linesOfCode+=1;
        System.out.println("linesOfCode = " + linesOfCode);
        ++linesOfCode;
        System.out.println("linesOfCode = " + linesOfCode);
        
        linesOfCode=linesOfCode-1;
        linesOfCode--;
        linesOfCode-=1;
        --linesOfCode;
        System.out.println("linesOfCode = " + linesOfCode);
        
        int apples=5;
        apples++;
        apples+=1;
        apples--;
        System.out.println("apples = " + apples);
        
        char letter='a';
        System.out.println("letter = " + letter);
        letter++;
        System.out.println("letter = " + letter);
        ++letter;
        System.out.println("letter = " + letter);
        --letter;
        --letter;
        --letter;
        System.out.println("letter = " + letter);
        
        

    }
}
