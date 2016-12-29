package com.suguiming.myweex_android.extent;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.suguiming.myweex_android.R;

/**
 * Created by suguiming on 16/12/29.
 */

public class MyView extends LinearLayout implements View.OnClickListener{

    private Context mContext;
    private Button myBt;
    private TextView myTv;

    public MyView(Context context){
        super(context,null);
        mContext = context;
        LayoutInflater.from(context).inflate(R.layout.my_view, this);
        initView();
    }

    private void initView(){
        myTv = (TextView) findViewById(R.id.my_tv);
        myBt = (Button) findViewById(R.id.my_bt);
        myBt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(mContext,"这是 Native 调用", Toast.LENGTH_SHORT).show();
    }

    public void setTitle(String string){
        myTv.setText(string);
    }
}
