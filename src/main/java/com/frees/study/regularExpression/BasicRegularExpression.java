package com.frees.study.regularExpression;


import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicRegularExpression {

    /**
     * 匹配
     */
    @Test
    public void test1() {
        // 快速匹配
        String str = "i am is a boy";
        String pattern = "\\b\\w{2}\\b";
        System.out.println(Pattern.matches(pattern, str));

        String str1 = "S000000sdfess";
        String regex = "S\\d{6}.{6}";
        boolean matches = str1.matches(regex);
        System.out.println("2:"+matches);

        // 编译后匹配
        // find() 有则匹配
        Pattern compile = Pattern.compile(pattern);
        Matcher matcher = compile.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
            System.out.println((matcher.start() + "...." + matcher.end()));
            System.out.println(matcher.groupCount());
        }

        // loolkingAt 匹配最前面
        System.out.println("lookat:"+matcher.lookingAt());

        // matches 全匹配
        System.out.println("matches:"+matcher.matches());

    }

    /**
     * 分割
     */
    @Test
    public void test2() {
        // 简单替换
//        String str = "i am is a boy";
        String str = "i am body b2dy sdfw23d";
        String pattern = "b\\ddy";
        System.out.println(str.replaceAll(pattern, "sdf"));

        // Pattern 替换
        Pattern compile = Pattern.compile(pattern);
        String[] split = compile.split(str);
        for (int i = 0 ; i < split.length ;i++){
            System.out.println("["+split[i]+"]");
        }
    }

    /**
     * 替换
     */
    @Test
    public  void  test3(){
        String str = "i am a boy. My telephone is 18011310193.My brother's telephone is 18011310193.";
        String regex = "\\b\\d{11}";
        System.out.println(str.replaceAll(regex, "234"));

        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(str);
        System.out.println(matcher.replaceAll("333"));
    }


}
