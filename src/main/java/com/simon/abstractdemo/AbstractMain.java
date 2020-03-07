package com.simon.abstractdemo;
/**
 * @Description: 测试类
 * @Author: simon
 * @Date: Created in 2020/2/8 下午4:22
 */
public class AbstractMain {

    public static void main(String[] args){

        Coder coder = new Coder();
        coder.setJobName("程序员");
        System.out.println(coder.getJobName() + "每个月薪资为：");
        System.out.println("基本薪资：" + coder.getBaseSalary() + "元");
        System.out.println("绩效奖金：" + coder.getOtherSalary() + "元");

        Cto cto = new Cto();
        cto.setJobName("技术总监");
        System.out.println(cto.getJobName() + "每个月薪资为：");
        System.out.println("基本薪资：" + cto.getBaseSalary() + "元");
        System.out.println("绩效奖金：" + cto.getOtherSalary() + "元");

        /*
        //模板方法设计模式
        Coder coder = new Coder();
        coder.setJobName("程序员");
        coder.printSalary();

        Cto cto = new Cto();
        cto.setJobName("技术总监");
        cto.printSalary();
        */



    }
}
