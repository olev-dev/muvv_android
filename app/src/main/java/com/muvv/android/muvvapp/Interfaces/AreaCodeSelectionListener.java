package com.muvv.android.muvvapp.Interfaces;

import com.muvv.android.muvvapp.Model.AreaCodeModel;

import java.util.ArrayList;
import java.util.List;

public class AreaCodeSelectionListener {
    private List<AreaCodeDataListener> listeners = new ArrayList<>();

    private static AreaCodeSelectionListener areCodeSelectionObserver = null;

    public static AreaCodeSelectionListener getInstance() {
        if (areCodeSelectionObserver == null) {
            areCodeSelectionObserver = new AreaCodeSelectionListener();
        }
        return areCodeSelectionObserver;
    }

    public interface AreaCodeDataListener {
        void onAreaSelected(AreaCodeModel areaCodeModel);
    }

    public void connectAreaObserverInterface(AreaCodeDataListener listener) {
        listeners.add(listener);
    }

    public void notifyAreCodeSelected(AreaCodeModel areaCodeModel) {
        for (AreaCodeDataListener listener : listeners) {
            listener.onAreaSelected(areaCodeModel);
        }
    }
}
