package com.frees.study.thinkInJava;

import org.junit.Test;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringStudy {

    @Test
    public void test1(){
        String string = new String();
        char c = 'c';
        boolean contains = string.contains("c");
        System.out.println(string);

        Locale locale = Locale.getDefault();
        System.out.println(locale.getCountry());
        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayName());

        System.out.println(Integer.MIN_VALUE);

        String s = "sdfds";
        s.split("   ",1);


    }

    @Test
    public void test2(){
        System.out.format("%s you are ", "dog" );
        System.out.format("%s you ae ", "dog" );

        Integer in = 1;
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();

    }

    @Test
    public void test3(){
        Pattern compile = Pattern.compile("\\b");
        Matcher matcher = compile.matcher("234sdf");
    }

}
