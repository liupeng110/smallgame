package com.andlp.smallgame.activity;

import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;

import com.alibaba.fastjson.JSON;
import com.andlp.smallgame.R;
import com.andlp.smallgame.bean.Bean_KV;

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
//       login();
       kv_save();
//       kv_select();
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

    private void kv_save(){
        RequestParams params=new RequestParams("http://apicloud.mob.com/ucache/put");
        params.addBodyParameter("key","1f033a797d7c3");
        params.addBodyParameter("table","tb");
        params.addBodyParameter("k",new String(Base64.encode("test".getBytes(),Base64.URL_SAFE)));
        params.addBodyParameter("v",new String(Base64.encode("6667".getBytes(),Base64.URL_SAFE)));
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                Log.e("login","保存结果："+result);
//                Toasty.success(MainActivity.this,result).show();
                kv_select();
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
    private void kv_select(){
        RequestParams params=new RequestParams("http://apicloud.mob.com/ucache/get");
        params.addBodyParameter("key","1f033a797d7c3");
        params.addBodyParameter("table","tb");
        params.addBodyParameter("k",new String(Base64.encode("test".getBytes(),Base64.URL_SAFE)));
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                Log.e("login","查询结果："+result);
               Bean_KV bean_kv= JSON.parseObject(result,Bean_KV.class);
                Log.e("login","查询结果2："+bean_kv.toString());
               if (bean_kv.getRetCode().equals("200")){
                   String v=bean_kv.getResult().getV();
                   Toasty.success(MainActivity.this,v).show();
               }else {
                   Toasty.success(MainActivity.this,bean_kv.getMsg()).show();
               }

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
