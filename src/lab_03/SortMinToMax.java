package lab_03;

import java.util.Arrays;
import java.util.Scanner;

public class SortMinToMax {

    public static void main(String[] args) {

        int[] intArr = {12, 34, 1, 16, 28};
        int arrLength = intArr.length;
        System.out.println("This is the initial integer array:");
        System.out.println(Arrays.toString(intArr));
        for (int unSortedIndex = arrLength - 1; unSortedIndex > 0; unSortedIndex--) {
            for (int index = 0; index < unSortedIndex; index++) {
                if (intArr[index] > intArr[index + 1]) {
//                    int tmp = intArr[index];
//                    intArr[index] = intArr[index+1];
//                    intArr[index +1] = tmp;

                    intArr[index] = intArr[index] + intArr[index + 1];
                    intArr[index + 1] = intArr[index] - intArr[index + 1];
                    intArr[index] = intArr[index] - intArr[index + 1];
                }
            }
        }
        System.out.println("The sort integer array form Min to Max is: ");
        System.out.println(Arrays.toString(intArr));
    }
}
