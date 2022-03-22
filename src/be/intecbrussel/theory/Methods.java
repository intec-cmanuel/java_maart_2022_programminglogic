package be.intecbrussel.theory;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        // Print of de som van twee getallen even of oneven is.
        // Test voor de gevallen: 10+15 10+20 23+27 0+10 0+0

        printIfSumIsEvenOrOdd(10, 20);
        printIfSumIsEvenOrOdd(10, 15, 20);


        int number1 = askUserForInteger();
        int number2 = askUserForInteger();

        printIfSumIsEvenOrOdd(number1, number2);
    }

    public static int askUserForInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey user, give me a number.");
        int number = scanner.nextInt();
        return number;
    }

    public static void printIfSumIsEvenOrOdd(int number1, int number2, int number3) {
        printIfSumIsEvenOrOdd(number1, number2 + number3);
    }

    public static void printIfSumIsEvenOrOdd(int number1, int number2) {
        int sum = number1 + number2;
        if (sum % 2 == 0) {
            System.out.println(number1 + " + " + number2 + ": " + "De sum is even.");
        } else {
            System.out.println(number1 + " + " + number2 + ": " + "De sum is oneven.");
        }
    }

}
