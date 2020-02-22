package com.simon.interfacedemo.sortdemo.studentdemo;
/**
 * @Description: 实现了Comparable接口的学生对象
 * @Author: simon
 * @Date: Created in 2020/2/16 下午3:48
 */
public class Student implements Comparable<Student>{

    private String name;
    private Integer age;

    public Student(String name,Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    /**
     * 实现compareTo接口方法，按age升序。
     * @param o
     * @return 返回1:大于，0:等于，-1:小于
     */
    @Override
    public int compareTo(Student o) {

        return Integer.compare(age,o.age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
