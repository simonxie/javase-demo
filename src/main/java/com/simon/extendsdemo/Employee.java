package com.simon.extendsdemo;

/**
 * 员工类
 */
public class Employee {
    /**
     * 基本福利
     */
    private String basicWelfare;

    /**
     * 国内旅游福利
     */
    private String internalTour;

    /**
     * 初始化员工福利
     */
    public Employee(){
        this.basicWelfare = "五险一金";
        this.internalTour = "一年一次国内游";
    }

    /**
     * 可以设置国内游的方法
     * @param internalTour
     */
    public void setInternalTour(String internalTour) {
        this.internalTour = internalTour;
    }

    /**
     * 打印员工福利
     */
    public void printWelfare(){
        System.out.println(this.basicWelfare);
        System.out.println(this.internalTour);
    }

}
