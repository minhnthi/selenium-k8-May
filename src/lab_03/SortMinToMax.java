package lab_03;

import java.util.Scanner;

public class SortMinToMax {

    public static void main(String[] args) {

        int[] intArr = {12, 34, 1, 16, 28};
        int tempSort;
        for (int i = 0; i < intArr.length; i++) {
            for (int j = i + 1; j < intArr.length; j++) {
                if (intArr[i] > intArr[j]) {
                    tempSort = intArr[j];
                    intArr[j] = intArr[i];
                    intArr[i] = tempSort;
                }
            }
        }
        System.out.println("The sort integer array from min to max is:");
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
    }
}
