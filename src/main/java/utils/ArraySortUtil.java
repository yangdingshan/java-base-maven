package utils;

/**
 * @Author: yangdingshan
 * @Date: 2018/9/30 14:09
 * @Description: 数组排序方法
 */
public class ArraySortUtil {

    /**
     * 冒泡排序
     * @param arr
     * @return
     */
    public static int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * 选择排序
     * @param arr
     * @return
     */
    public static int[] selectSort(int[] arr) {

        for (int i = 0; i < arr.length -1; i++) {
            int k = i;
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[j] < arr[k]) {
                    k = j;
                }
            }
            if (k != i) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
            }
        }
        return arr;
    }


    /**
     * 快速排序
     *
     *  从数列中挑出一个元素，称为“基准”
     *  重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。在这个分割之后，
     *  该基准是它的最后位置。这个称为分割（partition）操作。
     *  递归地把小于基准值元素的子数列和大于基准值元素的子数列排序。
     *
     * @param numbers
     * @param start
     * @param end
     */
    public static void quickSort(int[] numbers, int start, int end) {
        if (start < end) {
            // 选定的基准值（第一个数值作为基准值）
            int base = numbers[start];
            // 记录临时中间值
            int temp;
            int i = start, j = end;
            do {
                while ((numbers[i] < base) && (i < end)) {
                    i++;
                }
                while ((numbers[j] > base) && (j > start)) {
                    j--;
                }
                if (i <= j) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                    i++;
                    j--;
                }
            } while (i <= j);
            if (start < j) {
                quickSort(numbers, start, j);
            }
            if (end > i) {
                quickSort(numbers, i, end);
            }
        }
    }
}
