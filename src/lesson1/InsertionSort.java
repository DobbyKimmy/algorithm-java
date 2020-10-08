package lesson1;

import lesson1.utils.SwapUtils;

public class InsertionSort implements MySort {

    @Override
    public void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        // [5,4,1,3,2]
        for (int i = 1, j; i < arr.length; i++) {
            j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                SwapUtils.fastSwap(arr, j, j - 1);
                j--;
            }
        }
    }
}
