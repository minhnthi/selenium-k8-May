package lab_02;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input height: ");
        float height = scanner.nextFloat();
        System.out.println("Please input weight: ");
        float weight = scanner.nextFloat();

        float bmi = weight / (height * 2);

        if (bmi <= 18.5){

            System.out.println("Underweight!");
            double bmiIncrease = 18.5 - bmi;
            System.out.println(bmi);
            double weighIncrease = bmiIncrease * height *2;
            System.out.println("You should increase at least: "+weighIncrease + " "+ "kilogram");

        } else if (bmi <= 24.9) {
            System.out.println(bmi);
            System.out.println("Normal weight!");

        } else if (bmi <= 29.9) {

            System.out.println("Overweight");
            double bmiDecrease = 29.5 - bmi;
            System.out.println(bmi);
            double weighDecrease = bmiDecrease * height *2;
            System.out.println("You should decrease approximate: "+weighDecrease +" "+ "kilogram");

        }else {

            System.out.println("Obesity!!!");
            double bmiDec = bmi - 30;
            System.out.println(bmi);
            double weighDec =  bmiDec* height *2;
            System.out.println("You should decrease at least: "+weighDec +" "+ "kilogram");
        }
    }
}
