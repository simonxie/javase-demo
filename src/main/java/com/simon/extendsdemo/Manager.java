package com.simon.extendsdemo;

/**
 * 经理类
 */
public class Manager extends Employee{

    /**
     * 国外旅游福利
     */
    private String externalTour;

    /**
     * 初始化经理福利
     */
    public Manager(){
        //由于经理国内游还可以带家人，所以这里通过setInternalTour方法重新设置
        setInternalTour("一年一次带家人国内游");
        this.externalTour = "一年一次国外旅游";
    }

    /**
     * 重写父类的printWelfare()方法
     * 由于父类已经有printWelfare()方法并且可以打印基本福利和国内游福利，
     * 所以直接通过super调用父类的printWelfare()方法打印基本福利和国内游福利
     */
    @Override
    public void printWelfare(){
        //调用父类打印基本福利和国内游福利，
        //这里必须带上super，否则就是调用子类的printWelfare()，那就是死循环了
        super.printWelfare();
        //打印国外游福利
        System.out.println(this.externalTour);
    }

}
