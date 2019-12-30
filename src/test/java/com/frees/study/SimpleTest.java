package com.frees.study;

import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Objects;

/**
 * @author dengping
 * @date 2019/10/8 14:20
 */
public class SimpleTest {

    @Test
    public void test1(){
        System.out.println(new Date());
    }

    @Test
    public void test2(){
        String s = " ";
        System.out.println(s.isEmpty());
        String s1 = null;
        System.out.println(Objects.isNull(s1));
    }

    @Test
    public void test3(){
        HashMap<String, String> map = new HashMap<>();
        map.put("1","2");
        System.out.println(map.get("2"));
    }

    @Test
    private void test4(){
        String s = "{\"isTrue\":\"true\"}";
        s.equals("343");
    }

    public class person{
        boolean isTrue ;
    }
}
