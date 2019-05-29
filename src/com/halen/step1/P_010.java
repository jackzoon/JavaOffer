package com.halen.step1;

/**
 * 跳台阶
 */
public class P_010 {
    public int JumpFloor(int target) {
        if(target==1)
            return 1;
        if(target==2)
            return 2;
        return JumpFloor(target-1) + JumpFloor(target-2);
    }

    public int JumpFloor_2(int target) {
        if(target == 1)
            return 1;
        if (target == 2)
            return 2;
        int one = 1;
        int two = 2;
        int res = 0;
        for (int i = 2; i < target; i++) {
            res = one + two;
            one = two;
            two = res;
        }
        return res;
    }


}
