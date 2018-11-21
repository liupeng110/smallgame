package com.andlp.smallgame;


import com.mob.MobApplication;

import org.xutils.x;

/**
 * 717219917@qq.com   2018/10/26-1:35 AM
 */

public class MyApp extends MobApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(BuildConfig.DEBUG); // 是否输出debug日志, 开启debug会影响性能.
    }
}
