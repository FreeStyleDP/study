package com.frees.study.mk.srccode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author dengping
 * @date 2019/11/18 16:11
 */
public class N4_ArraysCollectionsObjects {
    @Test
    public void compare(){
        String[] strs = {"200", "220", "340", "250"};
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));
    }

    @Test
    public void collections() {
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        Collections.sort(ints);
        System.out.println(ints);
        Collections.sort(ints, (o1, o2) -> -(o1 - o2) );
        System.out.println(ints);

        List<Integer> integers = Collections.synchronizedList(ints);

        List<Integer> integers1 = Collections.unmodifiableList(ints);
    }

    @Test
    public void test1() {
        int[] ints = {1,2,3,4};
        int[] ints1 = Arrays.copyOfRange(ints, 0, 6);
        System.out.println(Arrays.toString(ints));
    }

    @Test
    public void objectTest() {
        String s = "1";
        String s1 = null;
        String s2 = null;
//        System.out.println(s.equals(s1));
//        System.out.println(Objects.equals(s1, s2));
//        System.out.println((null instanceof String));
        System.out.println(s.equals(s1));
        System.out.println(((String)null));
        Object o = null;
        System.out.println(((String)o));
    }
}
