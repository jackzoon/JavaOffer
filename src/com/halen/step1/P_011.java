package com.halen.step1;

/**
 * @author Halen
 * @version 1.0
 * @date 2019/5/31 18:11
 * 旋转数组的最小数字
 */
public class P_011 {
    public int minNumberInRotateArray(int [] array) {
        if (array.length == 0) {
            return 0;
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public int minNumberInRotateArray_2(int [] array) {
        if (array.length == 0) {
            return 0;
        }
        int left = 0;
        int right = array.length - 1;
        int mid = 0;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (array[mid] > array[right]) {
                left = mid + 1;
            } else if (array[mid] == array[right]) {
                right = right - 1;
            } else {
                right = mid;
            }
        }
        return array[left];
    }
}
