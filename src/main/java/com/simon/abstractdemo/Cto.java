package com.simon.abstractdemo;

/**
 * 技术总监类，继承Employee类
 */
public class Cto extends Employee{

    /**
     * 由于继承了Employee类，所以必须实现Employee类中的抽象方法getOtherSalary()
     * @return
     */
    @Override
    public int getOtherSalary() {
        return 20000;
    }
}
