package com.muvv.android.muvvapp.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.muvv.android.muvvapp.BasePatterns.BaseActivity;
import com.muvv.android.muvvapp.R;
import com.muvv.android.muvvapp.Utils.FontUtils;

public class StartingScreen extends BaseActivity {

    private TextView letsMuvvTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hideToolBar();
        setupViews();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(StartingScreen.this, LoginActivity.class));
            }
        }, 1000);
    }


    private void setupViews() {
        letsMuvvTxt = findViewById(R.id.lets_muvv_txt);
        FontUtils.setTextViewFontCopperplate(letsMuvvTxt, this);
    }

    @Override
    protected int setViewForActivityWithId() {
        return R.layout.activity_starting_screen;
    }
}
