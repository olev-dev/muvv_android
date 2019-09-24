package com.muvv.android.muvvapp.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.muvv.android.muvvapp.BasePatterns.BaseActivity;
import com.muvv.android.muvvapp.Interfaces.AreaCodeSelectionListener;
import com.muvv.android.muvvapp.Model.AreaCodeModel;
import com.muvv.android.muvvapp.R;
import com.muvv.android.muvvapp.Utils.FontUtils;

public class LoginActivity extends BaseActivity implements AreaCodeSelectionListener.AreaCodeDataListener {

    private TextView loginScreenNextBtn;
    private TextView loginScreenInfoTxt;
    private EditText mobileNumberEt;
    private TextView countryCodeTv;
    private CardView countryCodeCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hideToolBar();
        setupViews();
        setupFonts();
        setupListeners();
        AreaCodeSelectionListener.getInstance().connectAreaObserverInterface(this);
    }


    private void setupViews() {
        loginScreenNextBtn = findViewById(R.id.login_screen_next_btn);
        loginScreenInfoTxt = findViewById(R.id.login_screen_info_txt);
        mobileNumberEt = findViewById(R.id.mobile_number_et);
        countryCodeTv = findViewById(R.id.country_code_tv);
        countryCodeCard = findViewById(R.id.country_code_card);
    }


    private void setupFonts() {
        FontUtils.setTextViewFontTiTilliumSemiBold(loginScreenNextBtn, this);
        FontUtils.setTextViewFontTiTilliumRegular(loginScreenInfoTxt, this);
        FontUtils.setTextViewFontTiTilliumRegular(mobileNumberEt, this);
        FontUtils.setTextViewFontTiTilliumRegular(countryCodeTv, this);
    }

    private void setupListeners() {
        countryCodeCard.setOnClickListener(view -> startActivity(new Intent(LoginActivity.this, AreaCodeActivity.class)));
    }

    @Override
    protected int setViewForActivityWithId() {
        return R.layout.activity_login;
    }

    @Override
    public void onAreaSelected(AreaCodeModel areaCodeModel) {
        countryCodeTv.setText(areaCodeModel.getAreaCode());
    }
}
