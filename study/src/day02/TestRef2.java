package day02;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: thog
 * @Date: 2022/8/10 15:56
 */
public class TestRef2 {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }

    public static void change(int[] array) {
        // 将数组的第一个元素变为0
        array[0] = 0;
    }
}
