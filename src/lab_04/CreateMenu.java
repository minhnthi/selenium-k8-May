package lab_04;

import java.security.SecureRandom;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class CreateMenu {

    public static void main(String[] args) {

        int arrLength = 3;
        int[] arrNumber = new int[arrLength];

        for (int index = 0; index < arrLength; index++) {
            arrNumber[index] = new SecureRandom().nextInt(1000);
            System.out.println(arrNumber[index]);
        }

        boolean isContinuing = true;
        while (isContinuing) {
            System.out.println("==== MENU ====");
            System.out.println("1. Print all numbers\n ");
            System.out.println("2. Print maximum value\n");
            System.out.println("3. Print minimum value\n");
            System.out.println("4. Search number\n");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please select option:");
            int option = scanner.nextInt();

            if (option == 0) {
                isContinuing = false;
            } else if (option == 1) {
                System.out.println("All the numbers that we have in the array list:");
                for (int index = 0; index < arrLength; index++) {
                    System.out.println(arrNumber[index]);
                }
            } else {
                int min = arrNumber[0];
                int max = arrNumber[0];
                for (int index = 0; index < arrLength; index++) {
                    if (arrNumber[index] < min) {
                        min = arrNumber[index];
                    } else if (arrNumber[index] > max) {
                        max = arrNumber[index];
                    }
                }
                if (option == 2) {
                    System.out.println("The maximum number from array list: \n" + max);
                } else if ((option == 3)) {
                    System.out.println("The minimum number from array list: \n " + min);
                }
            }
            if (option == 4) {
                System.out.println("Please input a number: \n");
                int number = scanner.nextInt();
                boolean isFound = false;
                for (int index = 0; index < arrLength; index++) {
                    if (arrNumber[index] == number) {
                        System.out.printf("The number and its index: \n %d \n %d\n", number, index);
                        isFound = true;
                    }
                }
                if (!isFound) {
                    System.out.println("Number is not in the list");
                }
            }
            System.out.println("Please input the correct option!");
        }
        System.out.println("See you again");
    }
}