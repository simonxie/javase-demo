package com.simon.abstractdemo;

/**
 * @Description: 继承并实现People类
 * @Author: simon
 * @Date: Created in 2020/2/8 下午3:46
 */
public class Teacher extends AbstractPeople {
    private String teacherCard;

    public Teacher(String peopleName,Integer age,String teacherCard){
        //调用父类构造方法
        super(peopleName,age);
        this.teacherCard = teacherCard;
    }

    /**
     * 实现父类的抽象方法
     */
    @Override
    public void printDetailInfo() {
        System.out.println(getCommonField() + ",teacherCard:"+teacherCard);
    }
}
