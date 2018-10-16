package utils;

import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: yangdingshan
 * @Date: 2018/9/30 13:32
 * @Description:
 */
public class LookMethodTest {

    @Test
    public void binaryTest() {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("请输入查找的数字：");
        int i = 111;
        int[] a = new int[]{1,2,4,5,3,4,5,8,9,12,11,15};
        int b = LookMethod.binaryLook(i, a);
        if (b == -1) {
            System.out.println("数组没有该值");
        } else {
            System.out.println("存在");
        }
    }

    @Test
    public void binaryTestR() {
        int i = 111;
        int[] a = new int[]{1,2,4,5,3,4,5,8,9,12,11,15};
        int b = LookMethod.binaryLookRecursion(i, a, 0, a.length - 1);
        if (b == -1) {
            System.out.println("数组没有该值");
        } else {
            System.out.println("存在");
        }
    }

    @Test
    public void bubbleSortTest() {
        int[] a = new int[]{1,2,4,5,3,4,5,8,9,12,11,15};
        a = ArraySortUtil.bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }

    @Test
    public void selectSrotTest() {
        int[] a = new int[]{1,2,4,5,3,4,5,8,9,12,11,15};
        a = ArraySortUtil.selectSort(a);
        System.out.println(Arrays.toString(a));
    }

    @Test
    public void quickSortTest() {
        int[] a = new int[]{2,5,0,1,4};
        ArraySortUtil.quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
