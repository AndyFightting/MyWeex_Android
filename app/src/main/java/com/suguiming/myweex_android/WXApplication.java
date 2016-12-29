package com.suguiming.myweex_android;

/**
 * Created by suguiming on 16/12/23.
 */

import android.app.Application;

import com.suguiming.myweex_android.extent.ImageAdapter;
import com.suguiming.myweex_android.extent.MyModule;
import com.suguiming.myweex_android.extent.MyViewComponent;
import com.taobao.weex.InitConfig;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKEngine;

public class WXApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        WXEnvironment.addCustomOptions("weex","weexValue");
        InitConfig config=new InitConfig.Builder().setImgAdapter(new ImageAdapter()).build();
        WXSDKEngine.initialize(this,config);

        try{
            //1.注册组件
            //不能用驼峰命名！大写没效果！在 we 文件里直接用就可以了 <my_view title = "xxx"></my_view>
            //we 里需要设置它的大小，不会自动充满的。
            WXSDKEngine.registerComponent("my_view", MyViewComponent.class);

            //2.注册Module,we 使用前要引用  require('@weex-module/my_module')
            WXSDKEngine.registerModule("my_module", MyModule.class);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}