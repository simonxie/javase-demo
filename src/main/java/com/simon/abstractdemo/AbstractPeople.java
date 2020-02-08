package com.simon.abstractdemo;

/**
 * @Description: 基类
 * @Author: simon
 * @Date: Created in 2020/2/8 下午12:04
 */
public abstract class AbstractPeople {
    private String peopleName;
    private Integer age;
    public AbstractPeople(String peopleName, Integer age){
        this.peopleName = peopleName;
        this.age = age;
    }

    public String getCommonField(){
        return "peopleName:"+peopleName+",age:"+age;
    }

    /**
     * 父类抽象方法，具体的由子类来实现
     */
    public abstract void printDetailInfo();
}
