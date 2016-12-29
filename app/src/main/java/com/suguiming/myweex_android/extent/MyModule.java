package com.suguiming.myweex_android.extent;

import android.widget.Toast;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.common.WXModuleAnno;

/**
 * Created by suguiming on 16/12/29.
 */

public class MyModule extends WXModule {

    @WXModuleAnno
    public void showToast(String string){
        Toast.makeText(mWXSDKInstance.getContext(),string,Toast.LENGTH_SHORT).show();
    }

}
