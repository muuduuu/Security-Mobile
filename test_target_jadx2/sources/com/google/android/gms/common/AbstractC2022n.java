package com.google.android.gms.common;

import V6.AbstractC1287s;
import V6.h0;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import d7.C2998d;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.common.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2022n {

    /* renamed from: a, reason: collision with root package name */
    public static final int f23510a = 12451000;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f23512c = false;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f23513d = false;

    /* renamed from: b, reason: collision with root package name */
    static final AtomicBoolean f23511b = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicBoolean f23514e = new AtomicBoolean();

    public static void a(Context context) {
        if (f23511b.getAndSet(true)) {
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.cancel(10436);
            }
        } catch (SecurityException e10) {
            Log.d("GooglePlayServicesUtil", "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications.", e10);
        }
    }

    public static void b(Context context, int i10) {
        int j10 = C2018j.h().j(context, i10);
        if (j10 != 0) {
            Intent d10 = C2018j.h().d(context, j10, "e");
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 46);
            sb2.append("GooglePlayServices not available due to error ");
            sb2.append(j10);
            Log.e("GooglePlayServicesUtil", sb2.toString());
            if (d10 != null) {
                throw new C2020l(j10, "Google Play Services not available", d10);
            }
            throw new C2019k(j10);
        }
    }

    public static int c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    public static String d(int i10) {
        return C2010b.g1(i10);
    }

    public static Context e(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static Resources f(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean g(Context context) {
        try {
            if (!f23513d) {
                try {
                    PackageInfo e10 = C2998d.a(context).e("com.google.android.gms", Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
                    r.a(context);
                    if (e10 == null || r.d(e10, false) || !r.d(e10, true)) {
                        f23512c = false;
                    } else {
                        f23512c = true;
                    }
                    f23513d = true;
                } catch (PackageManager.NameNotFoundException e11) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e11);
                    f23513d = true;
                }
            }
            return f23512c || !com.google.android.gms.common.util.j.b();
        } catch (Throwable th) {
            f23513d = true;
            throw th;
        }
    }

    public static int h(Context context) {
        return i(context, f23510a);
    }

    public static int i(Context context, int i10) {
        PackageInfo packageInfo;
        try {
            context.getResources().getString(AbstractC2026s.f23518a);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f23514e.get()) {
            int a10 = h0.a(context);
            if (a10 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (a10 != f23510a) {
                throw new GooglePlayServicesIncorrectManifestValueException(a10);
            }
        }
        boolean z10 = (com.google.android.gms.common.util.j.d(context) || com.google.android.gms.common.util.j.g(context)) ? false : true;
        AbstractC1287s.a(i10 >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z10) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", Build.VERSION.SDK_INT >= 28 ? 134225984 : 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
            r.a(context);
            if (r.d(packageInfo2, true)) {
                if (z10) {
                    AbstractC1287s.m(packageInfo);
                    if (!r.d(packageInfo, true)) {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                    }
                }
                if (!z10 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    if (com.google.android.gms.common.util.t.a(packageInfo2.versionCode) >= com.google.android.gms.common.util.t.a(i10)) {
                        ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            try {
                                applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                            } catch (PackageManager.NameNotFoundException e10) {
                                Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e10);
                                return 1;
                            }
                        }
                        return !applicationInfo.enabled ? 3 : 0;
                    }
                    int i11 = packageInfo2.versionCode;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i10).length() + 11 + String.valueOf(i11).length());
                    sb2.append("Google Play services out of date for ");
                    sb2.append(packageName);
                    sb2.append(".  Requires ");
                    sb2.append(i10);
                    sb2.append(" but found ");
                    sb2.append(i11);
                    Log.w("GooglePlayServicesUtil", sb2.toString());
                    return 2;
                }
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
            } else {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            }
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            return 1;
        }
    }

    public static boolean j(Context context, int i10) {
        if (i10 == 18) {
            return true;
        }
        if (i10 == 1) {
            return n(context, "com.google.android.gms");
        }
        return false;
    }

    public static boolean k(Context context) {
        Object systemService = context.getSystemService("user");
        AbstractC1287s.m(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    public static boolean l(int i10) {
        return i10 == 1 || i10 == 2 || i10 == 3 || i10 == 9;
    }

    public static boolean m(Context context, int i10, String str) {
        return com.google.android.gms.common.util.r.b(context, i10, str);
    }

    static boolean n(Context context, String str) {
        ApplicationInfo applicationInfo;
        boolean equals = str.equals("com.google.android.gms");
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException | Exception unused) {
        }
        return equals ? applicationInfo.enabled : applicationInfo.enabled && !k(context);
    }
}
