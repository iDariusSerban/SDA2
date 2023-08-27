package AlgoritmiSortare;

import java.util.Arrays;

public class BubbleSort {
//    Repeat n-1 times
//    For i from 0 to n-2
//    If numbers[i] and numbers[i+1] out of order
//    Swap them

    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 4, 1, 6, 0, 3};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
