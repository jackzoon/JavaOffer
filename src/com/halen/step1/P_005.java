package com.halen.step1;

/**
 * 替换空格
 */
public class P_005 {

    public String replaceSpace(StringBuffer str) {
        StringBuffer res = new StringBuffer();
        int len = str.length() -1;
        for (int i = len; i >= 0; i--) {
            if(str.charAt(i) == ' ')
                res.append("02%");
            else
                res.append(str.charAt(i));
        }
        return res.reverse().toString();
    }

}
