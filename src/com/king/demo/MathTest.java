package com.king.demo;

import org.junit.Test;

/**
 * Created by Administrator on 2019/3/16.
 */
public class MathTest {

    @Test
    public void work() throws Exception {
        System.out.println("单元测试");
    }


    @Test
    public void testDebug() throws Exception {
        System.out.println("begin");
        for (int i = 0;
             i <10 ;
             i++) {
            System.out.println(i);
            if (i == 3){
                xxoo(i);
                break;
            }
        }
        System.out.println("end");
    }

    private String xxoo(int i){
        System.out.println("i="+i);
        return "---";
    }

}