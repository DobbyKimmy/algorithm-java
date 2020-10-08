package lesson1;

public class BinarySearch {
    /**
     * 判断在一个有序数组中，某个数字是否存在
     *
     * @param sortedArr 一个已排序的数组
     * @param num       要寻找的数字
     * @return num存在返回 true；num不存在返回false
     */
    public static boolean exist(int[] sortedArr, int num) {
        if (sortedArr == null || sortedArr.length == 0) {
            return false;
        }
        int l = 0;
        int r = sortedArr.length - 1;
        int mid = 0;
        while (l < r) {
            mid = l + ((r - l) >> 1);
            if (sortedArr[mid] == num) {
                return true;
            } else if (sortedArr[mid] > num) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return sortedArr[l] == num;
    }

    /**
     * 在排序数组arr上，找到满足>=value最左的位置
     * 举例:
     * [1,2,4,4,4,4,4,5,5,6,6]
     * 找到满足 >=3 最左边的位置
     * 返回 2
     *
     * @param arr   一个已排序的数组
     * @param value
     * @return 找到满足>=value的位置的索引值
     */

}
