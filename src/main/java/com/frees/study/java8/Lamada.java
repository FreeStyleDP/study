package com.frees.study.java8;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

/**
 * @author dengping
 * @date 2019/10/15 11:00
 */
public class Lamada {

    @Test
    public void whenCheckIfPresent() {
        User user =new User("john@gmail.com","1234");
        Optional<User> opt =Optional.ofNullable(user);
        opt.ifPresent( u -> assertEquals(user.getEmail(), u.getEmail()  ));

//        user = null;
    }

    @Test
    public void test2(){
        List<Integer> str = Arrays.asList(1, 2, 34, 54, 5, 6);
        Stream<Integer> integerStream = str.stream().map(s -> s * s);
        List<Integer> collect = integerStream.limit(4).collect(Collectors.toList());
        collect.forEach(System.out::println);

        // 小的排前面，默认升序
        str.stream().sorted(new Comparator<Integer>() {
            @Override public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        }).forEach(System.out::println);

    }

    @Test
    /**
     * lamada 引用局部变量 同 内部类
     */
    public void test1(){
        // 或者 final修饰
        int num = 1;

        Converter<Integer, String> s = (param) -> System.out.println(String.valueOf(param + num));
//        num = 3;
    }

    public interface Converter<T1, T2> {
        void convert(int i);
    }

    @Data
    @AllArgsConstructor
    public class User{
        private String email;
        private String name;
    }

}
