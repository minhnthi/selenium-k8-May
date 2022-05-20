package lesson_2;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {

        final int EXPECTED_TIME = 7;
        //EXPECTED_TIME = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input arrival time: ");
        int arrivalTime = scanner.nextInt();

        // == != > < >= <= comparison operators

        boolean isHeOnTime = arrivalTime == EXPECTED_TIME;

        System.out.println("Go home");
        System.out.println("Go to the coffee shop");

        //isHeOnTime is a expression that can return a boolean value
//        if(isHeOnTime){
//            System.out.println("Let's talk");
//        }else {
//            System.out.println("write a letter");
//        }
        String msg = isHeOnTime ? "Let's Talk" : "Write a letter";
        System.out.println(msg);

        System.out.println("Go home");
        System.out.println("Go to the coffee shop");

        //Ternary operator || Toan tu ba ngoi

    }
}
