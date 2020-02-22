package com.simon.interfacedemo;

import java.time.LocalDate;

/**
 * @Description: 职称接口
 * @Author: simon
 * @Date: Created in 2020/2/16 下午4:34
 */
public interface ITitle {

    enum Title{
        /**
         * 一级教师
         */
        FIRST_TITLE("一级教师"),
        /**
         * 二级教师
         */
        SECOND_TITLE("二级教师");
        Title(String name){
            this.name = name;
        }
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * 教师职称方法
     * @return
     */
    String getTitle();
}
