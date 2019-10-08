package com.frees.study.other;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;


/**
 * @author dengping
 * @date 2019/9/25 17:10
 */
public class MockitoStudy {

    @Test
    public void test1(){
        List list = Mockito.mock(List.class);
        //匹配任意参数
        Mockito.when(list.get(Mockito.anyInt())).thenReturn(1);
        Mockito.verify(list).add(1);
        list.add(1);
        Assert.assertEquals(1, list.get(1));
        Assert.assertEquals(1, list.get(999));
    }
}
