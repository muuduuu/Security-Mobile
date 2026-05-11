package com.ReactNativeBlobUtil;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.Locale;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f19835a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f19836b;

    /* renamed from: c, reason: collision with root package name */
    public String f19837c;

    /* renamed from: d, reason: collision with root package name */
    public String f19838d;

    /* renamed from: e, reason: collision with root package name */
    public ReadableMap f19839e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f19840f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f19841g;

    /* renamed from: h, reason: collision with root package name */
    public String f19842h;

    /* renamed from: i, reason: collision with root package name */
    public String f19843i;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f19844j;

    /* renamed from: k, reason: collision with root package name */
    public Boolean f19845k;

    /* renamed from: l, reason: collision with root package name */
    public long f19846l;

    /* renamed from: m, reason: collision with root package name */
    public Boolean f19847m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f19848n;

    /* renamed from: o, reason: collision with root package name */
    public ReadableArray f19849o;

    b(ReadableMap readableMap) {
        Boolean bool = Boolean.FALSE;
        this.f19841g = bool;
        Boolean bool2 = Boolean.TRUE;
        this.f19845k = bool2;
        this.f19846l = 60000L;
        this.f19847m = bool;
        this.f19848n = bool2;
        this.f19849o = null;
        if (readableMap == null) {
            return;
        }
        this.f19835a = Boolean.valueOf(readableMap.hasKey("fileCache") && readableMap.getBoolean("fileCache"));
        this.f19836b = Boolean.valueOf(readableMap.hasKey("transformFile") ? readableMap.getBoolean("transformFile") : false);
        this.f19837c = readableMap.hasKey("path") ? readableMap.getString("path") : null;
        this.f19838d = readableMap.hasKey("appendExt") ? readableMap.getString("appendExt") : BuildConfig.FLAVOR;
        this.f19840f = Boolean.valueOf(readableMap.hasKey("trusty") && readableMap.getBoolean("trusty"));
        this.f19841g = Boolean.valueOf(readableMap.hasKey("wifiOnly") && readableMap.getBoolean("wifiOnly"));
        if (readableMap.hasKey("addAndroidDownloads")) {
            this.f19839e = readableMap.getMap("addAndroidDownloads");
        }
        if (readableMap.hasKey("binaryContentTypes")) {
            this.f19849o = readableMap.getArray("binaryContentTypes");
        }
        String str = this.f19837c;
        if (str != null && str.toLowerCase(Locale.ROOT).contains("?append=true")) {
            this.f19845k = bool;
        }
        if (readableMap.hasKey("overwrite")) {
            this.f19845k = Boolean.valueOf(readableMap.getBoolean("overwrite"));
        }
        if (readableMap.hasKey("followRedirect")) {
            this.f19848n = Boolean.valueOf(readableMap.getBoolean("followRedirect"));
        }
        this.f19842h = readableMap.hasKey("key") ? readableMap.getString("key") : null;
        this.f19843i = readableMap.hasKey("contentType") ? readableMap.getString("contentType") : null;
        this.f19847m = Boolean.valueOf(readableMap.hasKey("increment") && readableMap.getBoolean("increment"));
        this.f19844j = Boolean.valueOf(readableMap.hasKey("auto") && readableMap.getBoolean("auto"));
        if (readableMap.hasKey("timeout")) {
            this.f19846l = readableMap.getInt("timeout");
        }
    }
}
