package be.intecbrussel.theory;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // While Loop
        int userChoice1;
        System.out.println("Are you hungry? 1: yes | 2: no");
        userChoice1 = scanner.nextInt();

        while (userChoice1 == 1) {

            System.out.println("get some pizza");

            System.out.println("Are you hungry? 1: yes | 2: no");
            userChoice1 = scanner.nextInt();
        }

        //DoWhile Loop
        int userChoice;
        do {
            System.out.println("Are you hungry? 1: yes | 2: no");
            userChoice = scanner.nextInt();

            System.out.println((userChoice == 1) ? "get some pizza" : "not hungry anymore");

        } while (userChoice == 1);

    }
}
