package day39_wrapper_classes;

public class WrapperClasses {
    public static void main(String[] args) {
        int num=100;
        System.out.println("num = " + num);
        num+=num;
        System.out.println("num = " + num);
        Integer n = new Integer(500);
        System.out.println("n = " + n);
        System.out.println("Is n = 500? " + n.equals(400));
        System.out.println();

        Integer n2=1000;
        System.out.println(n2/50);
        // convert n2 to String
        String numStr = n2+ "";
        String numStr2 = n2.toString();// it has behaviour now
        System.out.println("numStr2 = " + numStr2);

// Declaring and Initializing Wrapper Classes
        Byte b1= new Byte((byte)5);
        Byte b2= 10;
        Short sh1 = new Short((short)40);
        Short sh2=50;
        Integer i1= new Integer(100);
        Integer i2= 200;
        Long l1= new Long (300l);
        Long l2=3455l;
        Float fl1= new Float (5.2f);
        Float fl2=45.3f;
        Double d1= new Double (33.5);
        Double d2=100.99;
        Character c1= new Character('a');
        Character c2= 'A';
        
        c1.toString();
        System.out.println("c2 = " + c2);
        Boolean bl1= new Boolean (true);
        Boolean bl2= false;





    }
}
