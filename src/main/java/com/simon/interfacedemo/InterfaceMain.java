package com.simon.interfacedemo;

public class InterfaceMain {

    public static void main(String[] args){

        IPeople student = new Student("张三",15);
        student.printDetailInfo();

        //直接使用ITitle接口的枚举
        String titleName = ITitle.Title.FIRST_TITLE.getName();
        IPeople teacher = new Teacher("李四",35, titleName);
        teacher.printDetailInfo();
    }
}
