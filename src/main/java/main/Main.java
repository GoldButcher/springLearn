/*
 * Copyright (C) 2009-2016 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package main;

import common.Knight;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Main
 *
 * @author 花名
 * @since 2018-01-16
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:knight.xml");
        Knight bean = classPathXmlApplicationContext.getBean(Knight.class);
        bean.embarkOnQuest();
    }
}
