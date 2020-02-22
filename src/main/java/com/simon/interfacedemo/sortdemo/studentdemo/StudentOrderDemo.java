package com.simon.interfacedemo.sortdemo.studentdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Description: 根据对象属性排序例子
 * @Author: simon
 * @Date: Created in 2020/2/15 上午11:33
 */
public class StudentOrderDemo {

    public static void main(String[] args){

        //1、数组排序
        Student[] students = new Student[3];
        students[0] = new Student("zhangsan",30);
        students[1] = new Student("lisi",28);
        students[2] = new Student("wangwu",33);

        System.out.println("通过student实现的默认排序，根据age升序排序：");
        Arrays.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("\r\n通过自定义排序器实现的排序，根据名字长度排序：");
        Arrays.sort(students,new StudentComparator());
        for (Student student : students) {
            System.out.println(student);
        }

        //2、集合排序
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("zhangsan",30));
        studentList.add(new Student("lisi",28));
        studentList.add(new Student("wangwu",33));

        System.out.println("\r\n通过student实现的默认排序，根据age升序排序：");
        Collections.sort(studentList);
        for (Student student : studentList) {
            System.out.println(student);
        }

        System.out.println("\r\n通过自定义排序器实现的排序，根据名字长度排序：");
        Collections.sort(studentList,new StudentComparator());
        for (Student student : students) {
            System.out.println(student);
        }

    }
}
