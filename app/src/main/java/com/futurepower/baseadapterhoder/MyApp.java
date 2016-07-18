package com.futurepower.baseadapterhoder;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2016/7/18.
 */
public class MyApp extends Application {

    public static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }
}
