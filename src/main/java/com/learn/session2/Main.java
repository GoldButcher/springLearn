/*
 * Copyright (C) 2009-2016 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package com.learn.session2;

import com.learn.session2.impl.CdPlayerImpl;

/**
 * Main
 *
 * @author 花名
 * @since 2018-01-17
 */
public class Main {
    public static void main(String[] args) {
        CdPlayerImpl player = new CdPlayerImpl();
        player.play();
    }
}
