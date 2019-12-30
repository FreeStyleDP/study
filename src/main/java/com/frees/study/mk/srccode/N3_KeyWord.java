package com.frees.study.mk.srccode;

import org.junit.Test;

/**
 * 关键字
 * @author dengping
 * @date 2019/11/18 14:43
 */
public class N3_KeyWord {

    /**
     * 执行顺序 try - catch - finally, 但是catch中新捕获的异常，时在finally之后抛出
     */
    @Test
    public void testKeyWord() {
        try {
            System.out.println("try");
            throw new RuntimeException("try");
        } catch (Exception e) {
            System.out.println("catch");
            throw new RuntimeException("catch exception");
        } finally {
            System.out.println("finally");
        }
    }
}
