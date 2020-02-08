package com.simon.abstractdemo;

/**
 * @Description: 继承并实现People类
 * @Author: simon
 * @Date: Created in 2020/2/8 下午3:46
 */
public class Student extends AbstractPeople {
    private String studentCard;
    public Student(String peopleName,Integer age,String studentCard){
        //调用父类构造方法
        super(peopleName,age);
        this.studentCard = studentCard;
    }

    /**
     * 实现父类的抽象方法
     */
    @Override
    public void printDetailInfo() {
        System.out.println(getCommonField()+",studentCard:"+studentCard);
    }
}
