package lab_02;

import java.util.Scanner;

public class OddEvenNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the number: ");
        float number = scanner.nextFloat();

        if(number %2 ==0){
            System.out.println("This is an even number");
        }else
        System.out.println("This is an odd number");

    }
}
