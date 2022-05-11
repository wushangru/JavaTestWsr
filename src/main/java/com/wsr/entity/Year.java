package com.wsr.entity;

/**
 * @author wsr
 * @create 2022-05-10
 */
public class Year {
    public String isLeap(int year) {
        String leap = "";
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leap = "闰年";
                } else {
                    leap = "平年";
                }
            } else {
                leap = "闰年";
            }
        } else {
            leap = "平年";
        }
        return leap;
    }
}
