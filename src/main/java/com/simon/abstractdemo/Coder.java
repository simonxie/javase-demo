package com.simon.abstractdemo;

/**
 * 程序员类，继承Employee类
 */
public class Coder extends Employee{

    /**
     * 由于继承了Employee类，所以必须实现Employee类中的抽象方法getOtherSalary()
     * @return
     */
    @Override
    public int getOtherSalary() {
        return 3000;
    }
}
