package com.muvv.android.muvvapp.BasePatterns;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.muvv.android.muvvapp.R;
import com.muvv.android.muvvapp.Utils.FontUtils;

public abstract class BaseActivity extends AppCompatActivity {

    private TextView toolBarTitleTxt;
    private ImageView toolBarBackImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        makeFullScreenActivity();
        setContentView(setViewForActivityWithId());
    }

    protected abstract int setViewForActivityWithId();

    private void makeTransParentStatusBar() {
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
    }

    private void makeFullScreenActivity(){
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    @Override
    public void setContentView(int layoutResID) {
        View fullView = getLayoutInflater().inflate(R.layout.activity_base, null);
        FrameLayout activityContainer = fullView.findViewById(R.id.activity_container);
        getLayoutInflater().inflate(layoutResID, activityContainer, true);
        super.setContentView(fullView);
        setToolBar();
    }


    private void setToolBar() {
        Toolbar toolbar = findViewById(R.id.tool_bar);
        toolBarTitleTxt = findViewById(R.id.tool_bar_title_txt);
        toolBarBackImg = findViewById(R.id.tool_bar_back_img);
        setSupportActionBar(toolbar);
        setBackListenerForToolbar();
    }

    private void setBackListenerForToolbar(){
        toolBarBackImg.setOnClickListener(view -> onBackPressed());
    }

    public void setToolBarText(String title) {
        if (toolBarTitleTxt != null) {
            toolBarTitleTxt.setText(title);
            FontUtils.setTextViewFontTiTilliumRegular(toolBarTitleTxt, this);
        }
    }

    public void hideToolBar() {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null)
            actionBar.hide();
    }

}
