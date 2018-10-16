package utils;

import java.util.Arrays;

/**
 * @Author: yangdingshan
 * @Date: 2018/9/30 13:08
 * @Description: 查到工具类
 */
public class LookMethod {

    /**
     * 二分查找法
     * 非递归-常规查找
     * @param a
     * @return
     */
    public static int binaryLook(int a, int[] array) {
        Arrays.sort(array);
        int min = 0;
        int max = array.length - 1;
        while (min <= max) {
            int middle = (min + max) / 2;
            if (a < array[middle]) {
                max = middle - 1;
            } else if (a > array[middle]) {
                min = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    /**
     *
     * @param a
     * @param array
     * @return
     */
    public static int binaryLookRecursion(int a, int[] array, int beginIndex, int endIndex) {
        Arrays.sort(array);
        int midIndex = (beginIndex + endIndex) / 2;
        if (beginIndex > beginIndex || a < array[beginIndex] || a > array[endIndex]) {
            return -1;
        }
        if (a < array[midIndex]) {
            return binaryLookRecursion(a, array, beginIndex, midIndex -1);
        } else if (a > array[midIndex]) {
            return binaryLookRecursion(a, array, midIndex + 1, endIndex);
        } else {
            return midIndex;
        }
    }

}
