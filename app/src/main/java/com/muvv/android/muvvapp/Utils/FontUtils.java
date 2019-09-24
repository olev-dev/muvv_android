package com.muvv.android.muvvapp.Utils;

import android.graphics.Typeface;
import android.widget.TextView;

import com.muvv.android.muvvapp.BasePatterns.BaseActivity;

public class FontUtils {

    public static void setTextViewFontCopperplate(TextView textView, BaseActivity baseActivity) {

        try {
            Typeface custom_font = Typeface.createFromAsset(baseActivity.getAssets(), "fonts/Copperplate.ttf");
            textView.setTypeface(custom_font);
        } catch (Exception e) {
            e.printStackTrace();
        }

    } public static void setTextViewFontTiTilliumLight(TextView textView, BaseActivity baseActivity) {

        try {
            Typeface custom_font = Typeface.createFromAsset(baseActivity.getAssets(), "fonts/titillium_web_light.ttf");
            textView.setTypeface(custom_font);
        } catch (Exception e) {
            e.printStackTrace();
        }

    } public static void setTextViewFontTiTilliumRegular(TextView textView, BaseActivity baseActivity) {

        try {
            Typeface custom_font = Typeface.createFromAsset(baseActivity.getAssets(), "fonts/titillium_web_regular.ttf");
            textView.setTypeface(custom_font);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void setTextViewFontTiTilliumSemiBold(TextView textView, BaseActivity baseActivity) {

        try {
            Typeface custom_font = Typeface.createFromAsset(baseActivity.getAssets(), "fonts/titillium_web_semibold.ttf");
            textView.setTypeface(custom_font);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
