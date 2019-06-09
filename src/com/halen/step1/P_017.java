package com.halen.step1;

import java.util.Scanner;

/**
 * @author Halen
 * @version 1.0
 * @date 2019/6/9 19:56
 * 打印从1到最大的n位数
 */
public class P_017 {

    void Print1ToMaxOfNDigits_1(int n) {
        int num = 1;
        int i= 0;
        while (i++ < n) {
            num *= 10;
        }
        for (i = 1; i < num; i++) {
            System.out.print(i + " ");
        }
    }

    void Print1ToMaxOfNigits(int n) {
        if (n <= 0) {
            return;
        }
        char[] number = new char[n];
        for (int i = 0; i < n; i++) {
            number[i] = '0';
        }
        while (!(Increment(number))) {
            printNumber(number);
        }
    }

    boolean Increment(char[] number) {
        // 检测是否已经加到最大n位数的标志
        boolean isOverflow = false;
        // 进位数值
        int takeOver = 0;
        int len = number.length;
        for (int i = len - 1; i >= 0; i--) {
            // 当前数位的数值
            int sum = number[i] - '0' + takeOver;
            if (i == len - 1) {
                sum++;
            }
            // 当前数位数值大于0，需要进位
            if (sum >= 10) {
                // 当前位是最高位
                if (i == 0) {
                    // 加到最大值的标志
                    isOverflow = true;
                    break;
                    // 当前位不是最高位
                } else {
                    // 进位1
                    takeOver = 1;
                    // 进位后当前位置0
                    number[i] = '0';
                }
                // 当前位数值小于10
            } else {
                number[i] = '0';
                // 置'0'再加上加一后的数值sum
                number[i] += sum;
                break;
            }
        }
        return isOverflow;
    }

    void printNumber(char[] number) {
        // 判断跳过最前面的所有0，false为跳过了，true为还没跳过
        boolean isBegining = true;
        for (int i = 0; i < number.length; i++) {
            if (isBegining && number[i] != '0') {
                isBegining = false;
            }
            // 跳过最前面的无效0，进行输出
            if (!isBegining) {
                System.out.print(number[i]);
            }
        }
        System.out.print("\t");
    }

    public static void main(String[] args) {
        P_017 p = new P_017();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            p.Print1ToMaxOfNigits(n);
        }
    }

}
