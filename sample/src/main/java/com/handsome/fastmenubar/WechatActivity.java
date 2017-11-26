package com.handsome.fastmenubar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.handsome.library.FastMenuBar;

public class WechatActivity extends AppCompatActivity implements FastMenuBar.onMenuBarClickListener {

    private FastMenuBar fmb_money;
    private FastMenuBar fmb_collect;
    private FastMenuBar fmb_photo;
    private FastMenuBar fmb_card;
    private FastMenuBar fmb_smail;
    private FastMenuBar fmb_setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wechat);

        fmb_money = (FastMenuBar) findViewById(R.id.fmb_money);
        fmb_collect = (FastMenuBar) findViewById(R.id.fmb_collect);
        fmb_photo = (FastMenuBar) findViewById(R.id.fmb_photo);
        fmb_card = (FastMenuBar) findViewById(R.id.fmb_card);
        fmb_smail = (FastMenuBar) findViewById(R.id.fmb_smail);
        fmb_setting = (FastMenuBar) findViewById(R.id.fmb_setting);
        fmb_money.setOnMenuBarClickListener(this);
        fmb_collect.setOnMenuBarClickListener(this);
        fmb_photo.setOnMenuBarClickListener(this);
        fmb_card.setOnMenuBarClickListener(this);
        fmb_smail.setOnMenuBarClickListener(this);
        fmb_setting.setOnMenuBarClickListener(this);

        fmb_smail.setMenuBarMessage("新表情");
    }

    @Override
    public void onMenuBarClick(FastMenuBar v) {
        switch (v.getId()) {
            case R.id.fmb_money:
                Toast.makeText(this, v.getMenuBarTitle(), Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(this, v.getMenuBarTitle(), Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
