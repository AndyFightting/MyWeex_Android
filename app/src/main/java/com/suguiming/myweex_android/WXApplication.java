package com.suguiming.myweex_android;

/**
 * Created by suguiming on 16/12/23.
 */

import android.app.Application;
import com.taobao.weex.InitConfig;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKEngine;

public class WXApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        WXEnvironment.addCustomOptions("weex_android","TBSample");
        InitConfig config=new InitConfig.Builder().setImgAdapter(new ImageAdapter()).build();
        WXSDKEngine.initialize(this,config);
    }
}