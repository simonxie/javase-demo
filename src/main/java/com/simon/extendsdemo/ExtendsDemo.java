package com.simon.extendsdemo;

public class ExtendsDemo {

    public static void main(String[] args){

        //打印员工福利
        Employee employee = new Employee();
        System.out.println("员工福利：");
        employee.printWelfare();

        //打印经理福利
        Manager manager = new Manager();
        System.out.println("员工福利：");
        manager.printWelfare();
    }
}
