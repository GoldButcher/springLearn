/*
 * Copyright (C) 2009-2016 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package di;

import common.Knight;
import common.Quest;

/**
 * BraveKnight
 *
 * @author 花名
 * @since 2018-01-16
 */
public class BraveKnight implements Knight{

    private Quest quest;

    public BraveKnight() {
    }

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
