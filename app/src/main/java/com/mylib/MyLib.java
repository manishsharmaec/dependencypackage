package com.mylib;

import android.content.Context;
import android.widget.Toast;

public class MyLib {
    Context context;
    public MyLib(Context context){
        this.context = context;
    }
    public void showToast(String msg){
        Toast.makeText(context,msg,Toast.LENGTH_LONG).show();

    }
}
