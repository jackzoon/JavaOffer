package com.halen.step1;

/**
 * @author Halen
 * @version 1.0
 * @date 2019/6/2 21:33
 * 机器人的运动范围
 */
public class P_013 {
    public int movingCount(int threshold, int rows, int cols)
    {
        if (threshold < 0 || rows <= 0 || cols <= 0) {
            return 0;
        }
        boolean[] visited = new boolean[rows * cols];
        int count = movingCount(threshold, rows, cols, 0, 0, visited);
        return count;
    }

    private int movingCount(int threshold, int rows, int cols, int row, int col, boolean[] visited) {
        int count = 0;
        if (check(threshold, rows, cols, row, col, visited)) {
            visited[row*cols+col] = true;
            count = 1 + movingCount(threshold, rows, cols, row - 1, col, visited) +
                    movingCount(threshold, rows, cols, row, col - 1, visited) +
                    movingCount(threshold, rows, cols, row + 1, col, visited) +
                    movingCount(threshold, rows, cols, row, col + 1, visited);
        }
        return count;
    }

    private boolean check(int threshold, int rows, int cols,int row,int col, boolean[] visited) {
        if (row >= 0 && row < rows && col >= 0 && col < cols && getDigitSum(row) + getDigitSum(col) <= threshold && !visited[row * cols + col]) {
            return true;
        }
        return false;
    }

    private int getDigitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum+=number%10;
            number /= 10;
        }
        return sum;
    }
}
