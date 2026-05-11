package com.webengage.sdk.android.actions.database;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.location.Address;
import android.location.Geocoder;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.appsflyer.AdRevenueScheme;
import com.facebook.react.modules.appstate.AppStateModule;
import com.webengage.sdk.android.PushUtils;
import com.webengage.sdk.android.e2;
import com.webengage.sdk.android.utils.WebEngageUtils;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    private Context f30290a;

    c(Context context) {
        this.f30290a = null;
        this.f30290a = context.getApplicationContext();
    }

    String a() {
        try {
            DisplayMetrics c10 = c();
            int i10 = c10.widthPixels;
            int i11 = c10.heightPixels;
            return Math.sqrt((double) ((i10 * i10) + (i11 * i11))) / ((double) c10.densityDpi) < 7.0d ? "Mobile" : "Tablet";
        } catch (Exception unused) {
            return "Mobile";
        }
    }

    Map<String, Object> b() {
        HashMap hashMap = new HashMap();
        PackageInfo e10 = WebEngageUtils.e(this.f30290a);
        hashMap.put("status_airplane_mode", Boolean.valueOf(d.a(this.f30290a)));
        hashMap.put("status_nfc", Boolean.valueOf(d.f(this.f30290a)));
        hashMap.put("status_wifi", d.g(this.f30290a));
        hashMap.put("status_bluetooth", d.b(this.f30290a));
        hashMap.put("status_gps", d.e(this.f30290a));
        hashMap.put("opt_in_push", Boolean.valueOf(PushUtils.checkForPushOptIn(this.f30290a)));
        String a10 = WebEngageUtils.a(this.f30290a);
        if (!a10.isEmpty()) {
            hashMap.put("advertising_id", a10);
        }
        if (e10 != null) {
            hashMap.put("app_installed_on", new Date(e10.firstInstallTime));
        }
        hashMap.put("viewport_height", Integer.valueOf(c().heightPixels));
        hashMap.put("viewport_width", Integer.valueOf(c().widthPixels));
        hashMap.put("language", Locale.getDefault().getDisplayLanguage(Locale.US));
        String c10 = d.c(this.f30290a);
        if (c10 != null && !c10.isEmpty()) {
            hashMap.put("carrier", c10.toUpperCase());
        }
        String d10 = d.d(this.f30290a);
        if (d10 != null && !d10.isEmpty() && !d10.equalsIgnoreCase("UNKNOWN")) {
            hashMap.put("carrier_type", d10);
        }
        hashMap.put("model", Build.MODEL);
        hashMap.put("brand", Build.BRAND);
        hashMap.put("device", Build.DEVICE);
        hashMap.put("manufacturer", Build.MANUFACTURER);
        String str = Build.VERSION.RELEASE;
        hashMap.put("release", str);
        hashMap.put("api_version", Integer.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("os_name", "Android");
        hashMap.put("os_version", str);
        hashMap.put("device_type", a());
        hashMap.put("locale", Locale.getDefault().toString());
        hashMap.put("time_zone", WebEngageUtils.c());
        hashMap.put("tz_name", WebEngageUtils.d());
        if (e10 != null) {
            hashMap.put("app_version", e10.versionName);
            hashMap.put("app_version_code", Integer.valueOf(e10.versionCode));
        }
        return hashMap;
    }

    DisplayMetrics c() {
        WindowManager windowManager = (WindowManager) this.f30290a.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    Map<String, Object> a(Double d10, Double d11) {
        if (d10 != null && d11 != null) {
            try {
                Address address = new Geocoder(this.f30290a, Locale.ENGLISH).getFromLocation(d10.doubleValue(), d11.doubleValue(), 1).get(0);
                HashMap hashMap = new HashMap();
                if (address != null) {
                    if (address.getLocality() != null && !address.getLocality().isEmpty()) {
                        hashMap.put("city", address.getLocality());
                    }
                    if (address.getCountryName() != null && !address.getCountryName().isEmpty()) {
                        hashMap.put(AdRevenueScheme.COUNTRY, address.getCountryName());
                    }
                    if (address.getAdminArea() != null && !address.getAdminArea().isEmpty()) {
                        hashMap.put("region", address.getAdminArea());
                    }
                    if (address.getPostalCode() != null && !address.getPostalCode().isEmpty()) {
                        hashMap.put("postal_code", address.getPostalCode());
                    }
                    if (address.getFeatureName() != null && !address.getFeatureName().isEmpty()) {
                        hashMap.put("locality", address.getSubLocality());
                    }
                }
                return hashMap;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    Map<String, Object> a(Map<String, Object> map, boolean z10) {
        WebEngageUtils.e(this.f30290a);
        e2 e2Var = new e2();
        if (map != null) {
            e2Var.a(map);
        }
        if (z10) {
            e2Var.a("status_airplane_mode", DataHolder.get().b("status_airplane_mode"));
            e2Var.a("status_nfc", DataHolder.get().b("status_nfc"));
            e2Var.a("status_wifi", DataHolder.get().b("status_wifi"));
            e2Var.a("status_bluetooth", DataHolder.get().b("status_bluetooth"));
            e2Var.a("status_gps", DataHolder.get().b("status_gps"));
            e2Var.a("app_installed_on", DataHolder.get().b("app_installed_on"));
            e2Var.a("android_id", DataHolder.get().b("android_id"));
            e2Var.a("advertising_id", DataHolder.get().b("advertising_id"));
            e2Var.put("tz_name", DataHolder.get().b("tz_name"));
            e2Var.a("opt_in_push", DataHolder.get().b("opt_in_push"));
        }
        e2Var.a(AppConstants.LATITUDE, DataHolder.get().r());
        e2Var.a(AppConstants.LONGITUDE, DataHolder.get().t());
        e2Var.a("city", DataHolder.get().f());
        e2Var.a(AdRevenueScheme.COUNTRY, DataHolder.get().g());
        e2Var.a("region", DataHolder.get().x());
        e2Var.a("locality", DataHolder.get().s());
        e2Var.a("postal_code", DataHolder.get().w());
        e2Var.a("total_page_view_count", DataHolder.get().J(), 0L);
        e2Var.a("page_view_count_session", DataHolder.get().E(), 0L);
        if ("online".equalsIgnoreCase(DataHolder.get().q())) {
            e2Var.a("session_type", "online");
            e2Var.a("session_count", DataHolder.get().j(), 0L);
            e2Var.a("screen_name", DataHolder.get().z());
            e2Var.a("screen_title", DataHolder.get().B());
            e2Var.a("screen_path", DataHolder.get().A());
        } else {
            e2Var.a("session_type", AppStateModule.APP_STATE_BACKGROUND);
            e2Var.a("session_count", DataHolder.get().c(), 0L);
        }
        e2Var.a("viewport_height", DataHolder.get().b("viewport_height"));
        e2Var.a("viewport_width", DataHolder.get().b("viewport_width"));
        e2Var.a("language", DataHolder.get().b("language"));
        e2Var.a("carrier", DataHolder.get().b("carrier"));
        e2Var.a("carrier_type", DataHolder.get().b("carrier_type"));
        e2Var.a("model", DataHolder.get().b("model"));
        e2Var.a("brand", DataHolder.get().b("brand"));
        e2Var.a("device", DataHolder.get().b("device"));
        e2Var.a("manufacturer", DataHolder.get().b("manufacturer"));
        e2Var.a("release", DataHolder.get().b("release"));
        e2Var.a("api_version", DataHolder.get().b("api_version"));
        e2Var.a("os_name", DataHolder.get().b("os_name"));
        e2Var.a("os_version", DataHolder.get().b("os_version"));
        e2Var.a("device_type", DataHolder.get().b("device_type"));
        e2Var.a("locale", DataHolder.get().b("locale"));
        e2Var.a("time_zone", DataHolder.get().b("time_zone"));
        e2Var.a("tzo", DataHolder.get().H());
        e2Var.a("app_version", DataHolder.get().b("app_version"));
        e2Var.a("app_version_code", DataHolder.get().b("app_version_code"));
        return e2Var;
    }
}
