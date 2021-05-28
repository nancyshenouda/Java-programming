package day08_casting_scanner;

public class CastingExamples {
    public static void main(String [] args){
        byte num1=100;
        short num2=num1;
        int num3=num2;
        int num4=1000;
        long num5=num4;
        float num6=124.4F;
        double num7=num6;

        int num8=3456;
        double num9=num8;


       System.out.println("++++++++++++++++++++++++");
       int num10=22;
       byte num11=(byte)num10;
       short num12=(short)num10;
       System.out.println("num10 = " + num10);
       System.out.println("num11 = " + num11);
       System.out.println("num12 = " + num12);
       double num13=55.3;
       float num14=(float)num13;
       System.out.println("num13 = " + num13);
       System.out.println("num14 = " + num14);

       double num15=1234.5;
       int num16=(int)num15;
        System.out.println("num15 = " + num15);
        System.out.println("num16 = " + num16);
        
        int num17=300;
        byte num18=(byte)num17;
        System.out.println("num17 = " + num17);
        System.out.println("num18 = " + num18);
        
        int numLetter='a';
        System.out.println("numLetter = " + numLetter);

        char letter='N';
        int numbLetter=letter;
        System.out.println("letter = " + letter);
        System.out.println("numbLetter = " + numbLetter);
        char ch='J';
        int chNum=ch;
        System.out.println(chNum);

        double d=10.5;
        short sh=(short)d;
        System.out.println(sh);

        double Z=123;
        System.out.println(Z);




    }
}
