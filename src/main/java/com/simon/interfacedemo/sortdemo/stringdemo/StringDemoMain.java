package com.simon.interfacedemo.sortdemo.stringdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringDemoMain {

    public static void main(String[] args){
        //1、数组排序用法
        String[] strArr = new String[]{"zhangsan","lisi","wangwu"};
        //数组默认按字符升序排序
        Arrays.sort(strArr);
        System.out.println("默认按字母升序排序：");
        for (String str:strArr) {
            System.out.println(str);
        }

        //自定义排序，按字符串长度降序
        Arrays.sort(strArr,new StringComparator());
        System.out.println("自定义排序，按字符串长度降序排序：");
        for (String str:strArr) {
            System.out.println(str);
        }

        //2、集合排序用法
        List<String> strList = new ArrayList<>();
        strList.add("zhangsan");
        strList.add("lisi");
        strList.add("wangwu");
        //集合默认按字符升序排序
        Collections.sort(strList);
        System.out.println("默认按字母升序排序：");
        for (String str:strList) {
            System.out.println(str);
        }

        //自定义排序，按字符串长度降序
        Collections.sort(strList,new StringComparator());
        System.out.println("自定义排序，按字符串长度降序排序：");
        for (String str:strList) {
            System.out.println(str);
        }

    }
}
