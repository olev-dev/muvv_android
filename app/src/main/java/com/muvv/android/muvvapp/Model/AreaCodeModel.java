package com.muvv.android.muvvapp.Model;

public class AreaCodeModel {

    private int drawableId;
    private String shortCode;
    private String longDesc;
    private String areaCode;

    public AreaCodeModel(int drawableId, String shortCode, String longDesc, String areaCode) {
        this.drawableId = drawableId;
        this.shortCode = shortCode;
        this.longDesc = longDesc;
        this.areaCode = areaCode;
    }

    public int getDrawableId() {
        return drawableId;
    }

    public void setDrawableId(int drawableId) {
        this.drawableId = drawableId;
    }

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public String getLongDesc() {
        return longDesc;
    }

    public void setLongDesc(String longDesc) {
        this.longDesc = longDesc;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
}
