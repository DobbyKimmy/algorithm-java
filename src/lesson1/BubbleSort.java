package lesson1;

import lesson1.utils.SwapUtils;

public class BubbleSort implements MySort {

    @Override
    public void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        // [5,4,3,1,2]
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    SwapUtils.fastSwap(arr, j, j + 1);
                }
            }
        }
    }
}
