package com.muvv.android.muvvapp.Activities;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;

import androidx.cardview.widget.CardView;

import com.muvv.android.muvvapp.Adapters.AreaCodeAdapter;
import com.muvv.android.muvvapp.BasePatterns.BaseActivity;
import com.muvv.android.muvvapp.Interfaces.AreaCodeSelectionListener;
import com.muvv.android.muvvapp.Model.ModelContainer;
import com.muvv.android.muvvapp.R;

public class AreaCodeActivity extends BaseActivity {

    private ListView areaCodeListLyt;
    private LinearLayout unitedStateKingdomLyt;
    private LinearLayout franceLyt;
    private LinearLayout turkeyLyt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupViews();
        setupRestOfCountryCodes();
        setToolBarText("AREA CODE");
        setStaticLytListeners();
    }

    private void setupViews() {
        areaCodeListLyt = findViewById(R.id.area_code_list_lyt);
        turkeyLyt = findViewById(R.id.turkey_lyt);
        unitedStateKingdomLyt = findViewById(R.id.united_state_kingdom_lyt);
        franceLyt = findViewById(R.id.france_lyt);
    }


    private void setStaticLytListeners(){
        franceLyt.setOnClickListener(view -> {
            AreaCodeSelectionListener.getInstance().notifyAreCodeSelected(ModelContainer.areaCodeModels[6]);
            finish();
        });

        unitedStateKingdomLyt.setOnClickListener(view -> {
            AreaCodeSelectionListener.getInstance().notifyAreCodeSelected(ModelContainer.areaCodeModels[3]);
            finish();
        });

        turkeyLyt.setOnClickListener(view -> {
            AreaCodeSelectionListener.getInstance().notifyAreCodeSelected(ModelContainer.areaCodeModels[5]);
            finish();
        });
    }

    @Override
    protected int setViewForActivityWithId() {
        return R.layout.activity_area_code;
    }

    private void setupRestOfCountryCodes() {
        areaCodeListLyt.setAdapter(new AreaCodeAdapter(this));
    }

}
