package com.simon.constructdemo;

public class ConstructMain {

    public static void main(String[] args){

        System.out.println("--------------people----------------");
        People people = new People();

        System.out.println("--------------people1----------------");
        People people1 = new People("张三");

        System.out.println("--------------subClass1----------------");
        SubClass subClass1 = new SubClass();

        System.out.println("--------------subClass2----------------");
        SubClass subClass2 = new SubClass("子类第一个参数","子类第二个参数");

    }
}
