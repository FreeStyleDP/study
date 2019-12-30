package com.frees.study.other;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

/**
 * @author dengping
 * @date 2019/11/18 13:56
 */
@Slf4j
public class Slf4jTest {
    public static void main(String[] args) {
        String s = null;
        try {
            log.info("begin");
            System.out.println(s.length());
            log.info("finish");
        } catch (Exception e) {
            // 推荐异常的 打印方式，直接将e放打最后，可以打印错误的位置
            log.error("time {}", LocalDateTime.now(), e);
            log.error("time {}", 1, e);

            log.error("time {} {}", 2, e.toString());
            log.error("time {} {}", 3, e.getMessage());
        }
    }
}
