package be.intecbrussel.exercises;

public class Exercise1 {
    public static void main(String[] args) {

        boolean aBoolean = false;
        char aCharacter = 'd';
        byte aByte = 126;
        short aShortInteger = 1568;
        int anInteger = 1256456;
        long aLongInteger = 45631341L;
        float aDecimalNumber = 1256.32F;
        double aBigDecimalnumber = 12.365987451236;

//        System.out.println(aBoolean);
//        System.out.println(aCharacter);
//        System.out.println(aByte);
//        System.out.println(aShortInteger);
//        System.out.println(anInteger);
//        System.out.println(aLongInteger);
//        System.out.println(aDecimalNumber);
//        System.out.println(aBigDecimalnumber);

        anInteger = 0b0101_1100;
//        System.out.println(anInteger);

        final double PI = 3.14;
//        PI = 3.15;

        aShortInteger = 115;
        aByte = (byte) aShortInteger;
//        System.out.println(aShortInteger);
//        System.out.println(aByte);

        anInteger = aCharacter;
        System.out.println(anInteger);
    }
}
