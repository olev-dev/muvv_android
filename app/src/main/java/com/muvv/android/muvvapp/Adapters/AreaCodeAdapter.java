package com.muvv.android.muvvapp.Adapters;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.muvv.android.muvvapp.BasePatterns.BaseActivity;
import com.muvv.android.muvvapp.Interfaces.AreaCodeSelectionListener;
import com.muvv.android.muvvapp.Model.AreaCodeModel;
import com.muvv.android.muvvapp.Model.ModelContainer;
import com.muvv.android.muvvapp.R;
import com.muvv.android.muvvapp.Utils.FontUtils;

public class AreaCodeAdapter extends BaseAdapter {

    private BaseActivity baseActivity;
    private LayoutInflater inflater;

    public AreaCodeAdapter(BaseActivity baseActivity) {
        this.baseActivity = baseActivity;
        inflater = LayoutInflater.from(baseActivity);
    }

    @Override
    public int getCount() {
        return ModelContainer.areaCodeModels.length;
    }

    @Override
    public AreaCodeModel getItem(int i) {
        return ModelContainer.areaCodeModels[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        @SuppressLint("ViewHolder") View v = inflater.inflate(R.layout.item_area_code_view, null);
        TextView txt_area_code = v.findViewById(R.id.txt_area_code);
        ImageView img_area_code = v.findViewById(R.id.img_area_code);
        img_area_code.setImageResource(getItem(i).getDrawableId());
        txt_area_code.setText(getItem(i).getLongDesc());
        FontUtils.setTextViewFontTiTilliumRegular(txt_area_code, baseActivity);
        v.setOnClickListener(view1 -> {
            AreaCodeSelectionListener.getInstance().notifyAreCodeSelected(ModelContainer.areaCodeModels[i]);
            baseActivity.finish();
        });
        return v;
    }
}
