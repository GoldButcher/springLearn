/*
 * Copyright (C) 2009-2016 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package session2;

import com.learn.session2.Config;
import com.learn.session2.common.Cd;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * ScanTest
 *
 * @author 花名
 * @since 2018-01-17
 */
@ContextConfiguration(classes = Config.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class ScanTest {
    @Resource
    private Cd sgtPeppers;
    @Test
    public void test(){
        sgtPeppers.play();
    }
}
