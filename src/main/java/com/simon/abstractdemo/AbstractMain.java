package com.simon.abstractdemo;
/**
 * @Description: 测试类
 * @Author: simon
 * @Date: Created in 2020/2/8 下午4:22
 */
public class AbstractMain {

    public static void main(String[] args){
        AbstractPeople[] peopleArr = new AbstractPeople[2];
        //Student、Teacher都继承自People类，所以都可以直接放入People数组（这里就是多态的实现）
        peopleArr[0] = new Student("小张",15,"S100");
        peopleArr[1] = new Teacher("林老师",35,"T200");
        for (AbstractPeople people:peopleArr) {
            people.printDetailInfo();//Student和Teacher都实现了printDetailInfo方法
        }
    }
}
