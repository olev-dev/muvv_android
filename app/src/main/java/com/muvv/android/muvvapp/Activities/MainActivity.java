package com.muvv.android.muvvapp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.muvv.android.muvvapp.BasePatterns.BaseActivity;
import com.muvv.android.muvvapp.R;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int setViewForActivityWithId() {
        return R.layout.activity_main;
    }
}
