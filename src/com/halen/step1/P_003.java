package com.halen.step1;

import java.util.HashSet;
import java.util.Set;

/**
 * 数组中重复的数字
 */
public class P_003 {

    public boolean duplicate(int numbers[],int length,int [] duplication) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < length; i++) {
            if (!set.add(numbers[i])) {
                duplication[0] = numbers[i];
                return true;
            }
        }
        return false;
    }

    public boolean duplicate_2(int numbers[],int length,int [] duplication) {
        int m = -1;
        for (int i = 0; i < length; i++) {
            while (i != numbers[i]) {
                m = numbers[i];
                if (m == numbers[m]) {
                    duplication[0] = m;
                    return true;
                } else {
                    numbers[i] = numbers[m];
                    numbers[m] = m;
                }
            }
        }
        return false;
    }

}
