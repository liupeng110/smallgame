package com.andlp.smallgame.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.andlp.smallgame.R;
import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.view.annotation.ContentView;
import org.xutils.x;

import es.dmoral.toasty.Toasty;

@ContentView(R.layout.activity_main)
public class MainActivity extends Activity_Base {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    //获取验证码
   public void getverfiycode(View view){
       Log.e("login","点击获取验证码");
//       register();
       login();
   }

private  void register(){
    RequestParams params=new RequestParams("http://apicloud.mob.com/user/rigister");
         params.addBodyParameter("key","1f033a797d7c3");
         params.addBodyParameter("username","666");
         params.addBodyParameter("password","666");
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                Log.e("login","注册结果："+result);
                Toasty.success(MainActivity.this,result).show();
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
}

    private void login(){
        RequestParams params=new RequestParams("http://apicloud.mob.com/user/login");
        params.addBodyParameter("key","1f033a797d7c3");
        params.addBodyParameter("username","666");
        params.addBodyParameter("password","666");
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                Log.e("login","注册结果："+result);
                Toasty.success(MainActivity.this,result).show();
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });

    }


}
