package com.halen.step1;

/**
 * 斐波那契数列
 */
public class P_009 {

    public int Fibonacci(int n) {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    public int Fibonacci_2(int n) {
        int[] res = {0, 1};
        if(n < 2)
            return res[n];
        int one = 1;
        int two = 0;
        int num = 0;
        for (int i = 2; i <= n; i++) {
            num = one + two;
            two = one;
            one = num;
        }
        return num;
    }

}
