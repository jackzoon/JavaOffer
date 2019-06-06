package com.halen.step1;

/**
 * @author Halen
 * @version 1.0
 * @date 2019/6/6 21:34
 * 二进制中1的个数
 */
public class P_015 {

    public int NumberOf1_1(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public int NumberOf1_2(int n) {
        int count = 0;
        int flag = 1;
        while (flag != 0) {
            if ((n & flag) != 0) {
                count++;
            }
            flag = flag << 1;
        }
        return count;
    }

    public int NumberOf1_3(int n) {
        int count = 0;
        while (n != 0) {
            ++count;
            n = (n-1) & n;
        }
        return count;
    }
}
