package com.simon.interfacedemo;

/**
 * @Description: 学生类，实现IPeople接口
 * @Author: simon
 * @Date: Created in 2020/2/16 下午5:06
 */
public class Student implements IPeople{
    private String name;
    private Integer age;

    public Student(String name,Integer age){
        this.name = name;
        this.age = age;
    }

    /**
     * 实现IPeople中的printDetailInfo接口
     */
    @Override
    public void printDetailInfo() {
        //直接调用接口的默认方法
        String liveIn = liveIn();
        //直接调用IPeople的静态方法
        String year = IPeople.getYear();
        System.out.println(year + "," + liveIn + "，我叫" + this.name + "，我今年" + this.age + "岁");
    }
}
