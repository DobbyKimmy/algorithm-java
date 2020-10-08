package lesson1;

import lesson1.utils.SwapUtils;

public class SelectionSort implements MySort {

    @Override
    public void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            SwapUtils.swap(arr, i, minIndex);
        }
    }
}
