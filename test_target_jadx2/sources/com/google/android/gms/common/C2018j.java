package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import d7.C2998d;

/* renamed from: com.google.android.gms.common.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2018j {

    /* renamed from: a, reason: collision with root package name */
    public static final int f23505a = AbstractC2022n.f23510a;

    /* renamed from: b, reason: collision with root package name */
    private static final C2018j f23506b = new C2018j();

    C2018j() {
    }

    public static C2018j h() {
        return f23506b;
    }

    public void a(Context context) {
        AbstractC2022n.a(context);
    }

    public int b(Context context) {
        return AbstractC2022n.c(context);
    }

    public Intent c(int i10) {
        return d(null, i10, null);
    }

    public Intent d(Context context, int i10, String str) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && com.google.android.gms.common.util.j.d(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("gcore_");
        sb2.append(f23505a);
        sb2.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
        }
        sb2.append("-");
        if (context != null) {
            sb2.append(context.getPackageName());
        }
        sb2.append("-");
        if (context != null) {
            try {
                sb2.append(C2998d.a(context).e(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String sb3 = sb2.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(sb3)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", sb3);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    public PendingIntent e(Context context, int i10, int i11) {
        return f(context, i10, i11, null);
    }

    public PendingIntent f(Context context, int i10, int i11, String str) {
        Intent d10 = d(context, i10, str);
        if (d10 == null) {
            return null;
        }
        return androidx.core.app.y.b(context, i11, d10, 134217728, false);
    }

    public String g(int i10) {
        return AbstractC2022n.d(i10);
    }

    public int i(Context context) {
        return j(context, f23505a);
    }

    public int j(Context context, int i10) {
        int i11 = AbstractC2022n.i(context, i10);
        if (AbstractC2022n.j(context, i11)) {
            return 18;
        }
        return i11;
    }

    public boolean k(Context context, int i10) {
        return AbstractC2022n.j(context, i10);
    }

    public boolean l(Context context, String str) {
        return AbstractC2022n.n(context, str);
    }

    public boolean m(int i10) {
        return AbstractC2022n.l(i10);
    }
}
