package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import j8.C3511e;
import java.util.List;

/* loaded from: classes2.dex */
class M {

    /* renamed from: a, reason: collision with root package name */
    private final Context f28081a;

    /* renamed from: b, reason: collision with root package name */
    private String f28082b;

    /* renamed from: c, reason: collision with root package name */
    private String f28083c;

    /* renamed from: d, reason: collision with root package name */
    private int f28084d;

    /* renamed from: e, reason: collision with root package name */
    private int f28085e = 0;

    M(Context context) {
        this.f28081a = context;
    }

    static String c(C3511e c3511e) {
        String f10 = c3511e.q().f();
        if (f10 != null) {
            return f10;
        }
        String c10 = c3511e.q().c();
        if (!c10.startsWith("1:")) {
            return c10;
        }
        String[] split = c10.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private PackageInfo f(String str) {
        try {
            return this.f28081a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Failed to find package " + e10);
            return null;
        }
    }

    private synchronized void h() {
        PackageInfo f10 = f(this.f28081a.getPackageName());
        if (f10 != null) {
            this.f28082b = Integer.toString(f10.versionCode);
            this.f28083c = f10.versionName;
        }
    }

    synchronized String a() {
        try {
            if (this.f28082b == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f28082b;
    }

    synchronized String b() {
        try {
            if (this.f28083c == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f28083c;
    }

    synchronized int d() {
        PackageInfo f10;
        try {
            if (this.f28084d == 0 && (f10 = f("com.google.android.gms")) != null) {
                this.f28084d = f10.versionCode;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f28084d;
    }

    synchronized int e() {
        int i10 = this.f28085e;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f28081a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!com.google.android.gms.common.util.m.e()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f28085e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f28085e = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (com.google.android.gms.common.util.m.e()) {
            this.f28085e = 2;
        } else {
            this.f28085e = 1;
        }
        return this.f28085e;
    }

    boolean g() {
        return e() != 0;
    }
}
