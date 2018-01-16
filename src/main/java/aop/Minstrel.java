/*
 * Copyright (C) 2009-2016 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package aop;

import java.io.PrintStream;

/**
 * Minstrel(吟游诗人23333)
 *
 * @author 花名
 * @since 2018-01-16
 */
public class Minstrel {
    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    public Minstrel() {
    }

    public void singBefore(){
        stream.println("start");
    }

    public void singAfter(){
        stream.println("end");
    }
}
