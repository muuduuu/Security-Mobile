package com.webengage.sdk.android;

import android.content.Context;

/* loaded from: classes2.dex */
public class s1 {

    /* renamed from: a, reason: collision with root package name */
    static r1 f30802a;

    /* renamed from: b, reason: collision with root package name */
    static r1 f30803b;

    private static r1 a() {
        if (f30803b == null) {
            f30803b = new u1();
        }
        return f30803b;
    }

    public static r1 a(Context context) {
        if (!n2.k()) {
            Logger.e("WebEngage", "Unable to initialize location module. Please use play-services-location version 21.0.1 or higher to enable location and geofence features");
            return a();
        }
        if (!v1.a("android.permission.ACCESS_FINE_LOCATION", context.getApplicationContext()) && !v1.a("android.permission.ACCESS_COARSE_LOCATION", context.getApplicationContext())) {
            Logger.w("WebEngage", "Location Tracking is enabled but location permission is not granted to application");
            return a();
        }
        if (f30802a == null) {
            f30802a = new t1(context.getApplicationContext());
        }
        return f30802a;
    }
}
