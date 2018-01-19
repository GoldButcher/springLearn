/*
 * Copyright (C) 2009-2016 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package com.learn.session2.impl;

import com.learn.session2.common.Cd;
import org.springframework.stereotype.Component;

/**
 * SgtPeppers
 *
 * @author 花名
 * @since 2018-01-17
 */
@Component
public class SgtPeppers implements Cd{
    private static String title="title";
    private static String artist = "The Beatles";
    public void play() {
        System.out.println(title+artist);
    }
}
