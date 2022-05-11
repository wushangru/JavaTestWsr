package com.wsr.test;

import com.wsr.entity.Year;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * @author wsr
 * @create 2022-05-10
 */

public class Test01 {

    @Test
    public void test01(){
        int y1 = 1999;
        int y2 = 1024;
        int y3 = 2100;
        int y4 = 2000;
        Year year = new Year();
        String leap1 = year.isLeap(y1);
        String leap2 = year.isLeap(y2);
        String leap3 = year.isLeap(y3);
        String leap4 = year.isLeap(y4);
        System.out.println(y1+"年是 "+leap1);
        System.out.println(y2+"年是 "+leap2);
        System.out.println(y3+"年是 "+leap3);
        System.out.println(y4+"年是 "+leap4);
    }

}
