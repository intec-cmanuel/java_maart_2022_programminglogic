package be.intecbrussel.theory;

import java.util.Scanner;

public class Switches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month) {

            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10:
            case 12:
                System.out.println(31);
                break;

            case 2 :
                System.out.println(28);
                break;

            case 4 :
            case 6 :
            case 9 :
            case 11:
                System.out.println(30);
                break;

            default :
                System.out.println("Invalid month");
                break;
        }


//        if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)) {
//            System.out.println(31);
//        } else if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
//            System.out.println(30);
//        } else if (month == 2) {
//            System.out.println(28);
//        }

//        if (month == 1) {
//            System.out.println(31);
//        } else if (month == 2) {
//            System.out.println(28);
//        } else if (month == 3) {
//            System.out.println(31);
//        } else if (month == 4) {
//            System.out.println(30);
//        } else if (month == 5) {
//            System.out.println(31);
//        } else if (month == 6) {
//            System.out.println(30);
//        } else if (month == 7) {
//            System.out.println(31);
//        } else if (month == 8) {
//            System.out.println(31);
//        } else if (month == 9) {
//            System.out.println(30);
//        } else if (month == 10) {
//            System.out.println(31);
//        } else if (month == 11) {
//            System.out.println(30);
//        } else if (month == 12) {
//            System.out.println(31);
//        }

    }
}
