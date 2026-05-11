package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.measurement.c4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2208c4 {

    /* renamed from: a, reason: collision with root package name */
    static volatile g8.g f24469a = g8.g.a();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f24470b = new Object();

    /* JADX WARN: Can't wrap try/catch for region: R(11:18|(8:20|(1:22)(1:31)|23|(1:25)|27|28|29|30)|32|33|34|35|(1:37)|27|28|29|30) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        if ("com.google.android.gms".equals(r0.packageName) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(Context context, Uri uri) {
        String authority = uri.getAuthority();
        boolean z10 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            Log.e("PhenotypeClientHelper", String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."));
            return false;
        }
        if (f24469a.c()) {
            return ((Boolean) f24469a.b()).booleanValue();
        }
        synchronized (f24470b) {
            try {
                if (f24469a.c()) {
                    return ((Boolean) f24469a.b()).booleanValue();
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
                    if (resolveContentProvider != null) {
                    }
                    f24469a = g8.g.d(Boolean.valueOf(z10));
                    return ((Boolean) f24469a.b()).booleanValue();
                }
                if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                    z10 = true;
                }
                f24469a = g8.g.d(Boolean.valueOf(z10));
                return ((Boolean) f24469a.b()).booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
