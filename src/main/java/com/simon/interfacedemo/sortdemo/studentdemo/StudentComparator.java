package com.simon.interfacedemo.sortdemo.studentdemo;

import java.util.Comparator;

/**
 * @Description: 通过实现Comparator接口，实现自定义排序
 * @Author: simon
 * @Date: Created in 2020/2/20 下午8:28
 */
public class StudentComparator implements Comparator<Student>{

    /**
     * 按名字长度升序排序
     * @param o1
     * @param o2
     * @return 返回1:大于，-1:小于
     */
    @Override
    public int compare(Student o1, Student o2) {

        return o1.getName().length() > o2.getName().length() ? 1 : -1;
    }
}
