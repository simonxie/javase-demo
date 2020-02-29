package com.simon.enumdemo;

/**
 * @Description: 用枚举实现单例
 * @Author: simon
 * @Date: Created in 2020/2/29 下午2:43
 */
public enum Singleton {

    INSTALL;

    /**
     * 自定义方法
     */
    public void yourMethod(){
        System.out.println("do your business");
    }
}
