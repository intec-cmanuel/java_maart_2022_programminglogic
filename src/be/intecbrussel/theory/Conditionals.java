package be.intecbrussel.theory;

public class Conditionals {
    public static void main(String[] args) {

        int number1 = 100;
        int number2 = 15;

        /*
            if (conditie) {
             CODEBLOCK als conditie true is
            } else {
             CODEBLOCK als conditie false is
            }
         */

        // else {...} is optioneel!
//        if (number1 > number2) {
//            System.out.println("number1 is greater than number2");
//        } else {
//            if (number2 > number1) {
//                System.out.println("number2 is greater than number1");
//            } else {
//                System.out.println("The numbers are equal");
//            }
//        }

        if (number1 > number2) {
            System.out.println("number1 is greater than number2");
        } else if (number2 > number1) {
            System.out.println("number2 is greater than number1");
        } else {
            System.out.println("The numbers are equal");
        }

    }
}
