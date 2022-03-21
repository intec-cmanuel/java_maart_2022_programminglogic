package be.intecbrussel.theory;

public class Scope {
    public static void main (String[] args) {

        int number1 = 10;
        System.out.println(number1);

        if (true) {
            int number2 = 20;
            System.out.println(number2);

            System.out.println(number1);
        }


        if (true) {
//            System.out.println(number2);
        }

//        System.out.println(number2);
    }
}




























