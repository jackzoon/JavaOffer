package com.halen.step1;

/**
 * @author Halen
 * @version 1.0
 * @date 2019/6/8 11:53
 * 数值的整数次方
 */
public class P_016 {

    public double Power(double base, int exponent) {
        if (base == 0.0 && exponent < 0) {
            return 0.0;
        }
        double result = 1.0;
        result = PowerUnsigned(base, Math.abs(exponent));
        if (exponent < 0) {
            return 1.0 / result;
        }
        return result;
    }

    private double PowerUnsigned(double base, int exponent) {
        double result = 1.0;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }

    private double PowerUnsigned_2(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return base;
        }
        double result = PowerUnsigned_2(base, exponent >> 1);
        result *= result;
        // 判断当前exponent是不是奇数
        if ((exponent & 0x01) == 1) {
            result *= base;
        }
        return result;
    }

}
