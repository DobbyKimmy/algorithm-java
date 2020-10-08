package lesson1.test;

import lesson1.BubbleSort;
import lesson1.InsertionSort;
import lesson1.MySort;
import lesson1.SelectionSort;
import lesson1.utils.SortComparatorUtils;

public class TestSort {
    public static void main(String[] args) {
        testInsertionSort();
        testBubbleSort();
        testSelectionSort();
    }
    public static void testSelectionSort(){
        MySort selectionSort = new SelectionSort();
        SortComparatorUtils.test(5000, 100, 100, selectionSort);
        System.out.println("SelectionSort test is success");
    }

    public static void testBubbleSort(){
        MySort bubbleSort = new BubbleSort();
        SortComparatorUtils.test(5000, 100, 100, bubbleSort);
        System.out.println("BubbleSort test is success");
    }

    public static void testInsertionSort(){
        MySort insertionSort = new InsertionSort();
        SortComparatorUtils.test(5000, 100, 100, insertionSort);
        System.out.println("InsertionSort test is success");
    }
}
