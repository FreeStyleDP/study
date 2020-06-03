package com.frees.study.dailyQuestion;

import org.junit.Test;

import java.io.File;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * 用于日常问题的 测试
 * @author dengping
 * @date 2020/6/2 11:21
 */
public class DailyQuestionTest1 {

    @Test
    public void test4(){
        // 此方法使用System.currentTimeMillis()为种子，有可预测性，不安全
        Random random1 = new Random();
        Random random2 = new Random(1);
        Random random3 = new Random(1);
        for (int i = 0; i < 3; i++) {
            System.out.println(random2.nextInt(100) + "_" + random3.nextInt(100));
        }

        double random = Math.random();
        int random4 = (int) (random * 100);
        System.out.println(random);
        System.out.println(random4);

        // 强随机数，种子有不可预测性
        SecureRandom secureRandom = new SecureRandom();
        int i = secureRandom.nextInt(100);
        System.out.println(i);
    }

    @Test
    public void test4_1() {
        String[] s = {"1", "2"};
        List<String> list = Arrays.asList(s);
        s[0] = "3";
        list.forEach(System.out::println);
//        list.add("3");

        ArrayList<Object> recive = new ArrayList<>();
        Collections.addAll(recive, s);
        recive.forEach(System.out::println);

        Arrays.sort(s, (o1, o2) -> -o1.compareTo(o2));
    }

    @Test
    public void test_collection() {
        HashSet<String> set = new HashSet<>();
        HashMap<String, String> map = new HashMap<>();
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        ArrayList<String> list = new ArrayList<>();

        list.add("1");
        list.add("1");
        set.addAll(list);

        set.add("2");
        set.add("2");
        System.out.println("ok");
        //        Set<String> collect = list.stream().collect(Collectors.toSet());
    }

    @Test
    public void testSwitch() {
        method("2");

        File file = new File("");
        File parentFile = file.getParentFile();
    }

    private void method(String str) {
        switch (str) {
            case "s":
                System.out.println("1");
                break;
            case "s1":
                System.out.println("12");
                break;
            case "s2":
                System.out.println("13");
                break;
            default:
                System.out.println("end");
        }
    }
}
