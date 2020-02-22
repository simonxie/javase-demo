package com.simon.interfacedemo;
/**
 * @Description: 教师类，实现IPeople,ITitle两个接口
 * @Author: simon
 * @Date: Created in 2020/2/16 下午5:00
 */
public class Teacher implements IPeople,ITitle {
    private String name;
    private Integer age;
    private String titleName;

    public Teacher(String name,Integer age,String titleName){
        this.name = name;
        this.age = age;
        this.titleName = titleName;
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
        System.out.println(year + "," + liveIn + "，我叫" + this.name + "，我今年" + this.age + "岁，" + getTitle());
    }

    /**
     * 实现ITitle中的getTitle接口
     * @return
     */
    @Override
    public String getTitle() {
        String title = "我的职称是" + this.titleName;
        return title;
    }
}
