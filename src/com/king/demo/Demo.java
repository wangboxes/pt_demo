package com.king.demo;


import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2019/3/16.
 */
@Getter
@Setter
public class Demo {

    private String name;

    public static void main(String[] args) {

        //region Description
        System.out.println("Demo.main");
        System.out.println("args = [" + args + "]");
        System.out.println("args = " + args);
        //endregion
        Arrays.asList(new Integer[]{});
        List list = new ArrayList();
        list.add(1);
    }
}
