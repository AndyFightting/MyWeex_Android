package com.suguiming.myweex_android.extent;

import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.dom.WXDomObject;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXComponentProp;
import com.taobao.weex.ui.component.WXVContainer;

/**
 * Created by suguiming on 16/12/29.
 */

public class  MyViewComponent extends WXComponent{

    private MyView myView;

    public MyViewComponent(WXSDKInstance instance, WXDomObject dom, WXVContainer parent, boolean isLazy) {
        super(instance, dom, parent, isLazy);
        myView = new MyView(mContext);
    }

    @Override
    protected void initView() {
        mHost = myView;
    }

    @WXComponentProp(name = "title")
    public void setTitle(String string){
        myView.setTitle(string);
    }
}