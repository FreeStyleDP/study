package com.frees.study.java8;

import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

/**
 * @author dengping
 * @date 2019/10/16 15:22
 */
public class Time {

    @Test
    public void test1(){
        LocalDate now = LocalDate.now();
        DayOfWeek dayOfWeek = now.getDayOfWeek();
        System.out.println(dayOfWeek);
    }

    @Test
    public void formate(){
        System.out.println(new Date(LocalDateTime.now().getSecond()));

        //2017-01-01
        DateTimeFormatter.ISO_LOCAL_DATE.format(LocalDate.of(2017, 1, 1));
        //20170101
        DateTimeFormatter.BASIC_ISO_DATE.format(LocalDate.of(2017, 1, 1));
        //2017-01-01T09:10:00
        DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateTime.of(2017, 1, 1, 9, 10, 0));

        //2017年1月1日 星期日
        DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(LocalDate.of(2017, 1, 1));
        //上午09时10分00秒
        DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG).format(LocalTime.of(9, 10, 0));
        //2017-2-27 22:32:03
        DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(LocalDateTime.now());
    }

    @Test
    public void parse(){
        //使用的ISO_LOCAL_DATE格式解析  2017-01-01
        LocalDate.parse("2017-01-01");
        //使用自定义格式解析  2017-01-01T08:08:08
        LocalDateTime.parse("2017-01-01 08:08:08", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
