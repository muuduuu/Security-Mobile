package com.webengage.sdk.android.actions.render;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public class CarouselV1CallToAction extends CallToAction {
    private String imageURL;

    public CarouselV1CallToAction(JSONObject jSONObject, String str, String str2) {
        super(jSONObject, jSONObject.optString("actionText"), false, true);
        this.imageURL = str2;
    }

    public String getImageURL() {
        return this.imageURL;
    }

    public void setImageURL(String str) {
        this.imageURL = str;
    }
}
