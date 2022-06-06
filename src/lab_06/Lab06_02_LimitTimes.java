package lab_06;

import java.util.Scanner;

public class Lab06_02_LimitTimes {
    public static void main(String[] args) {
        String myPassword = "password123";
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        while (count < 3) {
            System.out.println("Please input Password: ");
            String password = scanner.next();

            if (password.contains(myPassword)) {
                System.out.println("Success!!!");
            } else {
                System.out.println("Password incorrect, please try again!");
            }
            count = count + 1;
        }

    }
}
