package com.frees.study;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;

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
    public void test4(){
        String s = "{\"isTrue\":\"true\"}";
        s.equals("343");
    }

    @Test
    public void test5() {
        HashMap<String, Person> persons = new HashMap<>();
        Person p2 = new Person("2");
        persons.put("1", new Person("1"));
        persons.put("2", p2);
        p2.setName("3");
        persons.entrySet().stream().forEach(p -> System.out.println(p.getKey()+"-"+p.getValue().getName()));
    }

    @Test
    public void test6(){
        // a b 字段
        List<HashMap<String, String>> datas = new ArrayList<>();

        for (int i = 0; i < 10; i++ ) {
            HashMap<String, String> map = new HashMap<>();
            if (i == 9) {
                map.put("a", null);
                map.put("b", null);
            } else {
                map.put("a", "" + (new Random(1)).nextInt(100));
                map.put("b", "" + (new Random(1)).nextInt(100));
            }
            datas.add(map);
        }


        List<HashMap<String, String>> collect =
            datas.stream().filter(data -> data.get("a") != null || data.get("b") != null).collect(Collectors.toList());

        System.out.println("finish");
    }

    @Test
    public void test7() {
        HashMap<String, String> map = new HashMap<>();
        map.put(null, "");
        map.put(null, "");
        map.put("1", "");
        map.put("1", "");

    }

    public class Person {
        boolean isTrue ;
        String name;

        public Person(String name) {
            this.name = name;
        }

        public boolean isTrue() {
            return isTrue;
        }

        public void setTrue(boolean aTrue) {
            isTrue = aTrue;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
