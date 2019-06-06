package com.halen.step1;

/**
 * @author Halen
 * @version 1.0
 * @date 2019/6/6 20:58
 * 剪绳子
 */
public class P_014 {

    //动态规划
    public int maxProductAfterCutting_solution1(int length) {
        if (length < 2) {
            return 0;
        }
        if (length == 2) {
            return 1;
        }
        if (length == 3) {
            return 2;
        }
        int[] products = new int[length + 1];
        products[0] = 0;
        products[1] = 1;
        products[2] = 2;
        products[3] = 3;
        int max = 0;
        for (int i = 4; i <= length; ++i) {
            max = 0;
            for (int j = 1; j <= i / 2; ++j) {
                int product = products[j] * products[i - j];
                if (max < product) {
                    max = product;
                }
                products[i] = max;
            }
        }
        max = products[length];

        return max;
    }

    //贪婪算法
    public int maxProductAfterCutting_solution2(int length) {
        if (length < 2) {
            return 0;
        }
        if (length == 2) {
            return 1;
        }
        if (length == 3) {
            return 2;
        }
        //尽可能多地剪去为3的绳子段
        int timeOf3 = length / 3;
        //当绳子最后剩下的长度为4的时候，不能再剪去长度为3的绳子段
        //此时更好的方法是把绳子剪成长度为2的两端，因为2*2 > 3* 1
        if (length - timeOf3 * 3 == 1) {
            timeOf3 -= 1;
        }
        int timeOf2 = (length-timeOf3*3) / 2;

        return (int) ((Math.pow(3, timeOf3)) * (Math.pow(2, timeOf2)));
    }

}
