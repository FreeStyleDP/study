package com.frees.study.mk.srccode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author dengping
 * @date 2019/11/15 11:07
 */
public class StringStduy {

    @Test
    public void test1() {
        String s = "3";
        String s1 = "2";
        List<String> strings = Arrays.asList(s, s1);
        System.out.println(s.compareTo(s1));
        System.out.println(s1.compareTo(s));
        strings.stream().sorted((P1, p2) -> P1.compareTo(p2)).forEach(System.out::println);

    }

}
