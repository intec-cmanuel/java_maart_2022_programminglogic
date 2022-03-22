package be.intecbrussel.exercises;

public class Toufik {
    public static void main(String[] args) {
        char letter = 'A';
        while (letter != ('Z' + 1)) {
            System.out.println(letter++);
        }

        for (char letter1 = 'A'; letter1 != ('Z' +1); letter1++) {
            System.out.println(letter1);
        }
    }
}
