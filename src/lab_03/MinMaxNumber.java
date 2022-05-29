package lab_03;

public class MinMaxNumber {

    public static void main(String[] args) {

        int arrayLength = 5;
        int[] intArray = {1, 2, 3, 4, 5};

        int min = intArray[0];
        int max = intArray[0];

        for (int index = 0; index < intArray.length; index++) {
            if (intArray[index] < min) {
                min = intArray[index];
            } else if (intArray[index] > max) {
                max = intArray[index];
            }
        }
        System.out.println("The Minimum number is: " + min);
        System.out.println("The Maximum number is: " + max);
    }
}
