package be.intecbrussel.theory;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {

        // null = geen object = de afwezigheid van een object
        Scanner scanner = new Scanner(System.in);
        int number1;
        int number2;

        number1 = scanner.nextInt();
        number2 = scanner.nextInt();

        // System.out.println("Operator: %");
        // System.out.println(number1 % number2);

        //number1++;
        //++number2;

        // System.out.println(number1++); // Gebruik number1 EN DAN verhoog number1
        // System.out.println(++number2); // Verhoog number2 EN DAN gebruik number2
        // System.out.println(-number2);

        // System.out.println("!=");
        // System.out.println(number1 != number2); // ! =

        boolean bool1 = true;
        boolean bool2 = false;

        // System.out.println("||");
        // System.out.println(bool1 || bool2);
        // System.out.println(bool1 && bool2); // & Naam: Ampersand

        // System.out.println(!(bool1 || bool2));

        number1 += 5; // number1 = number1 + 5
        number2 *= 2; // number2 = number2 * 2
    }
}


























