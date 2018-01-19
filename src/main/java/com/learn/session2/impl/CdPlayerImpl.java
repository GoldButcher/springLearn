/*
 * Copyright (C) 2009-2016 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package com.learn.session2.impl;

import com.learn.session2.common.Cd;
import com.learn.session2.common.CdPlayer;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * CdPlayerImpl
 *
 * @author 花名
 * @since 2018-01-17
 */
public class CdPlayerImpl implements CdPlayer{

    private Cd sgt;

    public CdPlayerImpl() {
    }

    @Autowired
    public CdPlayerImpl(Cd sgt) {
        this.sgt = sgt;
    }

    public void play() {
        sgt.play();
    }
}
