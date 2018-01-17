/*
 * Copyright (C) 2009-2016 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package com.learn.session1.di;

import com.learn.session1.common.Quest;

import java.io.PrintStream;

/**
 * SlayDragonQuest
 *
 * @author 花名
 * @since 2018-01-16
 */
public class SlayDragonQuest implements Quest{
    private PrintStream printStream;

    public SlayDragonQuest() {
    }

    public SlayDragonQuest(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void embark() {
        printStream.println("slayDragonQuest");
    }
}
