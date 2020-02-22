package com.simon.interfacedemo;

import java.time.LocalDate;

/**
 * @Description: 人的接口类
 * @Author: simon
 * @Date: Created in 2020/2/16 下午4:04
 */
public interface IPeople {

    /**
     * 默认方法，需要jdk版本1.8+才能使用
     */
    default String liveIn(){

        return "我生活在地球上";
    }

    /**
     * jdk版本1.8+可以将与该接口相关的静态方法直接定义在接口中，不用像1.8之前要另外定义一个类
     */
    static String getYear(){
        int year = LocalDate.now().getYear();
        return "现在是" + year + "年";
    }

    /**
     * 接口方法，打印详细信息
     */
    void printDetailInfo();
}
