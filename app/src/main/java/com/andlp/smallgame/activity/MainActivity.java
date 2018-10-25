package com.andlp.smallgame.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.andlp.smallgame.R;
import com.andlp.smallgame.activity.Activity_Base;

import org.xutils.view.annotation.ContentView;

@ContentView(R.layout.activity_main)
public class MainActivity extends Activity_Base {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    //获取验证码
   public void getverfiycode(View view){
       Log.e("login","点击获取验证码");

   }




}
