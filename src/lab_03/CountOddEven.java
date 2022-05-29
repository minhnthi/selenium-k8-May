package lab_03;

public class CountOddEven {

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};

        int numberOdd = 0;
        int numberEven = 0;

        for (int index = 0; index < intArray.length; index++) {
            if (intArray[index] % 2 == 0) {
                numberEven = numberEven + 1;
            } else {
                numberOdd = numberOdd + 1;
            }
        }
        System.out.println("The number of even number is: " + numberEven);
        System.out.println("The number of odd number is: " + numberOdd);


    }
}
