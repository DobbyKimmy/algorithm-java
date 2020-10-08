package lesson1.test;

import lesson1.BinarySearch;

public class TestBinarySearch {
    public static void main(String[] args) {
        if(!binarySearchExistTest()){
            throw new RuntimeException("binarySearchExist test is fail");
        }
        System.out.println("all test success");
    }

    public static boolean binarySearchExistTest() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        boolean success = true;
        if (!BinarySearch.exist(arr, 1) || BinarySearch.exist(arr, 0)) {
            success = false;
        }
        return success;
    }
}
