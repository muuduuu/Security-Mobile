package com.webengage.sdk.android.actions.render;

import android.content.Context;
import android.net.Uri;
import java.net.URLEncoder;
import java.util.List;
import org.conscrypt.BuildConfig;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class CallToAction {
    private String action;
    private JSONObject customActionJSON;

    /* renamed from: id, reason: collision with root package name */
    private String f30301id;
    private boolean isNative;
    private boolean isPrime;
    private String text;
    private TYPE type;

    public enum TYPE {
        LAUNCH_ACTIVITY("start_activity"),
        LINK("open_url_in_browser"),
        CUSTOM("CUSTOM");


        /* renamed from: s, reason: collision with root package name */
        private String f30302s;

        TYPE(String str) {
            this.f30302s = str;
        }

        public static TYPE valueFromString(String str) {
            try {
                TYPE type = LAUNCH_ACTIVITY;
                if (type.toString().equals(str)) {
                    return type;
                }
                TYPE type2 = LINK;
                if (type2.toString().equals(str)) {
                    return type2;
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f30302s;
        }
    }

    public CallToAction(String str, String str2, String str3, boolean z10, boolean z11) {
        this.type = null;
        this.customActionJSON = null;
        this.f30301id = str;
        this.text = str2;
        this.action = str3;
        this.isPrime = z10;
        this.isNative = z11;
        if (str3 != null) {
            List<String> pathSegments = Uri.parse(str3).getPathSegments();
            if (pathSegments.size() > 0) {
                this.type = TYPE.valueFromString(pathSegments.get(0));
            }
        }
    }

    public String getAction() {
        String str = this.action;
        if (str == null) {
            return null;
        }
        List<String> pathSegments = Uri.parse(str).getPathSegments();
        if (pathSegments.size() > 1) {
            return pathSegments.get(1);
        }
        return null;
    }

    public JSONObject getCustomActionJSON() {
        return this.customActionJSON;
    }

    protected String getFullActionUri() {
        return this.action;
    }

    public String getId() {
        return this.f30301id;
    }

    public String getText() {
        return this.text;
    }

    public TYPE getType() {
        return this.type;
    }

    public boolean isNative() {
        return this.isNative;
    }

    public boolean isPrimeAction() {
        return this.isPrime;
    }

    public void setAction(String str, TYPE type, Context context) {
        try {
            this.action = "webengage://" + context.getPackageName() + "/" + type.toString() + "/" + URLEncoder.encode(str, "UTF-8");
        } catch (Exception unused) {
            this.action = "webengage://" + context.getPackageName() + "/" + TYPE.LAUNCH_ACTIVITY.toString() + "/" + context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()).getComponent().getClassName();
        }
        this.type = type;
    }

    public void setCustomActionJSON(JSONObject jSONObject) {
        this.customActionJSON = jSONObject;
    }

    public void setText(String str) {
        this.text = str;
    }

    public CallToAction(JSONObject jSONObject, String str, boolean z10, boolean z11) {
        TYPE valueFromString;
        this.f30301id = null;
        this.text = null;
        this.action = null;
        this.isPrime = false;
        this.type = null;
        this.isNative = false;
        this.customActionJSON = null;
        this.f30301id = jSONObject.optString("id");
        this.text = str;
        this.action = jSONObject.optString("actionLink", BuildConfig.FLAVOR);
        this.isPrime = z10;
        this.isNative = z11;
        if (!"CUSTOM".equals(jSONObject.optString("type"))) {
            List<String> pathSegments = Uri.parse(this.action).getPathSegments();
            valueFromString = pathSegments.size() > 0 ? TYPE.valueFromString(pathSegments.get(0)) : valueFromString;
            this.customActionJSON = jSONObject.optJSONObject("ca");
        }
        valueFromString = TYPE.CUSTOM;
        this.type = valueFromString;
        this.customActionJSON = jSONObject.optJSONObject("ca");
    }
}
