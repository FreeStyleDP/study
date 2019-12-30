package com.frees.study.srcCode;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.Test;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author dengping
 * @date 2019/10/17 10:35
 */
public class StringStudy {

    @Test

    public void test1(){
        String s = ",a,b,";
        System.out.print("start[");
        System.out.print(Arrays.asList(s.split(",a", -2)).stream().collect(Collectors.joining(",")));
        System.out.print("]end");

    }

    @Test
    public void  test2(){
        User user = null;
        User user2 = new User("anna@gmail.com", "1234");
        Optional<User> user1 = Optional.ofNullable(user);
    }

    @Test
    public void test3(){
        String s = null;
        System.out.println();
    }

    @Data
    @AllArgsConstructor
    public class User{
        private String email;
        private String name;
    }
}


