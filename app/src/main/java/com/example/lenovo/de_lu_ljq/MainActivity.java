package com.example.lenovo.de_lu_ljq;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lenovo.de_lu_ljq.utils.SharedUtils;

public class MainActivity extends AppCompatActivity {
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 0:
                    Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                    startActivity(intent);
                    finish();
                    break;

                case 1:
                    Intent intent2 = new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(intent2);
                    finish();
                    break;

                default:
                    break;
            }
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //调用工具类判断保存的布尔值3
        boolean b = SharedUtils.getBooleanData(MainActivity.this, "flag", false);

        if (b) {    //已经进入过，现在是第二次
            handler.sendEmptyMessageDelayed(0, 0);
        } else {        //现在是第一次
            SharedUtils.savaBooleanData(MainActivity.this, "flag", true);
            handler.sendEmptyMessageDelayed(1, 0);
        }
    }}