package com.frees.study.mk.srccode;

/**
 * @author dengping
 * @date 2019/11/18 10:58
 */
public class SonClass implements FatherInterface, FatherInterfateA {

    public static void test1() {
        System.out.println(FatherInterfateA.name);
    }

    public static void main(String[] args) {
        test1();
    }
}
