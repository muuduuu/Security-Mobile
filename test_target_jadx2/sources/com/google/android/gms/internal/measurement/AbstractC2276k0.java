package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.internal.measurement.k0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2276k0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f24545a = new C2267j0();

    public static SharedPreferences a(Context context, String str, int i10, AbstractC2231f0 abstractC2231f0) {
        Z.a();
        SharedPreferencesC2258i0 sharedPreferencesC2258i0 = str.equals(BuildConfig.FLAVOR) ? new SharedPreferencesC2258i0() : null;
        if (sharedPreferencesC2258i0 != null) {
            return sharedPreferencesC2258i0;
        }
        ThreadLocal threadLocal = f24545a;
        g8.h.d(((Boolean) threadLocal.get()).booleanValue());
        threadLocal.set(Boolean.FALSE);
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            threadLocal.set(Boolean.TRUE);
            return sharedPreferences;
        } catch (Throwable th) {
            f24545a.set(Boolean.TRUE);
            throw th;
        }
    }
}
