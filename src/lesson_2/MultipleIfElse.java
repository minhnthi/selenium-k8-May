package lesson_2;

import java.util.Scanner;

public class MultipleIfElse {

    public static void main(String[] args) {
        // <18 18-55 >55
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your Age: ");
        int clientAge = scanner.nextInt();

        //Nested if..else
        if(clientAge <18 ){
            System.out.println("No sale");
            if (clientAge<=14){
                System.out.println("Calling 113");
            }
        }else if(clientAge <= 55){
            System.out.println("Unlimited");
        }else {
            System.out.println("2 bottle");
        }
    }
}
