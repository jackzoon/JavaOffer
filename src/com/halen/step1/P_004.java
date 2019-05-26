package com.halen.step1;

/**
 * 二维数组中的查找
 */
public class P_004 {

    public boolean Find(int target, int [][] array) {
        if(array.length==0 || array[0].length==0)
            return false;
        int row = 0;
        int column = array[0].length-1;
        while (row < array.length && column >= 0) {
            int num = array[row][column];
            if (num == target)
                return true;
            else if (num > target)
                column--;
            else
                row++;
        }
        return false;
    }

}
