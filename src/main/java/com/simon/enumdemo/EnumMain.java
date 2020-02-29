package com.simon.enumdemo;

public class EnumMain {

    public static void main(String[] args){
        //获取枚举值的名称,与toString得到的结果一样
        String spring = SeasonEnum.SPRING.name();
        System.out.println(spring);

        //枚举判断
        SeasonEnum springEnum1 = SeasonEnum.SPRING;
        SeasonEnum springEnum2 = SeasonEnum.SPRING;
        SeasonEnum summerEnum3 = SeasonEnum.SUMMER;
        System.out.println("springEnum1 == springEnum2:" + (springEnum1 == springEnum2));
        System.out.println("springEnum1 == summerEnum3:" + (springEnum1 == summerEnum3));

        //循环枚举
        SeasonEnum[] seasonEnums = SeasonEnum.values();
        for (SeasonEnum seasonEnum : seasonEnums) {
            System.out.println(seasonEnum.name());
        }

        //enum在switch中的用法
        testSwitch("SPRING");

        //循环带自定义方法的枚举
        SexEnum[] sexEnums = SexEnum.values();
        for (SexEnum sexEnum : sexEnums) {
            System.out.println("sexCode:"+sexEnum.getSexCode());
            System.out.println("sexName:"+sexEnum.getSexName());
            System.out.println("sexCode:sexName="+sexEnum.toString());
        }

        //根据sexCode获取sexName
        String sexName = SexEnum.getSexNameByCode("women");
        System.out.println("根据sexCode获取sexName：" + sexName);

        //根据sexName获取sexCode
        String sexCode = SexEnum.getSexCodeByName("男");
        System.out.println("根据sexName获取sexCode：" + sexCode);

        //通过传入的sexCode使用switch
        testSexEnumSwitch("women");

        //枚举单例的使用
        Singleton.INSTALL.yourMethod();

    }

    /**
     * 根据传入的enumName，使用switch方法
     * @param enumName
     */
    private static void testSwitch(String enumName){
        SeasonEnum seasonEnum = SeasonEnum.valueOf(enumName);
        switch (seasonEnum){
            case SPRING:
               System.out.println(seasonEnum.name());
               break;
            case SUMMER:
                System.out.println(seasonEnum.name());
                break;
            case AUTUMN:
                System.out.println(seasonEnum.name());
                break;
            case WINTER:
                System.out.println(seasonEnum.name());
                break;
            default:
                System.out.println("other");
        }
    }

    /**
     * 根据传入的sexCode，使用switch方法
     * @param sexCode
     */
    private static void testSexEnumSwitch(String sexCode){
        SexEnum sexEnum = SexEnum.getEnumByCode(sexCode);
        switch (sexEnum){
            case MAN:
                System.out.println(sexEnum.toString());
                break;
            case WOMEN:
                System.out.println(sexEnum.toString());
                break;
            default:
                System.out.println("other");
        }
    }


}
