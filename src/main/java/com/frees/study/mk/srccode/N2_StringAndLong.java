package com.frees.study.mk.srccode;

import cn.hutool.core.date.DateField;
import cn.hutool.core.date.DateUtil;
import com.alibaba.fastjson.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;

/**
 * @author dengping
 * @date 2019/10/29 16:38
 */
public class N2_StringAndLong {

    @Test
    public void test1(){
        String s = "1:s:3:";
        System.out.println(s.split(":", 0).length);
        System.out.println(s.split(":", -1).length);
    }

    @Test
    public void test2(){
        Long aLong = new Long(12);
        Long aLong1 = 12L;
        Long aLong2 = new Long(133);
        Long aLong3 = new Long(133);
        System.out.println(aLong.equals(aLong1));
        System.out.println((aLong == aLong1));
        System.out.println(aLong2.equals(aLong3));
        System.out.println((aLong2 == aLong3));

    }
    @Test
    public void test3(){
        Long aLong = Long.valueOf(2);
        long l1 = Long.parseLong("3");
        Long l = 12L;
        String s = "s";
    }

    @Test
    public void test4(){
        String s = "s\t";
        String s1 = "s\t\n";
        String s2 = "s\t\n\r";
        Assert.assertEquals("s", s.trim());
        Assert.assertEquals("s", s1.trim());
        Assert.assertEquals("s", s2.trim());
    }

    @Test
    public void test5(){
        HashMap<String, String> map = new HashMap<>();

        map.put("1", "s");
        map.put("2", "3");
        System.out.println(JSONObject.toJSONString(map));
        Date now = new Date();
        System.out.println(JSONObject.toJSONString(now));

        System.out.println(JSONObject.toJSONString(DateUtil.offset(now, DateField.DAY_OF_MONTH, 1)));
        System.out.println(JSONObject.toJSONString(DateUtil.offset(now, DateField.DAY_OF_MONTH, 2)));

    }

    @Test
    public void question(){
//        Arrays.stream();

    }
}
