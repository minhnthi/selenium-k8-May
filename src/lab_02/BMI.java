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
            float bmiIncrease = 18.5F - bmi;
            float weighIncrease = bmiIncrease * height *2;
            System.out.println("You should increase at least: "+weighIncrease + " "+ "kilogram");

        } else if (bmi <= 24.9) {
            System.out.println("Normal weight!");

        } else if (bmi <= 29.9) {

            System.out.println("Overweight");
            float bmiDecrease = 29.5F - bmi;
            float weighDecrease = bmiDecrease * height *2;
            System.out.println("You should decrease approximate: "+weighDecrease +" "+ "kilogram");

        }else {

            System.out.println("Obesity!!!");
            float bmiDec = bmi - 30.0F;
            float weighDec =  bmiDec* height *2;
            System.out.println("You should decrease at least: "+weighDec +" "+ "kilogram");
        }
    }
}
