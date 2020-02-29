package com.simon.enumdemo;
/**
 * @Description: 带有自定义属性、方法的枚举
 * @Author: simon
 * @Date: Created in 2020/2/29 下午1:27
 */
public enum SexEnum {
    MAN("man","男"),
    WOMEN("women","女");

    private String sexCode;

    private String sexName;

    /**
     * 自定义构造函数，以完成枚举对sexCode、sexName赋值
     * @param sexCode
     * @param sexName
     */
    SexEnum(String sexCode,String sexName){
        this.sexCode = sexCode;
        this.sexName = sexName;
    }

    /**
     * 获取sexCode
     * @return
     */
    public String getSexCode() {
        return sexCode;
    }

    /**
     * 获取sexName
     * @return
     */
    public String getSexName() {
        return sexName;
    }

    /**
     * 根据sexCode获取sexName
     * 通过循环enum来实现
     * @param sexCode
     * @return
     */
    public static String getSexNameByCode(String sexCode){
        String sexName = "sexCode不存在";
        SexEnum[] sexEnums = SexEnum.values();
        for (SexEnum sexEnum : sexEnums) {
            if(sexEnum.getSexCode().equals(sexCode)){
                sexName =  sexEnum.getSexName();
                break;
            }
        }
        return sexName;
    }

    /**
     * 根据sexName获取sexCode
     * 通过循环enum来实现
     * @param sexName
     * @return
     */
    public static String getSexCodeByName(String sexName){
        String sexCode = "sexName不存在";
        SexEnum[] sexEnums = SexEnum.values();
        for (SexEnum sexEnum : sexEnums) {
            if(sexEnum.getSexName().equals(sexName)){
                sexCode =  sexEnum.getSexCode();
                break;
            }
        }
        return sexCode;
    }

    /**
     * 根据sexCode获取SexEnum
     * 通过循环enum来实现
     * @param sexCode
     * @return
     */
    public static SexEnum getEnumByCode(String sexCode){
        SexEnum[] sexEnums = SexEnum.values();
        for (SexEnum sexEnum : sexEnums) {
            if(sexEnum.getSexCode().equals(sexCode)){
                return sexEnum;
            }
        }
        return null;
    }

    /**
     * 重写toString方法
     * @return
     */
    @Override
    public String toString() {
        return this.sexCode + ":" + this.sexName;
    }
}
