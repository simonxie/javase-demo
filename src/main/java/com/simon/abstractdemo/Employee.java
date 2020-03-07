package com.simon.abstractdemo;

/**
 * 定义职工类，每个职工的薪水都由基本薪资跟绩效奖金组成
 */
public abstract class Employee {

    /**
     * 岗位名称
     */
    private String jobName;

    /**
     * 所有职工的每月基本薪资都一样
     * @return
     */
    public int getBaseSalary(){
        return 10000;
    }

    /**
     * 所有职工都有绩效奖金，但是普通程序员跟技术总监的不一样，
     * 所以这里无法给出具体实现，需要在子类中实现
     * @return
     */
    public abstract int getOtherSalary();

    /**
     * 获取每个月工资总额
     * @return
     */
    public int getTotalSalary(){

        return this.getBaseSalary() + this.getOtherSalary();
    }

    /**
     * 打印工资条，定义为final类，禁止被子类重写
     */
    public final void printSalary(){

        System.out.println(this.jobName + "每个月薪资为：");
        System.out.println("基本薪资：" + this.getBaseSalary() + "元");
        System.out.println("绩效奖金：" + this.getOtherSalary() + "元");
        System.out.println("该月总工资为：" + getTotalSalary() + "元");
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
}
