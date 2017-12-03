package com.handsome.fastmenubar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Wechat(View view) {
        startActivity(new Intent(this, WechatActivity.class));
    }

    public void Office(View view) {
        startActivity(new Intent(this, OfficeActivity.class));
    }

    public void Business(View view) {
        startActivity(new Intent(this, BusinessActivity.class));
    }

    public void Colorful(View view) {
        startActivity(new Intent(this, ColorfulActivity.class));
    }
}
