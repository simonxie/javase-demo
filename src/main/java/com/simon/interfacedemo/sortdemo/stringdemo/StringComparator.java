package com.simon.interfacedemo.sortdemo.stringdemo;

import java.util.Comparator;

/**
 * @Description: 通过实现Comparator接口，实现自定义排序
 * @Author: simon
 * @Date: Created in 2020/2/20 下午8:28
 */
public class StringComparator implements Comparator<String>{

    /**
     * 按字符串长度降序排序
     * @param o1
     * @param o2
     * @return 返回1:大于，-1:小于
     */
    @Override
    public int compare(String o1, String o2) {

        return o1.length() > o2.length() ? -1 : 1;
    }
}
